
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Utilisateur"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>


<!-- créer variable sous include pour la récupérer  -->
<!-- mettre variable pseudo dans les <> -->
<%!
	Utilisateur utilisateur;
%>

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
			<input type="submit" value="Modifier">
			</a>
		</div>
	</div>
</body>
</html>