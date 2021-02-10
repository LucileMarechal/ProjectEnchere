<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="./javascript/js.js"></script>
<title>Accueil</title>
</head>
<body>

	<h1>ENI-Encheres</h1>
	<!-- HREF à FAIRE -->
	<a href="<%=request.getContextPath()%>/NouvelleVente.html">Vendre un article</a>
	<a href="<%=request.getContextPath()%>/profilUtilisateur.html">  Mon profil</a>
	<a href="<%=request.getContextPath()%>/accueil.html">  Déconnexion </a>

	<h2>Liste des enchères</h2>

	<P>Filtres :</P>

	<form action="" method="post">
		<input type="search">
		<button>RECHERCHE</button>
	</form>
	<br>

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
	<br>

	<form>
	<div class="achat">
	<input type="radio" id="achats" name="name" value="achats" checked onclick="selectAchatOuVente(this)">
	<label for="achats">Achats</label><br>
  		<input type="checkbox" id="1" name="sAchats">
  		<label for="enchOuvertes"> Enchères ouvertes</label><br>
  		<input type="checkbox" id="2" name="sAchats">
  		<label for="mesEncheres"> Mes enchères</label><br>
  		<input type="checkbox" id="3" name="sAchats">
  		<label for="reporte"> Mes enchères reportées</label><br><br>
	</div>
	
	<div class="vente">
	<input type="radio" id="ventes" name="name" value="ventes" onclick="selectAchatOuVente(this)">
	<label for="ventes">Mes ventes</label><br>
  		<input type="checkbox" id="4" name="sVentes">
  		<label for="encours"> Mes ventes en cours</label><br>
  		<input type="checkbox" id="5" name="sVentes">
  		<label for="nonDebute"> Ventes non débutées</label><br>
  		<input type="checkbox" id="6" name="sVentes">
  		<label for="termine"> Ventes terminées</label><br>
	</div>
	</form>
	<br>
	<br>
	
	<hr>

<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->
	<h3> Liste des enchères en cours à afficher</h3>
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->

<form action="<%=request.getContextPath()%>/DetailVente.html" method="get">
<input  type="submit" value="Articles">
</form>

</body>
</html>