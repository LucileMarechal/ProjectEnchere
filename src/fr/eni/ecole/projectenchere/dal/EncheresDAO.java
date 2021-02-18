package fr.eni.ecole.projectenchere.dal;

import java.util.List;

import fr.eni.ecole.projectenchere.bo.Enchere;


public interface EncheresDAO {

public void insert(Enchere encheres) throws DALException;
	
	public void uptade(Enchere encheres) throws DALException;
	
	public void delete(Enchere encheres) throws DALException;
	
	List<Enchere> selectAll() throws DALException;
	
	
	
}
