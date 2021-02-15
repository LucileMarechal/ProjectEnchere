SELECT nom_article, prix_initial, date_fin_encheres, pseudo
			FROM ARTICLES_VENDUS
			INNER JOIN UTILISATEURS ON  ARTICLES_VENDUS.no_utilisateur = UTILISATEURS.no_utilisateur
			where nom_article like 'ROBE';