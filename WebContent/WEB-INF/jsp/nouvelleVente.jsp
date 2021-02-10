
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

	<h1>Nouvelle vente</h1>

	<!-- Création des catégories Article et Description -->

		<div>
			<label>Article</label> <input type="text">
		</div>

		<br>
		<div>
			<label>Description</label> <input type="text">
		</div>
		<br>
		<!-- Catégorie avec menu déroulant -->
		<div>
			<label>Catégorie</label> <select>
				<option>Informatique</option>
				<option>Ameublement</option>
				<option>Vêtement</option>
				<option>Sport&Loisirs</option>
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
				name="prix" min="1" max="1000">
		</div>
		
		<!-- Date de début et de fin enchere--> 
		<div>
			<label for="debut">Début de l'enchère</label>
		</div>
		<input type="date" id="debut" name="date_debut" value="/ /">
		<br>
		<div>
			<label for="fin">Fin de l'enchère</label>
		</div>
		<input type="date" id="debut" name="date_fin" value="/ /">

		<br>
	<br>

	<!-- Partie retrait -->
	<fieldset>
		<legend>Retrait</legend>
		<div>
			<label>Rue :</label> <input type="text">
		</div>
		<br>
		<div>
			<label>Code Postal :</label> <input type="text">

		</div>
		<br>
		<div>
			<label>Ville :</label> <input type="text">

		</div>
		<br>
	</fieldset>
	
	<!--  Enregistrer ou Annuler -->

	<div>
	<a href="<%= request.getContextPath() %>/accueilAvecConnexion.html">
		<input type="submit" value="Enregistrer">
		</a>
	</div>
	<br>
	<div>
	<a href="<%= request.getContextPath() %>/accueilAvecConnexion.html">
		<input type="submit" value="Annuler"></a>
	</div>
	<!--  en fonction de la date de début d'enchere et la tete du jour, bouton "annuler la vente" -->

</body>
</html>