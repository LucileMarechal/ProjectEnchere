package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ecole.projectenchere.bll.BLLException;
import fr.eni.ecole.projectenchere.bll.UtilisateurManager;
import fr.eni.ecole.projectenchere.bo.Utilisateur;

/**
 * Servlet implementation class SinsrireSeConnecterServlet
 */
@WebServlet("/SinscrireSeConnecter.html")
public class SinscrireSeConnecterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SinscrireSeConnecterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Affichage de la page d'inscription
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/creerUnCompte.jsp").forward(request, response);
	} 

	//Traitement des données du formulaire
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pseudo = request.getParameter("slogin").trim();
		String email = request.getParameter("slogin").trim();
		String password = request.getParameter("spassword").trim();

		
		UtilisateurManager usermgr = new UtilisateurManager();
		
		Utilisateur utilisateur = new Utilisateur();
		
		
		try {
			utilisateur = usermgr.validerConnexionUtilisateur(email, pseudo, password);
			response.getWriter().append(utilisateur.toString());
			// dispatcher session en mode connecté
			// créer un attribut de session pour stocker utilisateur connecté
			// dispatcher pour afficher page accueil en mode connecté
			request.getSession().setAttribute("loginSession", pseudo);
			request.getSession().setAttribute("loginSession", email);
			response.sendRedirect("./accueilAvecConnexion.html");
			//request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
			
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("erreur", e.getMessage());
			response.getWriter().append("Erreur : " +e.getMessage());
			request.getRequestDispatcher("/WEB-INF/jsp/creerUnCompte.jsp").forward(request, response);
		}



		
		//rediriger vers servlet
		//getServletContext().getRequestDispatcher("/accueilAvecConnexion.html").forward(request, response);

		


	}
}

	
