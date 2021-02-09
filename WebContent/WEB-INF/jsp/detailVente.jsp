<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Détail de la vente</title>
</head>
<body>
	<h1>Détail vente</h1>
	<div>
		<label><a href="Nom de l'article"></a>Titre de l'article</label>
	</div>
	<br>
	<div>
		<label><a href="Description"></a>Description :</label>
	</div>
	<br>
	<div>
		<label><a href="categorie"></a>Catégorie :</label>
	</div>
	<br>
	<div>
		<label>Meilleure offre :</label>
	</div>
	<br>
	<div>
		<label>Mise à prix :</label>
	</div>
	<br>
	<div>
		<label>Fin de l'enchère :</label>
	</div>
	<br>
	<div>
		<label>Retrait :</label>
	</div>
	<br>
	<div>
		<label>Vendeur :</label>
	</div>
	<br>
	<div>
		<label for="prix">Ma proposition :</label> <input type="number"
			id="prix" name="prix" min="1" max="1000">
	</div>
	<br>
	<div>
		<input type="submit" value="Enchérir">
	</div>
</body>
</html>