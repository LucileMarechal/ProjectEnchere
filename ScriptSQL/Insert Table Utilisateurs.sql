INSERT INTO [dbo].[UTILISATEURS]
           ([pseudo]
           ,[nom]
           ,[prenom]
           ,[email]
           ,[telephone]
           ,[rue]
           ,[code_postal]
           ,[ville]
           ,[mot_de_passe]
           ,[credit]
           ,[administrateur])
 VALUES
 ('LePanda', 'Cover','Harry', 'harry_cover@gmail.com','0123456789', 
 '3 rue des coquelicots', '14200', 'Granville','bonjour', 100, 1),

 ('Pluto', 'Disney', 'Mickey', 'mickey@gmail.com',null,
 '5 boulevard Walt Disney','50400','Romainville','salut', 600 ,0),

 ('Simba', 'Lelion', 'Mufasa', 'mufasa_lelion@gmail.com',null,
 '1 impasse de la grotte','44000','Nantes','aurevoir', 500, 0),

 ('zelda', 'Hyrule', 'Link', 'link_et_zelda@gmail.com',null,
 '3 rue du chateau','89000','Village des gorons','epona', 1000, 0),

('Bobby', 'Marley', 'Bob', 'bobmarley@gmail.com',null,
'15 rue de babylone','13000','Marseille','reggae', 500, 0),

 ('bohemian', 'Mercury','Freddy', 'fred_mercury@gmail.com','0606060606', 
 '26 boulevard des bicyles', '35000', 'Rennes','pouet', 250, 0),

 ('friends', 'Geller', 'Monica', 'momoninicaca@gmail.com',null,
 '65 boulevard du café des amis','06400','New York','amis', 680 ,0),

 ('Cookie', 'Buffay', 'Phoebe', 'fibiBouffait@gmail.com',null,
 '65 boulevard du café des amis','06400','New York','amis', 200, 0),

 ('LeDino', 'LeDinosaure', 'Denver', 'dernier_dinosaure@gmail.com',null,
 'impasse du nid du dragon','54000','Denver','fireplease', 50, 0),

('Pikaaa', 'Pika', 'Pikachu', 'pikapikachuuu@gmail.com',null,
'allée des Pokemon','14000','Pokeville','pokemon', 3, 0);