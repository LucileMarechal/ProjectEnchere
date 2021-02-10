package fr.eni.ecole.projectenchere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SinsrireSeConnecterServlet
 */
@WebServlet("/SinscrireSeConnecter.html")
public class SinscrireSeConnecterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final String PSEUDO = "pseudo" ;
	public static final String NOM = "nom" ;
	public static final String PRENOM = "prénom";
	public static final String EMAIL = "email";
	public static final String TELEPHONE = "téléphone";
	public static final String RUE = "rue";
	public static final String CODE_POSTAL = "code postal";
	public static final String VILLE = "ville";
	public static final String MOT_DE_PASSE = "mot de passe";
	public static final String CONFIRMATION = "confirmation";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SinscrireSeConnecterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Affichage de la page d'inscription
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/creerUnCompte.jsp").forward(request, response);
	} 

	//Tratiement des données du formulaire
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//récupération des champs du formulaire
		//Appel à la méthode getParameter
		String pseudo = request.getParameter(PSEUDO);
		String nom = request.getParameter(NOM);
		String prenom = request.getParameter(PRENOM);
		String email = request.getParameter(EMAIL);
		String telephone = request.getParameter(TELEPHONE);
		String rue = request.getParameter(RUE);
		String codePostal = request.getParameter(CODE_POSTAL);
		String ville = request.getParameter(VILLE);
		String motDePasse = request.getParameter(MOT_DE_PASSE);
		String confirmation = request.getParameter(CONFIRMATION);

		try {
			validationPseudo(pseudo);
			validationNom(nom);
			validationPrenom(prenom);
			validationEmail(email);
			validationTelephone (telephone);
			validationAdresse(rue, codePostal, ville);
			validationMotsDePasse(motDePasse, confirmation);

		} catch (Exception e) {
			//gestion des erreurs de validation
		}
	}
	//valider le pseudo
	private void validationPseudo(String pseudo) throws Exception {
		if (pseudo == null) {
			throw new Exception("Veuillez saisir un pseudo");
		}
	}

	//valider les mots de passe saisie
	private void validationMotsDePasse(String motDePasse, String confirmation) throws Exception {
	if (motDePasse != null && motDePasse.trim().length()!=0 
			&& confirmation != null && confirmation.trim().length() != 0) {
		if (!motDePasse.equals(confirmation)) {
			throw new Exception("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
		}else if (motDePasse.trim().length() < 6) {
			throw new Exception("Les mots de passe doivent contenir au moins 6 caractères.");
		}
	}else {
		throw new Exception("Merci de saisir et confirmer votre mot de passe.");
	}
	}

	//valider adresse 
	private void validationAdresse(String rue, String codePostal, String ville) {
	//rue, ville et codePostal pas de caractere autreque lettre et nombre
		//codePostale ne doit pas contenir plus de 5 chiffres et ne doit pas contenir autre chose que des chiffres
	}

	private void validationTelephone(String telephone) throws Exception {
		if (telephone != null && telephone.trim().length()!= 0) {
			if (telephone.trim().length()<10 && telephone.trim().length()<10) {
				throw new Exception("Le numéro de téléphone doit comporter au moins 10 nombre");
			} // le téléphone ne doit pas comporter de lettre
			
		}
	
	}
	//valider l'adresse mail saisie
	private void validationEmail(String email) throws Exception {
		if (email != null && email.trim().length()!= 0) {
			if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
				throw new Exception("Merci de saisir une adresse mail valide.");
			}
		}else {
			throw new Exception("Merci de saisir une adresse mail.");
		}
	}
	//validation du prénom de l'utilisateur
	private void validationPrenom(String prenom) throws Exception {
		if (prenom == null) {
			throw new Exception("Veuillez saisir un prénom");
		}

	}
	//Validation du nom de l'utilisateur
	private void validationNom(String nom) throws Exception {
		if (nom == null) {
			throw new Exception("Veuillez saisir un nom");
		}
	}
}

	
