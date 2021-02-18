package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.eni.ecole.projectenchere.bo.Retrait;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;
import fr.eni.ecole.projectenchere.dal.RetraitsDAO;

public class RetraitsDAOJdbcImpl implements RetraitsDAO {

		//CONSTANTES : no_retrait auto incrementé ? PK 
	private static final String INSERT_RETRAIT = "INSERT INTO retraits (rue, code_postal, ville) VALUES(?, ?, ?";
	
	
	private static final String SELECT_BY_NO_RETRAIT = "SELECT no_retrait, rue, code_postal, ville" +
	"FROM retraits";
	
	
	//Methodes implémentées
	public void insert(Retrait retrait) throws DALException {
		Connection cnx = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
	
		cnx = DBConnexion.seConnecter();
		
		try {
			cnx.setAutoCommit(false);
			pstmt = cnx.prepareStatement(INSERT_RETRAIT);
			pstmt.setString(1, retrait.getRue());
			pstmt.setString(2, retrait.getCode_postal());
			pstmt.setString(3, retrait.getVille());
	
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				retrait = new Retrait(rs.getString("rue"), rs.getString("Code_Postal"), rs.getString("ville"));
			}
		}catch (SQLException e) {
			throw new DALException("Problème pendant insert :" +e);
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (cnx != null) {
					cnx.close();
				}
			} catch (SQLException e) {
				throw new DALException("Problème sur la méthode ajouter INSERT_RETRAIT -" +e);
			}finally {
				try {
					cnx.setAutoCommit(true);
					DBConnexion.seDeconnecter(cnx, pstmt);
				} catch (SQLException e) {
					throw new DALException("Problème sur la déconnexion");				}
			}
		}
		
	}


	@Override
	public Retrait selectByNoRetrait(Integer no_retrait) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

}
