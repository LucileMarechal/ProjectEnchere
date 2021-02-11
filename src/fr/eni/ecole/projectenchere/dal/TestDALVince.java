package fr.eni.ecole.projectenchere.dal;

import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.jdbc.UtilisateursDAOJdbcImpl;

public class TestDALVince {

	public static void main(String[] args) throws DALException {
		
		UtilisateursDAOJdbcImpl UtilisateurDAO = new UtilisateursDAOJdbcImpl();
		
		Utilisateur u1 = new Utilisateur(18, "LePanda", "Cover", "Herry", "harry_cover@gmail.com", "0123456789", "3 rue des coquelicots", "14200", "Granville");
		System.out.println("nouvel utilisateur : " + u1);
		
		
		try {
			UtilisateurDAO.insert(u1);
		} catch (DALException e) {
			throw new DALException ("Erreur lors de la création d'un utilisateur : " + u1, e);
		}

	}
		

}
