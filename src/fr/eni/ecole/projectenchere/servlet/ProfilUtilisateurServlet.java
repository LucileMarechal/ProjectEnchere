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
 * Servlet implementation class ProfilUtilisateurServlet
 */
@WebServlet("/profilUtilisateur.html")
public class ProfilUtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilUtilisateurServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// on appelle selectById pour afficher l'utilisateur
		// on va devoir passer par les sessions -> utilisateur connecté
		// variable no_utilisateur à valoriser
		// je vais commencer par récupérer un utilisateur en BDD pour accéder à ses données 
		
		
		// autant de variables que de champs à compléter sur jsp
		// exemple nom : String nom = utilisateur.getNom();
		// request.setAttribute("nom", nom);
		Utilisateur u1 = new Utilisateur();
		UtilisateurManager usermanager = new UtilisateurManager();
		
/******AJOUT PAT************************************/

		String pseudoUser = (String) request.getSession().getAttribute("loginSession");
		
/******AJOUT PAT************************************/		
		
		
		try {
			// remplacer Simba par n'importe quel utilisateur 
			// récupérer pseudo de la personne connectée 
			// session
			u1 = usermanager.getUtilisateur(pseudoUser);
			response.getWriter().append(u1.toString());
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String pseudo = u1.getPseudo();
		String nom = u1.getNom();
		String prenom = u1.getPrenom();
		String email = u1.getEmail();
		String telephone = u1.getTelephone();
		String rue = u1.getRue();
		String codePostal = u1.getCodePostal();
		String ville = u1.getVille();
		
	
			//response.getWriter().append(utilisateur.toString());
			request.setAttribute("pseudo", pseudo);
			request.setAttribute("nom", nom);
			request.setAttribute("prenom", prenom);
			request.setAttribute("email", email);
			request.setAttribute("telephone", telephone);
			request.setAttribute("rue", rue);
			request.setAttribute("code_postal", codePostal);
			request.setAttribute("ville", ville);
			
			request.getRequestDispatcher("/WEB-INF/jsp/profilUtilisateur.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("dopost");
	}

}
