
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Categories"%>
<%@page import="java.util.List"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>


<div class="d-flex justify-content-center">
	<h1>Nouvelle vente</h1>
</div>

<div class="ml-3">
	<!-- Création des catégories Article et Description -->

<form action="<%= request.getContextPath() %>/NouvelleVente.html" method="post">
	<label for="article">Article : <input type="text" id="article" name="sarticle" required></label><br>

	<label for="description">Description : <input type="text" id="description" name="sdescription" required></label> 

	<br>
		<!-- Catégorie avec menu déroulant -->
	<select name="Categorie">
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

		<br>
		
		<!-- Uploader une photo -->
		<br>
			<label for="article">Photo de l'article</label> <input type="file"
				id="article" name="article" accept="image/png, image/jpeg">
		<br>
		
		<!--  Menu déroulant pour le prix -->

			<label for="prix">Mise à prix</label> <input type="number" id="prix"
				name="sprix" min="1" max="1000">
		<br>		
		<!-- Date de début et de fin enchere--> 

			<label for="debut">Début de l'enchère</label>

		<input type="date" id="debut" name="sdate_debut" value="/ /">
		<br>

			<label for="fin">Fin de l'enchère</label>

		<input type="date" id="debut" name="sdate_fin" value="/ /">

		<br>
	<br>

	<!-- Partie retrait -->

		<legend>Retrait</legend>

	<label for="rue">Rue : <input type="text" id="rue" name="srue" required></label><br>

	<label for="codepostal">Code Postal : <input type="text" id="codepostal" name="scodepostal" required></label><br>
	
	<label for="ville">Ville : <input type="text" id="ville" name="sville" required></label><br>

	
	<!--  Enregistrer ou Annuler -->

	<div>
		<input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Enregistrer">
	</div>

<br>
</form>
<form method="get" action="<%=request.getContextPath()%>/accueilAvecConnexion.html">
	<div>
		<input class="btn btn-outline-danger" type="submit" value="Annuler">
	</div>
</form>

<!--  en fonction de la date de début d'enchere et la tete du jour, bouton "annuler la vente" -->

</div>
</body>
</html>