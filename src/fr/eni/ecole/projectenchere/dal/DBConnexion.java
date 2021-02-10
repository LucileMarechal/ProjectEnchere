package fr.eni.ecole.projectenchere.dal;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnexion {

	public static Connection seConnecter() throws DALException {
		Connection connection = null;
		InitialContext jndi = null;
		DataSource dsEnchere = null;
		
		try {
			jndi = new InitialContext();
		} catch (NamingException e) {
			throw new DALException("Erreur d'accès au contexte initial JNDI", e);
		}

		try {
			dsEnchere = (DataSource) jndi.lookup("java:comp/env/dsEncheres");
		} catch (NamingException e) {
			throw new DALException("Objet est introuvable dans l'arbre JNDI", e);
		}

		//Obtention de la connexion � la BDD � partir de la dataSource

		try {
			connection = dsEnchere.getConnection();
		} catch (SQLException e) {
			throw new DALException("Impossible d'obtenir une connexion", e);
		}

		return connection;
	}

	public static void seDeconnecter (Connection connection) throws DALException {

		try {
			if(connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new DALException("Impossible de fermer la connexion", e);
		}
		seDeconnecter(connection);
	}
}
