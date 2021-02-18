package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bll.ArticleVendusManager;
import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.dal.DALException;

/**
 * Servlet implementation class DetailVenteServlet
 */
@WebServlet("/DetailVente.html")
public class DetailVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetailVenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer noArticle = Integer.parseInt(request.getParameter("noArticle"));
		//System.out.println(noArticle);
		int  i= 0;
		String message = "";
		String categorie = null;
		
		ArticleVendu afficherArticle = new ArticleVendu();
		ArticleVendusManager articleManager = new ArticleVendusManager();
		
		try {
			afficherArticle = articleManager.ArticlesVendusManager().selectById2(noArticle);
			
			
			if (afficherArticle == null) {
				message = "Il n'y a pas de n° d'article";
			}
			
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		}

		i =afficherArticle.getLibelle();
		switch (i) {
		case 1: categorie="Informatique"; break;
		case 2: categorie="Ameublement"; break;
		case 3: categorie="Vêtement"; break;
		case 4: categorie="Sport&Loisirs"; break;

		
		}
		request.setAttribute("categorie", categorie);
		request.setAttribute("Article", afficherArticle);
		request.getRequestDispatcher("/WEB-INF/jsp/detailVente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
