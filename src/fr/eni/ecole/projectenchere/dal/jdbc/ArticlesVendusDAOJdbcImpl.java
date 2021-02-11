package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	private static final String INSERT_ARTICLES_VENDUS = "INSERT INTO articles_vendus(nom_article, description, date_debut_encheres, date_fin_encheres, prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
	
	private static final String SELECT_ARTICLES_VENDUS = "SELECT no_article, nom_article, date_debut_encheres, date_fin_encheres, "
			+ "prix_initial, prix_vente,no_utilisateur, no_categorie, no_retrait FROM ARTICLES_VENDUS";
	
	private static final String UPDATE_ARTICLES_VENDUS ="UPDATE articles_vendus SET no_article=?, nom_article=?, date_debut_encheres=?, "
			+ "date_fin_encheres=?, prix_initial=?, prix_vente,no_utilisateur=?, no_categorie=?, no_retrait=? WHERE no_article=?";
	
	private static final String DELETE_ARTICLES_VENDUS ="DELETE FROM articles_vendus WHERE no_article=?";

	/**
	 * Cette méthode permet
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectById(Integer no_article) throws DALException {
		// TODO Auto-generated method stub
		
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
