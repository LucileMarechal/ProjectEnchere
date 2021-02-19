
select GETDATE()


SET DATEFORMAT dmy;
SELECT nom_article, prix_initial, date_fin_encheres, pseudo, ARTICLES_VENDUS.no_categorie
			FROM ARTICLES_VENDUS
			INNER JOIN UTILISATEURS ON  ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur
			INNER JOIN CATEGORIES ON CATEGORIES.no_categorie = ARTICLES_VENDUS.no_categorie
			WHERE libelle like 'Informatique' and date_fin_encheres > GETDATE()

SELECT nom_article, prix_initial, date_fin_encheres, pseudo, ARTICLES_VENDUS.no_categorie, UTILISATEURS.no_utilisateur
			FROM ARTICLES_VENDUS
			INNER JOIN UTILISATEURS ON  ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur
			WHERE date_fin_encheres > getdate()

