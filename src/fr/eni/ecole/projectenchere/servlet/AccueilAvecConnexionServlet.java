package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bll.ArticleVendusManager;
import fr.eni.ecole.projectenchere.bll.CategoriesManager;
import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.bo.Categories;
import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.DALException;

/**
 * Servlet implementation class accueilAvecConnexionServlet
 */
@WebServlet("/accueilAvecConnexion.html")
public class AccueilAvecConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilAvecConnexionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test session
		Utilisateur utilisateur = (Utilisateur) request.getSession().getAttribute("loginSession");
		System.out.println(utilisateur);

		
		List<ArticleVendu> artVendu = new ArrayList<>();
		ArticleVendusManager artVendu1 = new ArticleVendusManager();
		
		List<Categories> categorie = new ArrayList<>();
		CategoriesManager categories = new CategoriesManager();
		String message="";
		
		
		try {
			artVendu = artVendu1.ArticlesVendusManager().selectArticlePlusUtilisateur();
			if (artVendu.isEmpty()) {
				message = "Aucun Article";
				response.getWriter().append(message);
			}else {
				response.getWriter().append(artVendu.toString());
				
			}
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		} 
		
		try {
			categorie = categories.CategorieManager().selectAll();
			if (categorie.isEmpty()) {
				message = "Pas de catégorie en BDD";
				response.getWriter().append(message);
			}else {
				response.getWriter().append(categorie.toString());
			}
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		} 
				
		request.setAttribute("listeCategorie", categorie);
		request.setAttribute("listeArticles", artVendu);

		request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<ArticleVendu> artVendu = new ArrayList<>();
		ArticleVendusManager artVendu1 = new ArticleVendusManager();
		
		List<Categories> categorie = new ArrayList<>();
		CategoriesManager categories = new CategoriesManager();
		String message="";
		String motCle = "";
		
		if (request.getParameter("sRechercher").isEmpty() || request.getParameter("sRechercher")==null) {
			try {
				artVendu = artVendu1.ArticlesVendusManager().selectArticlePlusUtilisateur();
			} catch (DALException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			motCle = request.getParameter("sRechercher").trim().toUpperCase();
		}
				
		try {
			artVendu = artVendu1.ArticlesVendusManager().selectByName(motCle);
			if (artVendu.isEmpty()) {
				message = "Aucun Article";
				response.getWriter().append(message);
			}else {
				response.getWriter().append(artVendu.toString());
				
			}
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		try {
			categorie = categories.CategorieManager().selectAll();
			if (categorie.isEmpty()) {
				message = "Pas de catégorie en BDD";
				response.getWriter().append(message);
			}else {
				response.getWriter().append(categorie.toString());
			}
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		} 
				
		request.setAttribute("listeCategorie", categorie);
		request.setAttribute("listeArticles", artVendu);

		request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
		
	}

}
