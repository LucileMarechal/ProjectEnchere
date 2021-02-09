package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnregistrerVenteServlet
 */
@WebServlet("/EnregistrerVente.html")
public class EnregistrerVenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public EnregistrerVenteServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB/INF/jsp/accueilAvecConnexion.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("je suis dans la doPost EnregistrerVenteServlet");
	}

}
