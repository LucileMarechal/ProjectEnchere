package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class ConnexionJdbcImpl {

	public static void main(String[] args) {
		Connection connection = null;
		Statement stmt = null;
		
		try {
			//ETAPE 1 : chargement du pilote JDBC
			DriverManager.registerDriver(new SQLServerDriver());
			
			//ETAPE 2 : Connection
			String url = "jdbc:sqlserver://127.0.0.1;databasename=ENCHERES";
			connection = DriverManager.getConnection(url, "sa", "Pa$$w0rd");
			
			//ETAPE 3 : Créer une requete avec le statement
			stmt = connection.createStatement();
			
			//ETAPE 4 : execution de la requete
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
				try {
					if (stmt!=null) {
						stmt.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

