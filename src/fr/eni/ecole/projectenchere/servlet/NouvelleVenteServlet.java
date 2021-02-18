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

import fr.eni.ecole.projectenchere.bll.ArticleVendusManager;
import fr.eni.ecole.projectenchere.bll.CategoriesManager;
import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.bo.Categories;
import fr.eni.ecole.projectenchere.dal.DALException;



/**
 * Servlet implementation class NouvelleVenteServlet
 */
@WebServlet("/NouvelleVente.html")
public class NouvelleVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public NouvelleVenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pseudo = (String) request.getSession().getAttribute("loginSession");
		System.out.println(pseudo);
		List<Categories> categorie = new ArrayList<>();
		CategoriesManager categories = new CategoriesManager();
		String message="";
		
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
		
		request.getRequestDispatcher("/WEB-INF/jsp/nouvelleVente.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArticleVendu articleAVendre = new ArticleVendu();
		ArticleVendusManager artA = new ArticleVendusManager();
		
		List<Categories> categorie = new ArrayList<>();
		CategoriesManager categories = new CategoriesManager();
		String message="";
		
		String nomArticle = request.getParameter("sarticle");
		String description = request.getParameter("sdescription");
		Integer noCategorie = Integer.parseInt(request.getParameter("Categorie")) ;
		//Cast du String en Int
		int prixInitial = Integer.parseInt(request.getParameter("sprix"));
/*************CAST DE DATE DATE.SQL************************************/
		String dateD = request.getParameter("sdate_debut");
		String dateF = request.getParameter("sdate_fin");
		Date dateDebut = Date.valueOf(dateD);
		Date dateFin = Date.valueOf(dateF);
/*************CAST DE DATE DATE.SQL************************************/

		String rue = request.getParameter("srue");
		String codePostal = request.getParameter("scodepostal");
		String ville = request.getParameter("sville");
		
		response.getWriter().append("sarticle : "+nomArticle+"<br> "
				+ "sdescription : "+description+"<br> "
				+ "Catégorie : "+noCategorie+"<br> Prix "
				+ "Date de Début : "+dateDebut+"<br> "
				+ "Date de Fin : "+dateFin+"<br> "
				+ "initial : "+prixInitial+"<br> "
				+ "Rue : "+rue+"<br> "
				+ "Code postal : "+codePostal+"<br>"
				+ " Ville : "+ville );
		
/****** le noUtilisateur 5 doit être remplacé par un paramètre utilisateur issue  de l'utilisateur connecté****************/
		articleAVendre = new ArticleVendu(nomArticle, description, dateDebut, dateFin, prixInitial, null, 5, noCategorie, null);
/****** le noUtilisateur 5 doit être remplacé par un paramètre utilisateur issue  de l'utilisateur connecté****************/
		
		try {
			artA.verifArticle(articleAVendre);
			artA.ArticlesVendusManager().insert(articleAVendre);
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
		
		
		}

	}

