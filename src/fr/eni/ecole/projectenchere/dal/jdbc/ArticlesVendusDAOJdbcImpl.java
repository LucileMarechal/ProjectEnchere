package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.bo.Categories;
import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;

public class ArticlesVendusDAOJdbcImpl implements ArticlesVendusDAO {
	
	// constantes
	// INSERT ARTICLES VENDUS : no_article auto incrémenté : PK
	private static final String INSERT_ARTICLES_VENDUS = "INSERT INTO articles_vendus(nom_article, description, "
			+ "date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
	
	private static final String SELECT_ARTICLES_VENDUS = "SELECT no_article, nom_article, description, date_debut_encheres, date_fin_encheres, "
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie, no_retrait FROM articles_vendus";
	
	private static final String SELECT_ARTICLE_PLUS_UTILISATEUR = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo\r\n" + 
			"FROM ARTICLES_VENDUS\r\n" + 
			"INNER JOIN UTILISATEURS ON  ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur\r\n"
			+ "WHERE date_fin_encheres > getdate()";

	
	private static final String SELECT_BY_NAME = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo\r\n" + 
			"FROM ARTICLES_VENDUS\r\n" + 
			"INNER JOIN UTILISATEURS ON  ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur\r\n" + 
			"WHERE nom_article like ? AND date_fin_encheres > getdate()";
	
	private static final String SELECT_BY_CATEGORIE = "SELECT nom_article, prix_initial, date_fin_encheres, pseudo, ARTICLES_VENDUS.no_categorie\r\n" + 
			"FROM ARTICLES_VENDUS\r\n" + 
			"INNER JOIN UTILISATEURS ON  ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur\r\n" + 
			"INNER JOIN CATEGORIES ON CATEGORIES.no_categorie = ARTICLES_VENDUS.no_categorie\r\n" + 
			"WHERE CATEGORIES.no_categorie like ? AND date_fin_encheres > getdate()";
	
	
	private static final String SELECT_BY_ID = "SELECT no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, "
			+ "prix_vente,no_utilisateur, no_categorie, no_retrait FROM articles_vendus where no_article = ?";
	
	private static final String UPDATE_ARTICLES_VENDUS ="UPDATE articles_vendus SET no_article=?, nom_article=?, date_debut_encheres=?, "
			+ "date_fin_encheres=?, prix_initial=?, prix_vente,no_utilisateur=?, no_categorie=?, no_retrait=? WHERE no_article=?";
	
	private static final String DELETE_ARTICLES_VENDUS ="DELETE FROM articles_vendus WHERE no_article=?";

	/**
	 * Cette methode permet d'inserer un nouvel article en vente<br>
	 * avec l'id de l'utilisateur qui le met en vente et la categorie de l'article
	 */
	@Override
	public void insert(ArticleVendu articleVendu) throws DALException {
		Connection cnx=null;
		PreparedStatement pstmt=null;
		int nbLigne=0;
		
		cnx = DBConnexion.seConnecter();
		
		try {
			cnx.setAutoCommit(false);
			pstmt=cnx.prepareStatement(INSERT_ARTICLES_VENDUS);
			pstmt.setString(1, articleVendu.getNomArticle());
			pstmt.setString(2, articleVendu.getDescription());
			pstmt.setDate(3, articleVendu.getDateDebutEncheres());
			pstmt.setDate(4, articleVendu.getDateFinEncheres());
			
			//Le prix pouvant �tre null je test s'il n'est pas null
			if (articleVendu.getPrixInitial()!=null) {
				pstmt.setInt(5, articleVendu.getPrixInitial());
			}
			if (articleVendu.getPrixVente()!=null) {
				pstmt.setInt(6, articleVendu.getPrixVente());
			}
			//*****************************************************
			pstmt.setObject(7, articleVendu.getNoUtilisateur());
			pstmt.setObject(8, articleVendu.getNoCategorie());
			
			nbLigne=pstmt.executeUpdate();
			if (nbLigne==1) {
				cnx.commit();
			}else {
				cnx.rollback();
				throw new DALException("ROLLBACK");//je ne sais pas ce qui se passe dans ce cas
			}
		} catch (SQLException e) {
			throw new DALException("Probleme sur la m�thode ajouter INSERT_ARTICLES_VENDUS - "+e);
		}finally {
			try {
				cnx.setAutoCommit(true);
				DBConnexion.seDeconnecter(cnx, pstmt);
			} catch (SQLException e) {
				throw new DALException("Probleme sur la d�connexion");
			}
		}
	}

	@Override
	public void update(ArticleVendu articleVendu) throws DALException {

		
		
	}

