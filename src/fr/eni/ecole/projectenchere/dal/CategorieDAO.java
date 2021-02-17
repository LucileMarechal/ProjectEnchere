package fr.eni.ecole.projectenchere.dal;

import java.util.List;


import fr.eni.ecole.projectenchere.bo.Categories;

public interface CategorieDAO {
	
	List<Categories> selectAll() throws DALException;

}
