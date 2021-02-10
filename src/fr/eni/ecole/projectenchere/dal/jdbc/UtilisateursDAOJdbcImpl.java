package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import fr.eni.ecole.projectenchere.bo.Utilisateur;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;
import fr.eni.ecole.projectenchere.dal.UtilisateursDAO;

public class UtilisateursDAOJdbcImpl implements UtilisateursDAO {
	
	//Constantes
	 private static final String INSERT_UTILISATEUR = "INSERT INTO Utilisateurs (pseudo, nom, prenom, email, "
	 		+ "telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur)"
	 		+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	 private static final String UPDATE_UTILISATEUR = "UPDATE Utilisateurs SET (pseudo = ?, nom = ?, prenom = ?,"
	 		+ "email = ?, telephone = ?, rue = ?, code_postal = ?, ville = ?, credit = ?, administrateur = ?)"
	 		+ "WHERE no_utilisateur = ?";
	 
	 private static final String SELECT_BY_ID_UTILISATEUR = "SELECT pseudo, nom, prenom, email, telephone, rue,"
	 		+ "code_postal, ville, mot_de_passe, credit, administrateur FROM Utilisateurs WHERE no_utilisateur = ?";
	
	 private static final String DELETE_BY_ID_UTILISATEUR = "DELETE FROM Utilisateurs WHERE no_utilisateur = ?";
	 
	 private static final String SELECT_ALL_UTILISATEUR = "SELECT no_utilisateur, pseudo, prenom, nom, email, telephone,"
	 		+ "rue, code_postal, ville, mot_de_passe, credit, administrateur FROM Utilisateurs";

	 
	@Override
	public void insert(Utilisateur utilisateur) throws DALException {
		if (utilisateur == null) {
			throw new DALException("Pas d'utilisateur en paramètre");
		}
		
		Connection connexion = DBConnexion.seConnecter();
		
		try {
			// désactivation de l'auto commit
			connexion.setAutoCommit(false);
			// insertion des utilisateurs et récupération de l'identity
			PreparedStatement pstmt = connexion.prepareStatement(INSERT_UTILISATEUR, PreparedStatement.RETURN_GENERATED_KEYS);
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (SQLException e) {
			throw new DALException(e.getMessage());
		}
		
		
	}


	@Override
	public void update(Utilisateur utilisateur) throws DALException {
		
		
	}


	@Override
	public void selectById(Integer no_utilisateur) throws DALException {
		
		
	}


	@Override
	public void delete(Integer no_utilisateur) throws DALException {
		
		
	}


	@Override
	public List<Utilisateur> selectAll() throws DALException {
		List<Utilisateur> listeUtilisateurs = null;
		
		return listeUtilisateurs;
	}

	 
	 
}
