package fr.eni.ecole.projectenchere.dal.jdbc;

import java.util.List;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DALException;

public class ArticlesVendusDAOJdbcImpl implements ArticlesVendusDAO {
	
	// constantes
	// INSERT ARTICLES VENDUS : no_article auto incrémenté : PK
	private static final String INSERT_ARTICLES_VENDUS = "INSERT INTO articles_vendus(nom_article, description, date_debut_enchere,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
	
	private static final String SELECT_ARTICLES_VENDUS = "SELECT no_article, nom_article, date_debut_encheres, date_fin_encheres, "
			+ "prix_initial, prix_vente,no_utilisateur, no_categorie, no_retrait FROM ARTICLES_VENDUS";
	
	private static final String UPDATE_ARTICLES_VENDUS ="UPDATE articles_vendus SET no_article=?, nom_article=?, date_debut_encheres=?, "
			+ "date_fin_encheres=?, prix_initial=?, prix_vente,no_utilisateur=?, no_categorie=?, no_retrait=? WHERE no_article=?";
	
	private static final String DELETE_ARTICLES_VENDUS ="DELETE FROM articles_vendus WHERE no_article=?";

	@Override
	public void insert(ArticleVendu articleVendu) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ArticleVendu articleVendu) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectById(ArticleVendu articleVendu) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ArticleVendu articleVendu) throws DALException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ArticleVendu> selectAll() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
