package fr.eni.ecole.projectenchere.bll;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DAOFactory;

public class ArticleVendusManager {

	private ArticlesVendusDAO daoArticlesVendus = null;
	
	public ArticlesVendusDAO ArticlesVendusManager() {
		
		return daoArticlesVendus = DAOFactory.getArticlesVendusDAO();
	}
	
/******TEST A ENRICHIR*************/
	/*TODO*/
	public void verifArticle(ArticleVendu article) {
		if (article.getPrixVente() == null) {
			article.setPrixVente(article.getPrixInitial());
		}
	}
/******TEST A ENRICHIR*************/
	



 
	
}
