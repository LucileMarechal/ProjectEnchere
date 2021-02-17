
<!-- Fragment qui ramène à la page AccueilASansConnexion -->
<%@ include file="../fragments/fragmentAccueilSansConnexion.jspf" %>

<form method="post" action="/creerUnCompte.html" >
	<fieldset>
		<legend>Mon profil <!--  -->

<label for="pseudo">Pseudo :<span class="requis">*</span></label>
<input type="text" id="pseudo" name="spseudo" value="" size="20" maxlength="60">

<br />

<label for="name">Nom :<span class="requis">*</span></label>
<input type="text" id="name" name="sname" value="" size="20" maxlength="60">

<br />

<label for="firstname">Prénom :<span class="requis">*</span></label>
<input type="text" id="firstname" name="sfirstname" value="" size="20" maxlength="60">

<br />

<label for="email">Email :<span class="requis">*</span></label>
<input type="text" id="email" name="semail" value="" size="20" maxlength="60">

<br />

<label for=phone>Téléphone :<span class="requis">*</span></label>
<input type="text" id="phone" name="sphone" value="" size="20" maxlength="60">

<br />

<label for="street">Rue :<span class="requis">*</span></label>
<input type="text" id="street" name="sstreet" value="" size="20" maxlength="60">

<br />

<label for="postalCode">Code Postal :<span class="requis">*</span></label>
<input type="text" id="postalCode" name="spostalCode" value="" size="20" maxlength="60">

<br />

<label for="city">Ville :<span class="requis">*</span></label>
<input type="text" id="city" name="scity" value="" size="20" maxlength="60">

<br />

<label for="passWord">Mot de passe :<span class="requis">*</span></label>
<input type="password" id="passWord" name="spassWord" value="" size="20" maxlength="60">

<br />

<label for="confirmation">Confirmation :<span class="requis">*</span></label>
<input type="password" id="confirmation" name="sconfirmation" value="" size="20" maxlength="60">

<br />
			<!-- en appuyant sur créer, on arrive à la page d'accueil connecté (liste enchères -->
				<a href="<%= request.getContextPath()%>/accueilAvecConnexion.html"><input type="submit" value="Créer"></a>
		
			<br>
			
				<a href="<%= request.getContextPath() %>/accueil.html"><input type="submit" value="Annuler"></a>
			</legend></fieldset></form>
</body>