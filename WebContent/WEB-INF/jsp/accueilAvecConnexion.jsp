
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Categories"%>
<%@page import="fr.eni.ecole.projectenchere.bo.ArticleVendu"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>


	<a href="<%=request.getContextPath()%>/NouvelleVente.html">Vendre un article</a>
	<a href="<%=request.getContextPath()%>/profilUtilisateur.html">  Mon profil</a>
	<a href="<%=request.getContextPath()%>/accueil.html">  Déconnexion </a>

	<h2>Liste des enchères</h2>

	<P>Filtres :</P>

	<form action="<%=request.getContextPath()%>/accueilAvecConnexion.html" method="post">
		<input type="search" name="sRechercher" placeholder="Search" aria-label="Search">
		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Rechercher</button>
	</form>

	<!-- Catégorie avec liste déroulante -->
	<label>Catégorie : </label>
	<label>Catégorie : </label>
	<form action="<%=request.getContextPath()%>/Categorie.html" method="get">
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
	<br>
	<br>

	<form>
	<div class="achat">
	<input type="radio" id="achats" name="name" value="achats" checked onclick="selectAchatOuVente(this)">
	<label for="achats">Achats</label><br>
		
  		<input type="checkbox" id="1" name="sAchats" checked>
  		<label for="enchOuvertes" > Enchères ouvertes</label><br>
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
				<div class="card-header"><a href="<%=request.getContextPath()%>/DetailVente.html"><%=nom %></a></div>
				<img alt="#image" src="">
				<h5 class="card-title">Prix : <%=prix %> k&#128;</h5>
				<p class="card-text">Date de fin d'enchère : <%=date %><br></p>
				<p> Vendeur : <a href="<%=request.getContextPath()%>/profilUtilisateur.html"><%=vendeur %></a></p>
				</div>
			<%}%>
		</div>
<!-- RETOUR DAL A FAIRE POUR AFFICHAGE DE LA LISTE -->



</body>
</html>