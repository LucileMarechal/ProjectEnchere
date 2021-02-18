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

/**
 * Servlet implementation class ProfilVendeur
 */
@WebServlet("/ProfilVendeur.html")
public class ProfilVendeur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilVendeur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur u1 = new Utilisateur();
		UtilisateurManager u = new UtilisateurManager();
		int i = Integer.parseInt(request.getParameter("noVendeur"));
		
		try {
			u1 = u.getUtilisateurById(i);
		} catch (BLLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("utilisateur", u1);
		request.getRequestDispatcher("/WEB-INF/jsp/profilVendeur.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