	/**
	 * Cette methode permet de selectionner un article via sa PK no_article en BDD
	 */
	@Override
	public ArticleVendu selectById(Integer no_article) throws DALException {
		ResultSet rs=null;
		ArticleVendu artVendu=null;
		Connection cnx=null;
		PreparedStatement pstmt=null;
		
		cnx = DBConnexion.seConnecter();
		
		try {
			pstmt=cnx.prepareStatement(SELECT_BY_ID);
			pstmt.setInt(1, no_article);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				artVendu = new ArticleVendu(rs.getInt("no_article"), rs.getString("nom_article"), rs.getString("description"), rs.getDate("date_debut_encheres"), 
						rs.getDate("date_fin_encheres"), rs.getInt("prix_initial"), rs.getInt("prix_vente"), rs.getInt("no_utilisateur"), 
						rs.getInt("no_categorie"), rs.getInt("no_retrait"));
			}

		} catch (SQLException e) {
			throw new DALException("Probleme pendant le selectionById : "+e);
		}finally {
			try {	
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(cnx != null) {
					cnx.close();
				}
				
			} catch (SQLException e) {
				throw new DALException("Erreur lors de la sélection de l'article par son numéro : " + no_article, e);
			}
		}
		
		return artVendu;
		
	}

	@Override
	public void delete(Integer articleVendu) throws DALException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Cette méthode permet de lister tous les articles de la table "articlesVendus" en vente
	 */
	@Override
	public List<ArticleVendu> selectAll() throws DALException {
		ResultSet rs=null;
		Connection cnx=null;
		PreparedStatement pstmt=null;
		List<ArticleVendu> liste = null;
		ArticleVendu artVendu = null;

		try {
			cnx = DBConnexion.seConnecter();
			pstmt = cnx.prepareStatement(SELECT_ARTICLES_VENDUS);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				artVendu = new ArticleVendu(rs.getString("nom_article"), rs.getString("description"), rs.getDate("date_debut_encheres"), 
						rs.getDate("date_fin_encheres"), rs.getInt("prix_initial"), rs.getInt("prix_vente"), rs.getInt("no_utilisateur"), 
						rs.getInt("no_categorie"), rs.getInt("no_retrait"));
				
				if (liste == null) {
					liste = new ArrayList<ArticleVendu>();
				}
				liste.add(artVendu);
			}
		 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBConnexion.seDeconnecter(cnx, pstmt);
		}

		return liste;
	}
	
	/**
	 *Méthode permettant de faire un Inner join entre article et utilisateurs et d'obtenir : <br>
	 * le nom,<br>
	 * prix initial,<br>
	 * date de fin d'enchère<br>
	 * et le pseudo associé
	 */
	@Override
	public List<ArticleVendu> selectArticlePlusUtilisateur() throws DALException {
		ResultSet rs=null;
		Connection cnx=null;
		PreparedStatement pstmt=null;
		List<ArticleVendu> liste = null;
		ArticleVendu artVendu = null;

		try {
			cnx = DBConnexion.seConnecter();
			pstmt = cnx.prepareStatement(SELECT_ARTICLE_PLUS_UTILISATEUR);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				artVendu = new ArticleVendu(rs.getString("nom_article"), rs.getInt("prix_initial"), rs.getDate("date_fin_encheres") , rs.getString("pseudo"));
			
				if (liste == null) {
					liste = new ArrayList<ArticleVendu>();
				}
				liste.add(artVendu);
			}
		 
		} catch (SQLException e) {
			throw new DALException("Pb"+e);
		}finally {
			DBConnexion.seDeconnecter(cnx, pstmt);
		}
		return liste;
	}
	

	/**
	 * Cette méthode permet de filtrer par mot clé sur nom de l'article
	 */
	@Override
	public List<ArticleVendu> selectByName(String motCle) throws DALException {
		ResultSet rs=null;
		Connection cnx=null;
		PreparedStatement pstmt=null;
		List<ArticleVendu> liste = new ArrayList<ArticleVendu>();
		ArticleVendu artVendu = null;
		
		try {
			cnx = DBConnexion.seConnecter();
			pstmt = cnx.prepareStatement(SELECT_BY_NAME);
			pstmt.setString(1, "%"+motCle+"%");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
					artVendu = new ArticleVendu(rs.getString("nom_article"), rs.getInt("prix_initial"), 
							rs.getDate("date_fin_encheres") , rs.getString("pseudo"));
					if (liste == null) {
						liste = new ArrayList<ArticleVendu>();
					}
					liste.add(artVendu);
			}
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DALException("Erreur pendant le selectByName : " + e);
		}
		
		return liste;
	}

	@Override
	public List<ArticleVendu> selectByCategorie(int noCategorie) {
		
		ResultSet rs=null;
		Connection cnx=null;
		PreparedStatement pstmt=null;
		List<ArticleVendu> liste = new ArrayList<ArticleVendu>();
		ArticleVendu artVendu = null;
		

			try {
				cnx = DBConnexion.seConnecter();
				pstmt = cnx.prepareStatement(SELECT_BY_CATEGORIE);
				pstmt.setInt(1, noCategorie);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
						artVendu = new ArticleVendu(rs.getString("nom_article"), rs.getInt("prix_initial"), 
								rs.getDate("date_fin_encheres") , rs.getString("pseudo"), rs.getInt("no_categorie"));
						if (liste == null) {
							liste = new ArrayList<ArticleVendu>();
						}
						liste.add(artVendu);
}
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		return liste;
		
	
	
	
	}

}
