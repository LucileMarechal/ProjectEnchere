package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bll.BLLException;
import fr.eni.ecole.projectenchere.bll.UtilisateurManager;
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
//		Utilisateur u1 = new Utilisateur("Snoopy", "Snoopy", "Droopy", "snoopydroopy@gmail.com", "0123456789", "4 rue des coquelicots", 
//				"14200", "Foret", "bonjour", 100, false);
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			utilisateurDAO2.insert(u1);
//			response.getWriter().append(u1.toString());
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		
//		}
		
		
		// tester la méthode update -> ça marche ! 
		Utilisateur u = new Utilisateur();
		try {
			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
			u = utilisateurDAO2.selectById(31);
			response.getWriter().append(u.toString());
			u.setPseudo("Roger");
			utilisateurDAO2.update(u);
			response.getWriter().append(u.toString());
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
		Utilisateur utilisateur2 = new Utilisateur();
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

		// tester méthode selectByMailPseudo -> ça marche !
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			utilisateur = utilisateurDAO2.selectByMailPseudo("Simba", "mufasa_lelion@gmail.com");
//			//utilisateur2 = utilisateurDAO2.selectByMailPseudo("Bambi", "mufasa_lelion@gmail.com");
//			
//			response.getWriter().append(utilisateur.toString());
//			
//			
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		}
		
		// tester méthode selectByPseudo -> ça marche ! 
//		try {
//			utilisateurDAO2 = DAOFactory.getUtilisateursDAO();
//			utilisateur = utilisateurDAO2.selectByPseudo("Simba");
//			//utilisateur2 = utilisateurDAO2.selectByMailPseudo("Bambi", "mufasa_lelion@gmail.com");
//			
//			response.getWriter().append(utilisateur.toString());
//			
//			
//		} catch (DALException e) {
//			response.getWriter().append(e.getMessage());
//		}
		
		
		// test BLL pour profil utilisateur -> ok ! 
//		Utilisateur u1 = new Utilisateur();
//		UtilisateurManager usermanager = new UtilisateurManager();
//		
//		try {
//			u1 = usermanager.getUtilisateur("Simba");
//			response.getWriter().append(u1.toString());
//		} catch (BLLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		String pseudo = u1.getPseudo();
//		String nom = u1.getNom();
//		String prenom = u1.getPrenom();
//		String email = u1.getEmail();
//		String telephone = u1.getTelephone();
//		String rue = u1.getRue();
//		String codePostal = u1.getCodePostal();
//		String ville = u1.getVille();
//		
//	
//			//response.getWriter().append(utilisateur.toString());
//			request.setAttribute("pseudo", pseudo);
//			request.setAttribute("nom", nom);
//			request.setAttribute("prenom", prenom);
//			request.setAttribute("email", email);
//			request.setAttribute("telephone", telephone);
//			request.setAttribute("rue", rue);
//			request.setAttribute("code_postal", codePostal);
//			request.setAttribute("ville", ville);
//			
//			request.getRequestDispatcher("/WEB-INF/jsp/profilUtilisateur.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
