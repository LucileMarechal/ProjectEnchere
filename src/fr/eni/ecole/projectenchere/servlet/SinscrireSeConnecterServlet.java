package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String login = request.getParameter("slogin").trim();
		String password = request.getParameter("spassword").trim();
		
		response.getWriter().append("le login est : " + login);
		response.getWriter().append("\nle mot de passe est : " +password);
		
		if (request.getParameter("slogin").trim().isEmpty()) {
			response.getWriter().append("erreur login vide");
			//getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueilSansConnexion.jsp").forward(request, response);
		}
		if (request.getParameter("spassword").trim().isEmpty()) {
			response.getWriter().append("\nerreur password vide");
			//getServletContext().getRequestDispatcher("/WEB-INF/jsp/accueilSansConnexion.jsp").forward(request, response);
		}


		
		//rediriger vers servlet
		//getServletContext().getRequestDispatcher("/accueilAvecConnexion.html").forward(request, response);

		
		
		

		
		//récupération des champs du formulaire
		//Appel à la méthode getParameter
//		String pseudo = request.getParameter(PSEUDO);
//		String nom = request.getParameter(NOM);
//		String prenom = request.getParameter(PRENOM);
//		String email = request.getParameter(EMAIL);
//		String telephone = request.getParameter(TELEPHONE);
//		String rue = request.getParameter(RUE);
//		String codePostal = request.getParameter(CODE_POSTAL);
//		String ville = request.getParameter(VILLE);
//		String motDePasse = request.getParameter(MOT_DE_PASSE);
//		String confirmation = request.getParameter(CONFIRMATION);

//		try {
//			validationPseudo(pseudo);
//			validationNom(nom);
//			validationPrenom(prenom);
//			validationEmail(email);
//			validationTelephone (telephone);
//			validationAdresse(rue, codePostal, ville);
//			validationMotsDePasse(motDePasse, confirmation);
//
//		} catch (Exception e) {
//			//gestion des erreurs de validation
//		}
//	}

	}
}

	
