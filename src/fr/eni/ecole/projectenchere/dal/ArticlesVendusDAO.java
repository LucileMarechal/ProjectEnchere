package fr.eni.ecole.projectenchere.dal;

import java.util.List;

import fr.eni.ecole.projectenchere.bo.ArticleVendu;

public interface ArticlesVendusDAO {
	
	public void insert(ArticleVendu articleVendu) throws DALException;
	
	public void update(ArticleVendu articleVendu) throws DALException;
	
	public void selectById(Integer no_article) throws DALException;
	
	public void delete(Integer articleVendu) throws DALException;
	
	List<ArticleVendu> selectAll() throws DALException;

}
