package fr.eni.ecole.projectenchere.bll;

import fr.eni.ecole.projectenchere.dal.CategorieDAO;
import fr.eni.ecole.projectenchere.dal.DAOFactory;

public class CategoriesManager {

	private CategorieDAO daoCategories = null;
	
	public CategorieDAO CategorieManager() {
		return daoCategories = DAOFactory.getCategoriesDAO();
		
	}
	
}
