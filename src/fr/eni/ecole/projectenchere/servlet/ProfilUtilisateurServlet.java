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
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.UtilisateursDAO;

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
		Utilisateur utilisateur = new Utilisateur();
		
		String pseudo = utilisateur.getPseudo();
		String nom = utilisateur.getNom();
		String prenom = utilisateur.getPrenom();
		String email = utilisateur.getEmail();
		String telephone = utilisateur.getTelephone();
		String rue = utilisateur.getRue();
		String codePostal = utilisateur.getCodePostal();
		String ville = utilisateur.getVille();
		
		
		UtilisateurManager usermgr = new UtilisateurManager();
		try {
			
			utilisateur = usermgr.getUtilisateur(pseudo);
			
			request.setAttribute("pseudo", pseudo);
			request.setAttribute("nom", nom);
			request.setAttribute("prenom", prenom);
			request.setAttribute("email", email);
			request.setAttribute("telephone", telephone);
			request.setAttribute("rue", rue);
			request.setAttribute("code_postal", codePostal);
			request.setAttribute("ville", ville);
			
			request.getRequestDispatcher("/WEB-INF/jsp/profilUtilisateur.jsp").forward(request, response);
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("dopost");
	}

}
