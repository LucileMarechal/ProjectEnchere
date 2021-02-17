
<!-- Fragment qui ramène à la page AccueilASansConnexion -->
<%@ include file="../fragments/fragmentAccueilSansConnexion.jspf" %>

<form method="post" action="/creerUnCompte.html" >
	<fieldset>
		<div class="row">
		<div class="col-md-4"></div>
		<div class="col-md-4"><h2>Mon profil</h2></div>
		<div class="col-md-6">
		</div>
<br/>
</div>
<div class="container-fluid">
        <div class="row">
            <div class="col-md-3">
            </div>
            <div class="col-md-6">
                <form role="form" style="margin: 5%; text-align: -webkit-center;">
                    <div class="col-md-6" id="formbox">
                        <div class="input-group mb-3">
                            <label for="pseudo">Pseudo :<span class="requis"><font color="red"> *</font></span></label>
    <br/>
    <input type="text" class="form-control" id="speudo" aria-describedby="pseudo" placeholder="Pseudo">
                        </div>
                        <div class="input-group mb-3">
                            <label for="name">Nom :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="text" class="form-control" id="sname" placeholder="Nom">
                        </div>
                        <div class="input-group mb-3">
                             <label for="firstname">Prénom :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="text" class="form-control" id="sfirstname" placeholder="Prénom">
                        </div>
                        <div class="input-group mb-3">
                             <label for="email">Email :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="email" class="form-control" id="semail" placeholder="Email">
                        </div>
                        <div class="input-group  mb-3">
                             <label for="phone">Téléphone :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="text" class="form-control" id="sphone" placeholder="Télephone">
                        </div>
                        <div class="input-group  mb-3">
                             <label for="street">Rue :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="text" class="form-control" id="sstreet" placeholder="Rue">
                        </div>
                        <div class="input-group  mb-3">
                             <label for="postalCode">Code postal :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="text" class="form-control" id="spostalcode" placeholder="Code postal">
                        </div>
                         <div class="input-group  mb-3">
                            <label for="city">Ville :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="text" class="form-control" id="scity" placeholder="Ville">
                        </div>
                          <div class="input-group  mb-3">
                            <label for="password">Mot de passe :<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="password" class="form-control" id="spassword" placeholder="Mot de passe">
                        </div>
                          <div class="input-group  mb-3">
                            <label for="confirmation">Confirmation:<span class="requis"><font color="red"> *</font></span></label>
   <br/>
    <input type="password" class="form-control" id="sconfirmation" placeholder="Confirmation">
                        </div>

                        <br/>
<small><%=request.getAttribute("erreur") %></small>
<br />
 
  <!-- en appuyant sur créer, on arrive à la page d'accueil connecté (liste enchères -->
				<a href="<%= request.getContextPath()%>/accueilAvecConnexion.html"><input type="submit" value="Créer" class="btn btn-primary"></a>
		<a href="<%= request.getContextPath() %>/accueil.html"><input type="submit" value="Annuler" class="btn btn-secondary"></a>
			</legend></fieldset></form>
                </form>
            </div>
            <div class="col-md-3">
            </div>
        </div>
    </div>
  
<br />	
			<br>
				
</body>