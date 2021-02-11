package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		// tester de la méthode selectAll()
		List<Utilisateur> utilisateurs = new ArrayList<>();
		UtilisateursDAO utilisateursDAO = null;
		String message = "";
		
		try {
			utilisateursDAO = DAOFactory.getUtilisateursDAO();
			utilisateurs = utilisateursDAO.selectAll();
			if (utilisateurs.isEmpty()) {
				message = "aucun utilisateur";
				response.getWriter().append(message);
			} else {
				response.getWriter().append(utilisateurs.toString());
			}
			
			
		} catch (DALException e) {
			response.getWriter().append(e.getMessage());
		}
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
