package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;
import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.ArticlesVendusDAO;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.UtilisateursDAO;

/**
 * Servlet implementation class TestDAL
 */
@WebServlet("/TestDAL")
public class TestDALVince extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDALVince() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// tester de la méthode selectAll() -> ça marche ! 
		//List<Utilisateur> utilisateurs = new ArrayList<>();
//		UtilisateursDAO utilisateursDAO = null;
//		String message = "";
//		
//		try {
//			utilisateursDAO = DAOFactory.getUtilisateursDAO();
//			utilisateurs = utilisateursDAO.selectAll();
//			if (utilisateurs.isEmpty()) {
//				message = "aucun utilisateur";
//				response.getWriter().append(message);
//			} else {
//				response.getWriter().append(utilisateurs.toString());
//			}
//			
//			
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		}
		
		
		// tester la méthode selectById() -> ça marche !
//		Utilisateur utilisateur = new Utilisateur();
		UtilisateursDAO utilisateurDAO2 = null;
//		
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			utilisateur = utilisateurDAO2.selectById(18);
//			
//			response.getWriter().append(utilisateur.toString());
//			response.getWriter().append(utilisateur2.toString());
//			
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		}
		
		// tester la méthode insert -> ça marche ! 
//		Utilisateur u1 = new Utilisateur("Bambi", "Bambi", "Bambo", "bambi@gmail.com", "0123456789", "4 rue des coquelicots", 
//				"14200", "Foret", "bonjour", 100, false);
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			utilisateurDAO2.insert(u1);
//			response.getWriter().append(u1.toString());
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		
//		}
		
		
		// tester la méthode update -> marche pas encore
//		Utilisateur u = new Utilisateur();
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			u = utilisateurDAO2.selectById(30);
//			response.getWriter().append("Utilisateur avant modification : " +u);
//			
//			
//			
//			response.getWriter().append("\nUtilisateur après modif : " +u);
//			u.setPrenom("Roger");
//			utilisateurDAO2.update(u);
//
//			
//		} catch (DALException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// tester la méthode delete -> ça marche 
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			response.getWriter().append("suppression de l'utilisateur : " +u1);
//			utilisateurDAO2.delete(30);
//			utilisateurs = utilisateurDAO2.selectAll();
//			response.getWriter().append("liste utilisateurs après suppression bambi : " +utilisateurs.toString());
//		} catch (DALException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		// tester la méthode getUserByEmail -> ça marche !
		Utilisateur utilisateur = new Utilisateur();
//		
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			utilisateur = utilisateurDAO2.getUserByEmail("mufasa_lelion@gmail.com");
//			
//			response.getWriter().append(utilisateur.toString());
//			
//			
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		}
//		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
