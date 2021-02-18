
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Utilisateur"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>


<div class="d-flex justify-content-center">
	<h2>Mon profil</h2>
</div>

	<div>
		<div>
			Pseudo : <%=request.getAttribute("pseudo") %>
		</div>
		<br>
		<div>
			Nom : <%=request.getAttribute("nom") %>
		</div>
		<br>
		<div>
			Prénom : <%=request.getAttribute("prenom") %>
		</div>
		<br>
		<div>
			Email : <%=request.getAttribute("email") %>
		</div>
		<br>
		<div>
			Téléphone : <%=request.getAttribute("telephone") %>
		</div>
		<br>
		<div>
			Rue : <%=request.getAttribute("rue") %>
		</div>
		<br>
		<div>
			Code postal : <%=request.getAttribute("code_postal") %>
		</div>
		<br>
		<div>
			Ville : <%=request.getAttribute("ville") %>
		</div>
		<br>
		<div>
			<a href="<%= request.getContextPath() %>/monProfil.html">
			<input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Modifier">
			</a>
		</div>
	</div>
</body>
</html>