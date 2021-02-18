
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.ArticleVendu"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

	<h1>Détail vente</h1>
	<div>
	<% ArticleVendu article = (ArticleVendu) request.getAttribute("Article"); %>
	
		<label>Nom de l'article : <%=article.getNomArticle() %> </label>
	</div>
	<br>
	<div>
		<label>Description : <%=article.getDescription() %> </label>
	</div>
	<br>
	<div>
		<label>Catégorie : <%=article.getLibelle() %> </label>
	</div>
	<br>
	<div>
		<label>Meilleure offre : </label>
	</div>
	<br>
	<div>
		<label>Mise à prix : <%=article.getPrixVente() %></label>
	</div>
	<br>
	<div>
		<label>Fin de l'enchère : <%=article.getDateFinEncheres() %> </label>
	</div>
	<br>
	<div>
		<label>Retrait : <%=article.getRetrait() %> </label>
	</div>
	<br>
	<div>
		<label>Vendeur : <%=article.getPseudo() %> </label>
	</div>
	<br>
	<div>
		<label for="prix">Ma proposition :</label> <input type="number"
			id="prix" name="prix" min="1" max="1000">
	</div>
	<br>
	<div>
		<input type="submit" value="Enchérir">
	</div>
	<!-- Si l'action permettant d'ench�rir a bien fonctionn�, 
	ce sera la page d'accueil qui sera affich�e avec un message du type 
	"votre ench�re a bien �t� prise en compte". 
	Si l'action permettant d'ench�rir �choue, on reste sur la page 
	en cours et on affiche le message � l'origine de l'erreur -->
</body>
</html>