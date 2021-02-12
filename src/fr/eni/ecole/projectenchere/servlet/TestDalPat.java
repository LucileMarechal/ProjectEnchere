package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.UtilisateursDAO;
import fr.eni.ecole.projectenchere.dal.jdbc.ArticlesVendusDAOJdbcImpl;

/**
 * Servlet implementation class TestDalPat
 */
@WebServlet("/TestDalPat")
public class TestDalPat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDalPat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Methode de test du CRUD sur les articles vendus
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//test pour afficher tous les articles + utilisateurs
		List<ArticleVendu> artVendu = new ArrayList<>();
		ArticlesVendusDAO artVenduDAO = null;
		String message="";
		
		try {
			artVenduDAO = DAOFactory.getArticlesVendusDAO();
			artVendu = artVenduDAO.selectArticlePlusUtilisateur();
			if (artVendu.isEmpty()) {
				message = "aucun utilisateur";
				response.getWriter().append(message);
			}else {
				response.getWriter().append(artVendu.toString());
				
			}
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		} 
		

		
		
		/*
		//Test selection d'article par le numéro de l'article
		ArticleVendu artVendu = new ArticleVendu();
		ArticlesVendusDAO artVenduDAO = null;
		
		
		try {
			artVenduDAO = DAOFactory.getArticlesVendusDAO();
			artVendu=artVenduDAO.selectById(10);
			System.out.println(artVendu);
			response.getWriter().append(artVendu.toString());
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		}*/
		
		
		

		/**
		//Test insert
		ArticlesVendusDAOJdbcImpl articleVenduDAO = new ArticlesVendusDAOJdbcImpl();
		Utilisateur utilisateur = new Utilisateur();
		
		//test � modifier avec une utilisateur et une cat�gorie
		ArticleVendu aV1 = new ArticleVendu("Pat", "PatTest", Date.valueOf("2022-05-06"), Date.valueOf("2022-07-06") , 10, 50, utilisateur, null, null);
		System.out.println("Visualisation article avant insertion : "+aV1);
		
		try {
			articleVenduDAO.insert(aV1);
			System.out.println(aV1);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
	
	private static void afficherArticles(List<ArticleVendu> art){
		StringBuffer sb = new StringBuffer();
		for (ArticleVendu a : art) {
			sb.append(art.toString());
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}

}
