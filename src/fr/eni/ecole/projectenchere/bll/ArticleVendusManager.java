package fr.eni.ecole.projectenchere.bll;

import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DAOFactory;

public class ArticleVendusManager {

	private ArticlesVendusDAO daoArticlesVendus = null;
	
	public ArticlesVendusDAO ArticlesVendusManager() {
		
		return daoArticlesVendus = DAOFactory.getArticlesVendusDAO();
	}
	
}
