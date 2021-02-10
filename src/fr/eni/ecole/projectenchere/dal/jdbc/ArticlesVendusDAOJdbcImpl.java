package fr.eni.ecole.projectenchere.dal.jdbc;

public class ArticlesVendusDAOJdbcImpl {
	
	// constantes
	// INSERT ARTICLES VENDUS : no_article auto incrémenté : PK
	private static final String INSERT_ARTICLES_VENDUS = "INSERT INTO articles_vendus(nom_article, description, date_debut_enchere,"
			+ "prix_initial, prix_vente, no_utilisateur, no_categorie) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
	
	
	
	

}
