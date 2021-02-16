package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bll.BLLException;
import fr.eni.ecole.projectenchere.bll.UtilisateurManager;
import fr.eni.ecole.projectenchere.bo.Utilisateur;

/**
 * Servlet implementation class SinsrireSeConnecterServlet
 */
@WebServlet("/SinscrireSeConnecter.html")
public class SinscrireSeConnecterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String PSEUDO = "pseudo" ;
	public static final String NOM = "nom" ;
	public static final String PRENOM = "prénom";
	public static final String EMAIL = "email";
	public static final String TELEPHONE = "téléphone";
	public static final String RUE = "rue";
	public static final String CODE_POSTAL = "code postal";
	public static final String VILLE = "ville";
	public static final String MOT_DE_PASSE = "mot de passe";
	public static final String CONFIRMATION = "confirmation";

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
		
		// Utilisateur utilisateur = new Utilisateur();
		UtilisateurManager usermgr = new UtilisateurManager();
		
		
		
		
		try {
			
			usermgr.validerConnexionUtilisateur("slogin", "slogin", "spassword");
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().append("le login est : " + pseudo);
		response.getWriter().append("\nle mot de passe est : " +password);
		
		
		
		
		
//		if (request.getParameter("slogin").trim().isEmpty()) {
//			response.getWriter().append("erreur login vide");
//			//getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueilSansConnexion.jsp").forward(request, response);
//		}
//		if (request.getParameter("spassword").trim().isEmpty()) {
//			response.getWriter().append("\nerreur password vide");
//			//getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueilSansConnexion.jsp").forward(request, response);
//		}


		
		//rediriger vers servlet
		//getServletContext().getRequestDispatcher("/accueilAvecConnexion.html").forward(request, response);

		


	}
}

	
