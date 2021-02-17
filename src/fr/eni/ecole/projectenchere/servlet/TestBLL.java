package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

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
	Utilisateur utilisateur = new Utilisateur
			("", "Tsouin", "Tsouin", "taga&datsouin@gmail.com", "0767058277", "4 rue des coquelicots",
			 "14200", "Foret", "bonjour", 100, false);
	try {
		test.addUtilisateur(utilisateur);
		utilisateur.toString();
	} catch (BLLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//ValiderUtilisateur
	
//	Utilisateur newUser = new Utilisateur();
	
	
	//Test utilisateur déjà existant // fonctionne pas
//	Utilisateur newUser = new Utilisateur ("LeePandaa", "Cover", "Harry", "harryCocover@gmail.com", "é@-(éè-_àç", 
// "3 rue des coquelicots", "14200", "Granville","bonjour", 100, false);
//	
//	try {
//		test.addUtilisateur(newUser);
//		newUser.toString();
//	} catch (BLLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	JOptionPane.showMessageDialog(null, " ");
	

	
		//UtilisateurManager.add new utilisateur pseudo avec @
		//utilisateur correct aussi 
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		
		
		
	}

}
