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
		
	UtilisateurManager test = new UtilisateurManager();
	/*
	 *Ca fonctionne!!!!!!!!!!
	 *
	try {
		test.motDePasse("papapapapap", "papapapapap");
	} catch (BLLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	//Nouvel utilisateur : fonctionne
//	Utilisateur utilisateur = new Utilisateur("Bambi", "Bambi", "Bambo", "bambi@gmail.com", "0123456789", "4 rue des coquelicots",
//			 "14200", "Foret", "bonjour", 100, false);
//	try {
//		test.addUtilisateur(utilisateur);
//		utilisateur.toString();
//	} catch (BLLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
	
	
	//Test utilisateur déjà existant
	Utilisateur newUser = new Utilisateur ("RACHOUCHOU", " ", "Green", "rachoupouetpouet@centralperk.com ", "03 45 85 25 62", 
 "26 boulevard des bicyles", "35000", "Rennes","tagadatsouin-tsouin", 100, false);
	
	try {
		test.addUtilisateur(newUser);
		newUser.toString();
	} catch (BLLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	
		
	
		//UtilisateurManager.add new utilisateur pseudo avec @
		//utilisateur correct aussi 
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		
		
	}

}
