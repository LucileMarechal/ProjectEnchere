
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Utilisateur"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

<div class="d-flex justify-content-center">
	<h2>Mon profil</h2>
</div>

<div class="d-flex justify-content-center">
		Pseudo : <%=request.getAttribute("pseudo") %><br>
		Nom : <%=request.getAttribute("nom") %><br>
		Prénom : <%=request.getAttribute("prenom") %><br>
		Email : <%=request.getAttribute("email") %><br>
		Téléphone : <%=request.getAttribute("telephone") %><br>
		Rue : <%=request.getAttribute("rue") %><br>
		Code postal : <%=request.getAttribute("code_postal") %><br>
		Ville : <%=request.getAttribute("ville") %><br>
</div>

<div class="d-flex justify-content-center">
		<a href="<%= request.getContextPath() %>/monProfil.html">
		<input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Modifier"></a>
</div>

</body>
</html>