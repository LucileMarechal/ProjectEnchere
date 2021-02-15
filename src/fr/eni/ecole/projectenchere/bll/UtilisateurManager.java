package fr.eni.ecole.projectenchere.bll;



import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.UtilisateursDAO;


public class UtilisateurManager {

	private UtilisateursDAO daoUtilisateur;

	public UtilisateurManager() {
		//Instancier le Data Acess Object (DAO)
		//Charger une instance de l'utilisateurdaojdbcimpl via la factory
		daoUtilisateur = DAOFactory.getUtilisateursDAO();
	}
	//Appeler la DAO
	//Appeler une méthode qui recherche l'email
	//"" recherche pseudo
	//
	
	/**
	 * parcourir tous les emails SELECTALL
	 * @param newUtilisateur
	 * @throws DALException 
	 * @throws BLLException
	 */
	public void addUtilisateur(Utilisateur newUtilisateur) throws BLLException {
		//Vérifier que le mail n'hésite pas déjà
	//faire appel à la methode getEmail de la UtilisateurDAOjdbcImpl
	
		if(newUtilisateur.getEmail()!=null) {
			throw new BLLException("Cet email existe déjà");
		}
		try {
			validerUtilisateur(newUtilisateur);
			daoUtilisateur.insert(newUtilisateur);
		} catch (DALException e) {
			throw new BLLException("Echec addUtilisateur", e);
		}
	}
	
	//vérification email 
	public Utilisateur validerEmail(String email) {
    Utilisateur utilisateur = new Utilisateur();
    boolean checkFormulaire;
    
    try {
		UtilisateursDAO utilisateurDao = null;
		utilisateur = utilisateurDao.getUserByEmail(email);
	} catch (Exception e) {
		e.printStackTrace();
	}
    if (utilisateur.getEmail().isEmpty()) {
		return utilisateur;
	}else {
		checkFormulaire = false;
	}
	return null;
   
    
    }  
	
	private void validerUtilisateur(Utilisateur u) throws BLLException {
		boolean valide =  true;
		StringBuffer sb = new StringBuffer();

		if (u==null) {
			throw new BLLException("Utilisateur null");
		}
		if (u.getPseudo()==null) {
			sb.append("Veuillez saisir un pseudo. \n");
			valide = false;
		}
		if (u.getNom()==null) {
			sb.append("Veuillez saisir un nom. \n");
			valide = false;
		}
		if (u.getPrenom()==null) {
			sb.append("Veuillez saisir un prénom. \n");	
			valide = false;	
		}
		if (u.getEmail()==null) {
			sb.append("Veuillez saisir une adresse mail. \n");
			valide = false;
		}
		if (u.getTelephone()==null) {
			sb.append("Veuillez saisir un numéro de téléphone. \n");
			valide = false;
		}
		if (u.getRue()==null) {
			sb.append("Veuillez saisir un nom de rue. \n");
			valide = false;
		}
		if (u.getCodePostal()==null) {
			sb.append("Veuillez saisir un code postal. \n");
			valide = false;
		}
		if (u.getVille()==null) {
			sb.append("Veuillez saisir une ville.  \n");
			valide = false;
		}
		if (u.getMotDePasse()==null) {
			sb.append("Veuillez saisir un mot de passe. \n");
			valide = false;
		}
		
		if (!valide) {
			throw new BLLException(sb.toString());
		}
	}

	//valider le pseudo
		private void validationPseudo(String pseudo) throws Exception {
			if (pseudo == null) {
				throw new Exception("Veuillez saisir un pseudo");
				//le pseudo n'accepte que des caractères alphanumérique
			}else if (pseudo != null && !pseudo.matches("[A-Za-z0-9_]+")){
				throw new Exception("Le pseudo saisi n'est pas valide");
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
				} //doit-on définir la taille des champs
			}else {
				throw new Exception("Merci de saisir et confirmer votre mot de passe.");
			}
			}
	
			//valider adresse 
			private void validationAdresse(String rue, String codePostal, String ville) {
			//rue, ville et codePostal pas de caractere autre que lettre et nombre
				//codePostale ne doit pas contenir plus de 5 chiffres et ne doit pas contenir autre chose que des chiffres
			}
	
			private void validationTelephone(String telephone) throws Exception {
				if (telephone != null && telephone.trim().length()!= 0) {
					if (telephone.trim().length()>10) {
						throw new Exception("Le numéro de téléphone doit comporter au moins 10 chiffres");
					} // le téléphone ne doit pas comporter de lettre ou de caractères
					// le premier chiffre est toujours un 0
					
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
				//si l'email existe déjà le spécifier
				//vérifier si l'email existe deja dans la base de donnée
				
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


