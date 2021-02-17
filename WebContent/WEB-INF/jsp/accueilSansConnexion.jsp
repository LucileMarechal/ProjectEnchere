<%@page import="fr.eni.ecole.projectenchere.bo.Categories"%>
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

<div class="d-flex justify-content-center">
	<h2>Liste des enchères</h2>
</div>

	<P>Filtres :</P>

	<form action="<%=request.getContextPath()%>/accueil.html" method="post">
		<input type="search" name="sRechercher" placeholder="Search" aria-label="Search">
		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Rechercher</button>
	</form>

	<!-- Catégorie avec liste déroulante -->
	<label>Catégorie : </label>
	<form action="<%=request.getContextPath()%>/Categorie.html" method="post">
		<select name="Categorie" onchange="submit()">
		<option value="0">Toutes</option>
		<%
		List<Categories> listeC = (List<Categories>) request.getAttribute("listeCategorie");
		for(Categories listeCat : listeC){
			int noCategorie = listeCat.getNoCategorie();
			String libelle = listeCat.getLibelle();
			%>
			<option value="<%=noCategorie%>"><%=libelle %></option>
		
		<%} %>
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
				<p> Vendeur : <%=vendeur %></p>
				</div>
			<%}%>
		</div>
	
	
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->

</body>
</html>