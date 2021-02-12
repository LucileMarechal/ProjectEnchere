package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		try {
			UtilisateursDAO utilisateurDAO = DAOFactory.getUtilisateursDAO();
			Utilisateur utilisateur = utilisateurDAO.selectById(18);
			
			request.setAttribute("utilisateur", utilisateur);
			
			//response.getWriter().append("Utilisateur : " +utilisateur);
			
			request.getRequestDispatcher("/WEB-INF/jsp/profilUtilisateur.jsp").forward(request, response);
		} catch (DALException e) {
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
