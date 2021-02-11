package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.bo.CategorieArticle;
import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;

public class ArticlesVendusDAOJdbcImpl implements ArticlesVendusDAO {
	
	// constantes
	// INSERT ARTICLES VENDUS : no_article auto incrÃ©mentÃ© : PK
	private static final String INSERT_ARTICLES_VENDUS = "INSERT INTO articles_vendus(nom_article, description, "
			+ "date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
	
	private static final String SELECT_ARTICLES_VENDUS = "SELECT no_article, nom_article, date_debut_encheres, date_fin_encheres, "
			+ "prix_initial, prix_vente,no_utilisateur, no_categorie, no_retrait FROM ARTICLES_VENDUS";
	
	private static final String SELECT_BY_ID = "select no_article, nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, "
			+ "prix_vente,no_utilisateur, no_categorie, no_retrait FROM articles_vendus where no_article = ?";
	
	private static final String UPDATE_ARTICLES_VENDUS ="UPDATE articles_vendus SET no_article=?, nom_article=?, date_debut_encheres=?, "
			+ "date_fin_encheres=?, prix_initial=?, prix_vente,no_utilisateur=?, no_categorie=?, no_retrait=? WHERE no_article=?";
	
	private static final String DELETE_ARTICLES_VENDUS ="DELETE FROM articles_vendus WHERE no_article=?";

	/**
	 * Cette méthode permet d'inserer un nouvel article en vente<br>
	 * Avec l'id de l'utilisateur qui le met en vente et la catégorie de l'article
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
			
			//Le prix pouvant être null je test s'il n'est pas null
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
			throw new DALException("Probleme sur la méthode ajouter INSERT_ARTICLES_VENDUS - "+e);
		}finally {
			try {
				cnx.setAutoCommit(true);
				DBConnexion.seDeconnecter(cnx, pstmt);
			} catch (SQLException e) {
				throw new DALException("Probleme sur la déconnexion");
			}
		}
	}

	@Override
	public void update(ArticleVendu articleVendu) throws DALException {

		
		
	}

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
			throw new DALException("Problème pendant le selectionById : "+e);
		}finally {
			try {	
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(cnx != null) {
					cnx.close();
				}
				
			} catch (SQLException e) {
				throw new DALException("Erreur lors de la sÃ©lection de l'utilisateur par son numÃ©ro : " + no_article, e);
			}
		}
		
		return artVendu;
		
	}

	@Override
	public void delete(Integer articleVendu) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ArticleVendu> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	

}
