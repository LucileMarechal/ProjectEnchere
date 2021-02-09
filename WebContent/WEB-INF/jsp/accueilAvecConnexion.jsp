<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
<!-- Test -->
	<h1>ENI-Encheres</h1>
	<!-- HREF à FAIRE -->
	<a href="#">Vendre un article</a>
	<a href="#">Mon profil</a>
	<a href="#">Déconnexion</a>

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
		<option>Sport&#38;Loisirs</option>
	</select>
	<br>

	<!-- RESTE Dévalidation des checkbox à faire selon Achats ou Mes Ventes -->
	<input type="radio" id="achats" name="name" value="achats" checked>
	<label for="achats">Achats</label>
	<div>
  		<input type="checkbox" id="enchOuvertes" name="enchOuvertes"><label for="enchOuvertes"> Enchères ouvertes</label><br>
  		<input type="checkbox" id="mesEncheres" name="mesEncheres"><label for="mesEncheres"> Mes enchères</label><br>
  		<input type="checkbox" id="reporte" name="reporte"><label for="reporte"> Mes enchères reportées</label><br><br>
	</div>

	<input type="radio" id="ventes" name="name" value="ventes">
	<label for="ventes">Mes ventes</label>
	<div>
  		<input type="checkbox" id="enCours" name="encours"><label for="encours"> Mes ventes en cours</label><br>
  		<input type="checkbox" id="nonDebute" name="nonDebute"><label for="nonDebute"> Ventes non débutées</label><br>
  		<input type="checkbox" id="termine" name="termine"><label for="termine"> Ventes terminées</label><br>
	</div>

	<hr>

	<h3> Liste des enchères en cours à afficher</h3>

</body>
</html>