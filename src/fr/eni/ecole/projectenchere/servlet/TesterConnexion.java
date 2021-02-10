package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;

/**
 * Servlet implementation class TesterConnexion
 */
@WebServlet("/TesterConnexion")
public class TesterConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TesterConnexion() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection = null;
		try {
			connection = DBConnexion.seConnecter();
			response.getWriter().append("connexion OK");
		} catch (DALException e) {
			response.getWriter().append("Connexion non OK").append("\n").append(e.getMessage());	
		}finally {
			try {
				DBConnexion.seDeconnecter(connection);
			} catch (DALException e) {
				response.getWriter().append("problème de libération de connexion").append("\n").append(e.getMessage());
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
