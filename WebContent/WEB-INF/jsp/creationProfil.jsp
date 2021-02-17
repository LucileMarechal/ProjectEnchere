
<!-- Fragment qui ramène à la page AccueilASansConnexion -->
<%@ include file="../fragments/fragmentAccueilSansConnexion.jspf" %>

<h1>Mon profil</h1>

	<div class="container-fluid">
	<form  action="<%= request.getContextPath() %>/creerUnCompte.html" method="post">
<%=request.getAttribute("erreur") %>
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

<input type="submit" value="Créer">
<br /></form>
			<!-- en appuyant sur créer, on arrive à la page d'accueil connecté (liste enchères -->
				<a href="<%= request.getContextPath()%>/accueilAvecConnexion.html"></a>
		
			<br>
			
				<a href="<%= request.getContextPath() %>/accueil.html"><input type="submit" value="Annuler"></a>
			</div>
</body>