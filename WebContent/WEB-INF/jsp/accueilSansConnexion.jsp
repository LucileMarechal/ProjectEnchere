<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/css/bootstrap.css">
<title>Accueil</title>
</head>
<body>

<div class="row">
  <div class="col-md-1 col-lg-8" class="text-left"><h1>ENI-Enchères</h1></div>
  <div class="col-xs-6 col-lg-4"><a href="<%=request.getContextPath()%>/SinscrireSeConnecter.html">S'inscrire - Se connecter</a></div>
</div>

<div class="row">
  <div class="col-lg-6 col-lg-4"></div>
  <div class="col-lg-6 col-lg-4"><h2>Liste des enchères</h2></div>
  <div class="col-lg-6 col-lg-4"></div>
</div>

	

	<P>Filtres :</P>

	<form action="" method="get">
		<input type="search">
		<button class="btn btn-success">RECHERCHE</button>
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