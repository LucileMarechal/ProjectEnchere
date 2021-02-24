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
 * Servlet implementation class MonProfilServlet
 */
@WebServlet("/monProfil.html")
public class MonProfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MonProfilServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur u1 = (Utilisateur) request.getSession().getAttribute("loginSession");

		
		request.setAttribute("u1", u1);
		request.getRequestDispatcher("/WEB-INF/jsp/monProfil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Utilisateur u1 = (Utilisateur) request.getSession().getAttribute("loginSession");
		Utilisateur u2 = new Utilisateur();
		UtilisateurManager usermgr = new UtilisateurManager();
		
		String pseudo = request.getParameter("spseudo");
		String prenom = request.getParameter("sprenom");
		String telephone = request.getParameter("stel");
		String codePostal = request.getParameter("scpo");
		String nom = request.getParameter("snom");
		String email = request.getParameter("smail");
		String rue = request.getParameter("srue");
		String ville = request.getParameter("sville");
		String motDePasseActuel = request.getParameter("smdp");
		String nouveauMotDePasse = request.getParameter("snewmdp");
		String confirmationNouveauMotDePasse = request.getParameter("sconfnewmdp");
		//Integer credit = utilisateur.getCredit();

		u2.setPseudo(pseudo);
		u2.setPrenom(prenom);
		u2.setTelephone(telephone);
		u2.setCodePostal(codePostal);
		u2.setNom(nom);
		u2.setEmail(email);
		u2.setRue(rue);
		u2.setVille(ville);
		int noUtilisateur = u1.getNoUtilisateur();
		u2.setNoUtilisateur(noUtilisateur);

		try { 
			if (nouveauMotDePasse.equals(confirmationNouveauMotDePasse)) {
				usermgr.validerMotDePasse(nouveauMotDePasse, confirmationNouveauMotDePasse);
				u2.setMotDePasse(nouveauMotDePasse);
			}

			usermgr.updateUtilisateur(u2);
			request.getSession().setAttribute("loginSession", u2);
		} catch (BLLException e) {
			e.getMessage();
		}

		response.getWriter().append(pseudo);
		
		response.sendRedirect("./accueilAvecConnexion.html");
		
		//request.setAttribute("credit", credit);

	}

}
