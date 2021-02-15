package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.bll.UtilisateurManager;
import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.UtilisateursDAO;

/**
 * Servlet implementation class TestBLL
 */
@WebServlet("/TestBLL")
public class TestBLL extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public TestBLL() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		UtilisateurManager usermgr = new UtilisateurManager();
		UtilisateursDAO userDAO = null;
		
		//UtilisateurManager.add new utilisateur pseudo avec @
		//utilisateur correct aussi 
		
		//tester exception si un mail existe déjà
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		//tester exception si mot de passe et confirmation différents
		
		
	}

}
