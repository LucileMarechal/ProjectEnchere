package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bll.UtilisateurManager;
import fr.eni.ecole.projectenchere.bo.Utilisateur;

/**
 * Servlet implementation class CreerCompteServlet
 */
@WebServlet("/creerUnCompte.html")
public class CreerCompteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public static final String PSEUDO = "spseudo" ;
	public static final String NOM = "sname" ;
	public static final String PRENOM = "sfirstname";
	public static final String EMAIL = "semail";
	public static final String TELEPHONE = "sphone";
	public static final String RUE = "sstreet";
	public static final String CODE_POSTAL = "spostalCode";
	public static final String VILLE = "scity";
	public static final String MOT_DE_PASSE = "spassWord";
	public static final String CONFIRMATION = "sconfirmation";
	public static final int CREDIT = 100;
	public static final boolean ADMINISTRATEUR = false;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreerCompteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// faire appel au manager -> appel méthode DAO insert
		//récupération des champs du formulaire
		//Appel à la méthode getParameter
		
		String pseudo = request.getParameter(PSEUDO);
		String nom = request.getParameter(NOM);
		String prenom = request.getParameter(PRENOM);
		String email = request.getParameter(EMAIL);
		String telephone = request.getParameter(TELEPHONE);
		String rue = request.getParameter(RUE);
		String codePostal = request.getParameter(CODE_POSTAL);
		String ville = request.getParameter(VILLE);
		String motDePasse = request.getParameter(MOT_DE_PASSE);
		String confirmation = request.getParameter(CONFIRMATION);
		

		Utilisateur u1 = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,codePostal,ville,motDePasse,  CREDIT, ADMINISTRATEUR);
		//création du constructeur dans utilisateurBO 
		UtilisateurManager usermgr = new UtilisateurManager();
		
		try {
//			usermgr.validerUtilisateur(u1);
			usermgr.validerMotDePasse(motDePasse, confirmation);
			usermgr.addUtilisateur(u1);
//			usermgr.validerEmail(email);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
<<<<<<< HEAD
			request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
		
		
		//gestion des erreurs de validation
		}
=======
		request.getRequestDispatcher("/WEB-INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
>>>>>>> branch 'main' of https://github.com/Code-Me-live/ProjectEnchere
	
	
	//gestion des erreurs de validation
	}





}



