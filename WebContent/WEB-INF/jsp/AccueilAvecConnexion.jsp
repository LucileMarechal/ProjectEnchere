<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil</title>
</head>
<body>

	<h1>ENI-Encheres</h1>
	<a href="#">S'inscrire - Se connecter</a>

	<h2>Liste des enchères</h2>

	<P>Filtres :</P>

	<form action="" method="post">
		<input type="search">
		<button>RECHERCHE</button>
	</form>

	<!-- Catégorie avec liste déroulante -->
	<label>Catégorie : </label>
	<select>
		<option>Toutes</option>
		<option>Informatique</option>
		<option>Ameublement</option>
		<option>Vêtement</option>
		<option>Sport&Loisirs</option>
	</select>
	
	<!-- Choix Achats et mes ventes -->
	<form>
	<input type="radio" id="achats" name="achats" value="achats" checked>>
	</form>
	
	<!-- à compléter avec la liste des enchères en cours-->
	<hr>
	<h3>Liste des enchères en cours à afficher</h3>
	<!-- à compléter avec la liste des enchères en cours-->


</body>
</html>