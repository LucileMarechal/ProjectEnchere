package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.eni.ecole.projectenchere.bo.Retrait;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;
import fr.eni.ecole.projectenchere.dal.RetraitsDAO;

public class RetraitsDAOJdbcImpl implements RetraitsDAO {

		//CONSTANTES : no_retrait auto incrementé ? PK 
	private static final String INSERT_RETRAIT = "INSERT INTO retraits (rue, code_postal, ville) VALUES (?, ?, ?);";
	
	
	private static final String SELECT_BY_NO_RETRAIT = " SELECT no_retrait, rue, code_postal, ville FROM retraits WHERE no_retrait=?";
	
	
	//Methodes implémentées
	public void insert(Retrait retrait) throws DALException {
		if (retrait == null) {
			throw new DALException("retrait null");
		}
		
		Connection cnx = null;
		PreparedStatement pstmt = null;
		
	
		cnx = DBConnexion.seConnecter();
		
		try {
			cnx.setAutoCommit(false);
			pstmt = cnx.prepareStatement(INSERT_RETRAIT, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, retrait.getRue());
			pstmt.setString(2, retrait.getCode_postal());
			pstmt.setString(3, retrait.getVille());
	
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			
			if (rs.next()) {
				int no_retrait = rs.getInt(1);
				retrait.setNoRetrait(no_retrait);	
			}
			
			pstmt.close();
			cnx.commit();
			
		}	catch (SQLException e) {
				e.printStackTrace();
				try {
				cnx.rollback();
				} catch (SQLException e1) {
				throw new DALException("Erreur lors de la création du retrait : " + retrait, e1);
				}
				throw new DALException("Erreur lors de la création d'un retrait : " + retrait, e);
				} finally {
				try {
				cnx.setAutoCommit(true);
				cnx.close();
				} catch (SQLException e) {
				throw new DALException("Erreur lors de la création d'un retrait : " + retrait, e);
				}
				}
		
	}


	@Override
	public Retrait selectByNoRetrait(Integer no_retrait) throws DALException {
		ResultSet rs = null;
		Retrait retrait = null;
		Connection cnx = null;
		PreparedStatement pstmt = null;
		
		cnx = DBConnexion.seConnecter();
		
		try {
			pstmt = cnx.prepareStatement(SELECT_BY_NO_RETRAIT);
			pstmt.setInt(1, no_retrait);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				retrait = new Retrait(rs.getInt("no_retrait"), rs.getString("rue"), rs.getString("code_postal"), rs.getString("ville"));
			}
		} catch (SQLException e) {
			throw new DALException("Problème pendant le selectyByNORetrait :" +e);
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (cnx != null) {
					cnx.close();
				}
			} catch (SQLException e) {
				throw new DALException("Erreur lors de la sélection du retrait par son numéro :" + no_retrait, e);
			}
		}
	
		return retrait;
	}

}











