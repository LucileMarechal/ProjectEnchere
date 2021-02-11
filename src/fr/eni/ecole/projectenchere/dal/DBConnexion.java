package fr.eni.ecole.projectenchere.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnexion {

	public static Connection seConnecter() throws DALException {
		Connection connection = null;
		InitialContext jndi = null;
		DataSource dsEncheres = null;
		

		try {
			jndi = new InitialContext();
		} catch (NamingException e) {
			throw new DALException("Erreur d'accès au contexte initial JNDI", e);
		}

		try {
			dsEncheres = (DataSource) jndi.lookup("java:comp/env/dsEncheres");
		} catch (NamingException e) {
			throw new DALException("Objet est introuvable dans l'arbre JNDI", e);
		}

		//Obtention de la connexion � la BDD � partir de la dataSource

		try {
			connection = dsEncheres.getConnection();
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
		
	}

	public static void seDeconnecter(Connection cnx, PreparedStatement pstmt) throws DALException {
		try {
			if (pstmt != null) {
				pstmt.close();
			}
			
		} catch (SQLException e1) {
			throw new DALException("Impossible d'obtenir le PreparedStatement : "+e1.getMessage());
		}
		seDeconnecter(cnx);
		
	}
}
