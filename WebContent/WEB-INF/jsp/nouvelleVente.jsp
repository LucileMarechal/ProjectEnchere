
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>


<div class="d-flex justify-content-center">
	<h1>Nouvelle vente</h1>
</div>

<div class="ml-3">
	<!-- Création des catégories Article et Description -->
<form method="post" action="<%=request.getContextPath()%>/NouvelleVente.html">
		<div>
			<label>Article</label> <input type="text" name="sarticle">
		</div>

		<br>
		<div>
			<label>Description</label> <input type="text" name="sdescription">
		</div>
		<br>
		<!-- Catégorie avec menu déroulant -->
		<div>
			<label>Catégorie</label>
			<select name="Categorie">
				<option value="1">Informatique</option>
				<option value="2">Ameublement</option>
				<option value="3">Vêtement</option>
				<option value="4">Sport&#38;Loisirs</option>
			</select>
		</div>
		<br>
		
		<!-- Uploader une photo -->
		<div>
			<label for="article">Photo de l'article</label> <input type="file"
				id="article" name="article" accept="image/png, image/jpeg">
		</div>
		<br>
		
		<!--  Menu déroulant pour le prix -->
		<div>
			<label for="prix">Mise à prix</label> <input type="number" id="prix"
				name="sprix" min="1" max="1000">
		</div>
		
		<!-- Date de début et de fin enchere--> 
		<div>
			<label for="debut">Début de l'enchère</label>
		</div>
		<input type="date" id="debut" name="sdate_debut" value="/ /">
		<br>
		<div>
			<label for="fin">Fin de l'enchère</label>
		</div>
		<input type="date" id="debut" name="sdate_fin" value="/ /">

		<br>
	<br>

	<!-- Partie retrait -->
	<fieldset>
		<legend>Retrait</legend>
		<div>
			<label>Rue :</label> <input type="text" name="srue">
		</div>
		<br>
		<div>
			<label>Code Postal :</label> <input type="text" name="scodepostal">

		</div>
		<br>
		<div>
			<label>Ville :</label> <input type="text" name="sville">

		</div>
		<br>
	</fieldset>
	
	<!--  Enregistrer ou Annuler -->

	<div>
		<input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Enregistrer">
	</div>
</form>
<br>

<form method="get" action="<%=request.getContextPath()%>/accueilAvecConnexion.html">
	<div>
		<input class="btn btn-outline-danger" type="submit" value="Annuler">
	</div>
</form>

<!--  en fonction de la date de début d'enchere et la tete du jour, bouton "annuler la vente" -->

</div>
</body>
</html>