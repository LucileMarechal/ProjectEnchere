
<!-- Fragment qui ramène à la page AccueilASansConnexion -->
<%@ include file="../fragments/fragmentAccueilSansConnexion.jspf" %>

	<div class="d-flex justify-content-center">
		<h2>Mon profil</h2>
	</div>
	<br>
	<br>
<form method="post" action="./creerUnCompte.html" >	
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<label for="pseudo">Pseudo* : <input type="text" id="pseudo" name="spseudo" required></label><br>
				<label for="firstname">Prénom* : <input type="text" id="firstname" name="sfirstname" required></label><br>
				<label for="phone">Téléphone* : <input type="text" id="phone" name="sphone" required></label><br>
				<label for="postalCode">Code Postal* : <input type="text" id="postalCode" name="spostalCode" required></label><br>
				<label for="passWord">Mot de passe* : <input type="password" id="passWord" name="spassWord" required></label><br>
			</div>
	
			<div class="col-md-6">
				<label for="name">Nom* : <input type="text" id="name" name="sname" required></label><br>
				<label for="email">Email* : <input type="text" id="email" name="semail" required></label><br>
				<label for="street">Rue* : <input type="text" id="street" name="sstreet" required></label><br>
				<label for="city">Ville* : <input type="text" id="city" name="scity" required></label><br>
				<label for="confirmation">Confirmation* : <input type="password" id="confirmation" name="sconfirmation" required></label><br>
			</div>

			<div class="col-2">
			<input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Créer">
			</div>
		</div>
	</div>	
</form>		
<br>	
<form  class="form col-2" action="<%=request.getContextPath()%>/accueil.html" method="get">
	<input class="btn btn-outline-danger" type="submit" value="Annuler">
</form>
	
	
</body>


