<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/css/bootstrap.css">
<title>Accueil</title>
</head>
<body>
<!-- Test -->
	<h1>ENI-Enchères</h1>
	<!-- HREF à FAIRE -->
	<a class="connexion" href="<%=request.getContextPath()%>/SinscrireSeConnecter.html">S'inscrire - Se connecter</a>

	<h2 class="ListesEncheres">Liste des enchères</h2>

	<P>Filtres :</P>

	<form action="" method="get">
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
		<option>Sport&#38;Loisirs</option>
	</select>
	<hr>
	
	
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->	
	<h3> Liste des enchères en cours à afficher</h3>
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->

</body>
</html>