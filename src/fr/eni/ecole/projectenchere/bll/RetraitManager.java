package fr.eni.ecole.projectenchere.bll;

import fr.eni.ecole.projectenchere.bo.Retrait;
import fr.eni.ecole.projectenchere.dal.DALException;
import fr.eni.ecole.projectenchere.dal.DAOFactory;
import fr.eni.ecole.projectenchere.dal.RetraitsDAO;

public class RetraitManager {

	private RetraitsDAO daoRetraits;
	public RetraitManager() {
		//Instancier le DAO
		//Charger une instance de RetraitsDAoJdbcImpl via la factory
		daoRetraits = DAOFactory.getRetraitsDAO();
	}
	
	public void insertRetrait(Retrait newRetrait) throws BLLException {
		if (newRetrait.getNoRetrait()!=null) {
			throw new BLLException("Retrait déjà existant");
		}

	}
	
	
	
	
	//Méthode selectByNoRetrait
	public Retrait selectByNoRetrait (Integer no_retrait) throws BLLException {
		
		Retrait retrait = null;
		
		try {
			retrait = daoRetraits.selectByNoRetrait(no_retrait);
		} catch (DALException e) {
			throw new BLLException("Echec récupération no_retrait", e);
		}
		
		return retrait;
		
	}
}
