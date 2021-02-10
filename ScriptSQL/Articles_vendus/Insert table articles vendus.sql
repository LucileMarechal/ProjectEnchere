INSERT INTO [dbo].[ARTICLES_VENDUS]
           ([nom_article]
           ,[description]
           ,[date_debut_encheres]
           ,[date_fin_encheres]
           ,[prix_initial]
           ,[prix_vente]
		   ,[no_utilisateur]
		   ,[no_categorie])
VALUES

('PC Gamer', 'ordinateur pour jouer', '2021-02-15', '2021-02-28', 150, 200, 18, 1),

('PC Work', 'ordinateur pour travailler', '2021-02-17', '2021-03-20', 200, 250, 20, 1),

('Fauteuil', 'fauteuil de bureau', '2021-04-19', '2021-04-25', 50, 150, 21, 2),

('Commode', 'rangement fringues', '2021-06-12', '2021-06-30', 20, 180, 23, 2),

('Robe', 'robe de mariage', '2021-05-17', '2021-06-17', 200, 1000, 22, 3),

('T-shirt', 't-shirt avec Pikachu', '2021-03-08', '2021-03-18', 10, 15, 25, 3),

('Pantalon', 'jean Levis', '2021-09-10', '2021-10-10', 60, 180, 27, 3),

('Baudrier', 'baudrier pour escalade en extérieur', '2021-06-10', '2021-07-15', 30, 35, 26, 4),

('Ballon', 'ballon de volley Wilson', '2021-11-19', '2021-11-20', 10, 10, 24, 4),

('Marmite', 'cocotte minute géante', '2021-12-12', '2021-12-24', 75, 150, 23, 4);



