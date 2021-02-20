
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Utilisateur"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

<div class="d-flex justify-content-center">
	<h1>Mon profil</h1>
</div>

<%Utilisateur u1 = (Utilisateur) request.getAttribute("u1"); %>	

<div class="d-flex justify-content-center">
<form class="row" action="<%=request.getContextPath() %>/monProfil.html" method="post">

	<div class="col">
		Pseudo : <input type="text" name="spseudo" value="<%=u1.getPseudo() %>"><br>
		Prénom : <input type="text" name="sprenom" value="<%=u1.getPrenom() %>"><br>
		Téléphone : <input type="text" name="stel" value="<%=u1.getTelephone() %>"><br>
		Code postal : <input type="text" name="scpo" value="<%=u1.getCodePostal() %>"><br>
		Mot de passe actuel : <input type="password" name="smdp"><br>
		Nouveau mot de passe : <input type="password" name="snewmdp"><br>
		Crédit : <%=u1.getCredit() %><br>
		<input type="submit" value="Enregistrer">
	</div>
	<div class="col">
		Nom : <input type="text" name="snom" value="<%=u1.getNom() %>"><br>
		Email : <input type="text" name="smail" value="<%=u1.getEmail() %>"><br>
		Rue : <input type="text" name="srue" value="<%=u1.getRue() %>"><br>
		Ville : <input type="text" name="sville" value="<%=u1.getVille() %>"><br><br>
		Confirmation : <input type="password" name="sconfnewmdp"><br>
		<a href="<%=request.getContextPath() %>/accueil.html"><input type="submit" value="Supprimer mon compte"></a>
	</div>
</form>			 
</div>
	


	
	
	
</body>
</html>