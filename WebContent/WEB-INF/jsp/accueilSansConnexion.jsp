<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="fr.eni.ecole.projectenchere.bo.ArticleVendu"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/css/bootstrap.css">
<script src="<%= request.getContextPath() %>/javascript/js.js"></script>
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

	<form action="" method="post">
		<input type="search" name="sRechercher" placeholder="Search" aria-label="Search">
		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Rechercher</button>
	</form>

	<!-- Catégorie avec liste déroulante -->
	<label>Catégorie : </label>
	<form method="post">
		<select name="Catégorie">
			<option>Toutes</option>
			<option>Informatique</option>
			<option>Ameublement</option>
			<option>Vêtement</option>
			<option>Sport&#38;Loisirs</option>
		</select>
	</form>
	<hr>
	
	
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->	
		<div class="d-flex flex-wrap">
			<%
			List<ArticleVendu> liste = (List<ArticleVendu>) request.getAttribute("listeArticles");
			for(ArticleVendu articleVendu : liste){
				String nom = articleVendu.getNomArticle();
				int prix =articleVendu.getPrixInitial();
				Date date = articleVendu.getDateFinEncheres();
				String vendeur = articleVendu.getPseudo();
				%>
				<div class="card border-primary m-1 p-2" style="max-width: 18rem;">
				<div class="card-header"><%=nom %></div>
				<img alt="#image" src="">
				<h5 class="card-title">Prix : <%=prix %> k&#128;</h5>
				<p class="card-text">Date de fin d'enchère : <%=date %><br></p>
				<p> Vendeur : <a href="#"><%=vendeur %></a></p>
				</div>
			<%}%>
		</div>
	
	
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->

</body>
</html>