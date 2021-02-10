
<!-- Fragment qui ramène à la page AccueilAvecConnexion -->
<%@ include file="../fragments/fragmentAccueilConnexion.jspf" %>

	<h1>Mon profil</h1>
	
	<div>
		<div>
			<div>
			<!-- choix du pseudo -->
				Pseudo : <input type="text" name="spseudo"><br>
			</div>
			<br>
			<div>
				Prénom : <input type="text" name="sprenom"><br>
			</div>
			<br>
			<div>
				Téléphone : <input type="text" name="stel"><br>
			</div>
			<br>
			<div>
				Code postal : <input type="text" name="scpo"><br>
			</div>
			<br>
			<div>
				Nom : <input type="text" name="snom"><br>
			</div>
			<br>
			<div>
				Email : <input type="text" name="smail"><br>
			</div>
			<br>
			<div>
				Rue : <input type="text" name="srue"><br>
			</div>
			<br>
			<div>
				Ville : <input type="text" name="sville">
			</div>
			<br>
			<div>
				Mot de passe actuel : <input type="password" name="smdp"><br>
			</div>
			<br>
			<div>
				Nouveau mot de passe : <input type="password" name="smdp"><br>
			</div>
			<br>
			<div>
				Confirmation : <input type="password" name="sconf"><br>
			</div>
			<br>
			<div>
				Crédit : <input type="text" name="scred"><br>
			</div>
			<br>
			<!-- en cliquant sur supprimer, ça m'amène à l'accueil non connecté -->
			<div>
				<a href="<%=request.getContextPath() %>/accueilAvecConnexion.html"><input type="submit" value="Enregistrer"></a>
			</div>
			<br>
			<div>
				<a href="<%=request.getContextPath() %>/accueil.html"><input type="submit" value="Supprimer mon compte"></a>
			</div>
		</div>
	</div>
</body>
</html>