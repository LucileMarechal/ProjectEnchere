package fr.eni.ecole.projectenchere.dal;

import fr.eni.ecole.projectenchere.bo.Retrait;

public interface RetraitsDAO {

	public void insert(Retrait retrait) throws DALException;
	
//	public void uptade(Retrait retrait) throws DALException;
//	
//	public void delete(Retrait retrait) throws DALException;
	
	public Retrait selectByNoRetrait(Integer noRetrait) throws DALException;
	
	
	
	
	
}
