package fr.eni.ecole.projectenchere.dal;

import java.sql.Date;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.dal.jdbc.ArticlesVendusDAOJdbcImpl;

public class TestDalPat {

	public static void main(String[] args) {
		
		ArticlesVendusDAOJdbcImpl articleVenduDAO = new ArticlesVendusDAOJdbcImpl();
		
		ArticleVendu aV1 = new ArticleVendu("Pat", "PatTest", Date.valueOf("2022-05-06"), Date.valueOf("2022-07-06") , 10, 50);
		System.out.println("Visualisation article avant insertion : "+aV1);
		
		try {
			articleVenduDAO.insert(aV1);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
