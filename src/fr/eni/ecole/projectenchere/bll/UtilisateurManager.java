package fr.eni.ecole.projectenchere.bll;



import java.sql.SQLException;

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

	//vérification email 
	public Utilisateur validerEmail(String email) {
		Utilisateur utilisateur = new Utilisateur();
		boolean checkFormulaire = true;

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
	public void addUtilisateur(Utilisateur newUser) throws BLLException {
		if (newUser.getNoUtilisateur()!=null) {
			throw new BLLException("utilisateur déjà existant");
		}
		try {
			validerUtilisateur(newUser);
			daoUtilisateur.insert(newUser);
		} catch (DALException e) {
			throw new BLLException("utilisateur déjà existant", e);
		}
	}

	public void validerUtilisateur(Utilisateur u) throws BLLException {
		//vérifier les différents champs du formulaire 

		boolean valide =  true;
		StringBuffer sb = new StringBuffer();

		if (u == null) {
			throw new BLLException("Utilisateur null");
		}
		
		if (u.getPseudo().isEmpty() || u.getPseudo().trim().length()> 30) {
			sb.append("Veuillez saisir un pseudo. \n");
			valide = false;		
		} else if (!u.getPseudo().matches("[A-Za-z0-9_]+")) {
			sb.append("Le pseudo saisi n'est pas valide. \n");
			valide = false;
		}
		if (u.getNom().isEmpty()) {
			sb.append("Veuillez saisir un nom \n");
			valide = false;
		}else if (u.getNom() == null || u.getNom().trim().length()>30) {
			sb.append("Le nom ne doit pas dépasser 30 caractères \n");
			valide = false;
		}
		if (u.getPrenom().isEmpty()) {
			sb.append("Veuillez saisir un prenom");
			valide = false;
		}else if (u.getPrenom() == null || u.getPrenom().trim().length()>30) {
			sb.append("Le prenom ne doit pas dépasser 30 caractères");
			valide = false;
		}
		if (u.getEmail() == null || u.getEmail().trim().length()>100)  {
			sb.append("Merci de saisir une adresse mail valide.\n");
			sb.append("L'adresse mail ne doit pas dépasser 100 caractères\n");
			valide = false;

		}else if (u.getEmail().isEmpty()) {
			sb.append("L'adresse mail doit être renseignée. \n");
			valide = false;
		}
		if (!u.getEmail().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")){
			sb.append("Merci de saisir une adresse mail valide.\n");
			valide = false;
		}
			if (u.getTelephone() == null || u.getTelephone().trim().length()>10) {
				sb.append("Le numéro de téléphone doit comporter au moins 10 chiffres \n");
				valide = false;
			}else if (!u.getTelephone().matches("([0-9][0-9])+")) {
				sb.append("Le numéro de téléphone saisi n'est pas valide \n");
				valide = false;
			}else if (u.getTelephone().isEmpty()) {
				sb.append("Le numéro de téléphone doit être renseigné \n");
				valide = false;
			}
			if (u.getRue() == null || u.getRue().trim().length()>50) {
				sb.append("Merci de saisir un nom de rue valide \n");
				valide = false;
			}else if (u.getRue() == null) {
				sb.append("Merci de saisir un nom de rue \n ");
				valide = false;
			}
			if (u.getCodePostal() == null || u.getCodePostal().trim().length()>5) {
				sb.append("Le code postal doit comporter 5 chiffres \n");
				valide = false;
			}else if (u.getCodePostal().isEmpty()) {
				sb.append("Veuillez saisir un code postal \n");
				valide = false;
			}
			if (u.getVille() == null || u.getVille().length()>30) {
				sb.append("Merci de saisir un nom de ville valide \n");
				valide = false;
			}else if (u.getVille().isEmpty()) {
				sb.append("Merci de saisir un nom de ville \n ");
				valide = false;
			}

			if (!valide) {
				throw new BLLException(sb.toString());
			}
		}

		public void validerMotDePasse (String motDePasse, String confirmationMDP) throws BLLException {

			boolean valide =  true;
			StringBuffer sb = new StringBuffer();

			if (motDePasse != null && motDePasse.trim().length()!=0 
					&& confirmationMDP != null && confirmationMDP.trim().length() != 0) {
				if (!motDePasse.equals(confirmationMDP)) {
					sb.append("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
					valide = false;
				}else if (motDePasse.trim().length() < 6) {
					sb.append("Les mots de passe doivent contenir au moins 6 caractères.");
					valide = false;
				} //doit-on définir la taille des champs
			}else {
				sb.append("Merci de saisir et confirmer votre mot de passe.");
				valide = false;
			}
			if (!valide) {
				throw new BLLException(sb.toString());
			}
		}
		
		public void InsertUtilisateur(Utilisateur u1) throws SQLException {
	         try {
	        	 daoUtilisateur.insert(u1);//Méthode présente dans la DAL
	        } catch (DALException e) {
	            e.printStackTrace();
	        }        
	     }

		
		public Utilisateur validerConnexionUtilisateur (String email, String pseudo, String password) throws BLLException {
		      Utilisateur utilisateur = new Utilisateur();
		      
		      boolean valide = true;
		      StringBuffer sb = new StringBuffer();

		      // tester si j'ai bien un pseudo, un mail et un password
		      // sinon message erreur
		      
		      
		      try {
		        utilisateur = daoUtilisateur.selectByMailPseudo(pseudo, email);
		      } catch (DALException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		      }
		      
		      
		      // pas besoin de ces méthodes car infos déjà en BDD
//		      if (utilisateur.getEmail() == null || utilisateur.getEmail().trim().length() == 0) {
//		            sb.append("L'adresse mail doit être renseignée");
//		            valide = false;
//		            return null;
//		      }
		//    
//		      if (utilisateur.getPseudo() == null || utilisateur.getPseudo().trim().length() == 0) {
//		            sb.append("\nLe pseudo doit être renseigné");
//		            valide = false;
//		            return null;
//		      }
		//    
//		      if (utilisateur.getMotDePasse() == null || utilisateur.getMotDePasse().trim().length() == 0) {
//		            sb.append("\nLe mot de passe doit être renseigné");
//		            valide = false;
//		            return null;
//		      }
		//    
		      // mauvaise condition...
		      // il faut chercher à comparer si le pseudo ou l'email de l'utilisateur 
		      // correspond bien à son password 
		      // et non à comparer l'email ou le pseudo avec le password
//		      if (email != password && pseudo != password) {
//		          sb.append("\nLe login ou mot de passe ne correspond pas");
//		          valide = false;
//		      }
		      
		      // comparer mot de passe saisi par utilisateur et celui en BDD
		      if (utilisateur.getMotDePasse().equals(password)) {
		        valide = true;
		        return utilisateur;
		      } else {
		        valide = false;
		        throw new BLLException("Le login ou le mot de passe renseigné n'est pas correct");
		      }
		  

		    }      

		    
		    public Utilisateur getUtilisateur(String pseudo) throws BLLException {
		      Utilisateur utilisateur = null;
		      
		      try {
		        utilisateur = daoUtilisateur.selectByPseudo(pseudo);
		      } catch (DALException e) {
		        throw new BLLException("Echec récupération utilisateur", e);
		      }
		      
		      return utilisateur;

		    }
		    
		
		
	}


