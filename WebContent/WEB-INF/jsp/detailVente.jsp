
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

	<h1>Détail vente</h1>
	<div>
		<label><a href="Nom de l'article"></a>Titre de l'article</label>
	</div>
	<br>
	<div>
		<label><a href="Description"></a>Description :</label>
	</div>
	<br>
	<div>
		<label><a href="categorie"></a>Catégorie :</label>
	</div>
	<br>
	<div>
		<label>Meilleure offre :</label>
	</div>
	<br>
	<div>
		<label>Mise à prix :</label>
	</div>
	<br>
	<div>
		<label>Fin de l'enchère :</label>
	</div>
	<br>
	<div>
		<label>Retrait :</label>
	</div>
	<br>
	<div>
		<label>Vendeur :</label>
	</div>
	<br>
	<div>
		<label for="prix">Ma proposition :</label> <input type="number"
			id="prix" name="prix" min="1" max="1000">
	</div>
	<br>
	<div>
		<input type="submit" value="Ench�rir">
	</div>
	<!-- Si l'action permettant d'ench�rir a bien fonctionn�, 
	ce sera la page d'accueil qui sera affich�e avec un message du type 
	"votre ench�re a bien �t� prise en compte". 
	Si l'action permettant d'ench�rir �choue, on reste sur la page 
	en cours et on affiche le message � l'origine de l'erreur -->
</body>
</html>