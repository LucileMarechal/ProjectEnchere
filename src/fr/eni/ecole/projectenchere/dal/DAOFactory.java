package fr.eni.ecole.projectenchere.dal;

import fr.eni.ecole.projectenchere.dal.jdbc.ArticlesVendusDAOJdbcImpl;
import fr.eni.ecole.projectenchere.dal.jdbc.CategoriDAOJdbcImpl;
import fr.eni.ecole.projectenchere.dal.jdbc.UtilisateursDAOJdbcImpl;

public abstract class DAOFactory {
	
	public static ArticlesVendusDAO getArticlesVendusDAO() {
		return new ArticlesVendusDAOJdbcImpl();
	}
	
	public static UtilisateursDAO getUtilisateursDAO() {
		return new UtilisateursDAOJdbcImpl();
	}
	
	public static CategorieDAO getCategoriesDAO() {
		return new CategoriDAOJdbcImpl();
	}

}
