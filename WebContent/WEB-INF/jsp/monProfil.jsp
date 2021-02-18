
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@page import="fr.eni.ecole.projectenchere.bo.Utilisateur"%>
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

	<h1>Mon profil</h1>
	
<form action="<%=request.getContextPath() %>/monProfil.html" method="post">	
	<div>
	
	<%Utilisateur u1 = (Utilisateur) request.getAttribute("u1"); %>
		<div>
			<div>
			<!-- choix du pseudo -->
				Pseudo : <input type="text" name="spseudo" value="<%=u1.getPseudo() %>"><br>
			</div>
			<br>
			<div>
				Prénom : <input type="text" name="sprenom" value="<%=u1.getPrenom() %>"><br>
			</div>
			<br>
			<div>
				Téléphone : <input type="text" name="stel" value="<%=u1.getTelephone() %>"><br>
			</div>
			<br>
			<div>
				Code postal : <input type="text" name="scpo" value="<%=u1.getCodePostal() %>"><br>
			</div>
			<br>
			<div>
				Nom : <input type="text" name="snom" value="<%=u1.getNom() %>"><br>
			</div>
			<br>
			<div>
				Email : <input type="text" name="smail" value="<%=u1.getEmail() %>"><br>
			</div>
			<br>
			<div>
				Rue : <input type="text" name="srue" value="<%=u1.getRue() %>"><br>
			</div>
			<br>
			<div>
				Ville : <input type="text" name="sville" value="<%=u1.getVille() %>">
			</div>
			<br>
			<div>
				Mot de passe actuel : <input type="password" name="smdp"><br>
			</div>
			<br>
			<div>
				Nouveau mot de passe : <input type="password" name="snewmdp"><br>
			</div>
			<br>
			<div>
				Confirmation : <input type="password" name="sconfnewmdp"><br>
			</div>
			<br>
			<div>
				Crédit : <%=u1.getCredit() %><br>  
			</div>
			<br>
			<!-- en cliquant sur supprimer, ça m'amène à l'accueil non connecté -->
			<div>
				<input type="submit" value="Enregistrer">
			</div>
			<br>
		</div>
	</div>
</form>		
		<div>
			<a href="<%=request.getContextPath() %>/accueil.html"><input type="submit" value="Supprimer mon compte"></a>
		</div>
</body>
</html>