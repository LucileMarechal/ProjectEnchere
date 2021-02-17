package fr.eni.ecole.projectenchere.dal.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import fr.eni.ecole.projectenchere.bo.Categories;
import fr.eni.ecole.projectenchere.dal.CategorieDAO;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DBConnexion;

public class CategoriDAOJdbcImpl implements CategorieDAO {
	
	//Constantes requete SQL
	private static final String SELECT_ALL_CATEGORIES = "SELECT * FROM categories";
	

	/**
	 * Cette méthode permet de selectionner toutes les catégories en BDD
	 */
	@Override
	public List<Categories> selectAll() throws DALException {
		ResultSet rs=null;
		Connection cnx=null;
		PreparedStatement pstmt=null;
		List<Categories> liste = null;
		Categories categorie = null;
		
		
		try {
			cnx = DBConnexion.seConnecter();
			pstmt = cnx.prepareStatement(SELECT_ALL_CATEGORIES);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				categorie = new Categories(rs.getInt("no_categorie"), rs.getString("libelle"));
				
				if (liste ==  null) {
					liste = new ArrayList<Categories>();
				}
				liste.add(categorie);
			}
		} catch (SQLException e) {
			throw new DALException("Erreur lors de la sélection de toutes les catégories : " +e);
		}finally {
			DBConnexion.seDeconnecter(cnx, pstmt);
		}
		
		
		return liste;
	}

}
