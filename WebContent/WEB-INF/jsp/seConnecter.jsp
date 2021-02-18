<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/theme/css/bootstrap.css">
<meta charset="UTF-8">
<title>Créer un compte</title>
</head>
<body>

<h1>ENI-Enchères</h1>

	<div class="container-fluid">
	<form  action="<%= request.getContextPath() %>/SinscrireSeConnecter.html" method="post">
		<div class="col-md-3">
			Identifiant : <input  type="text" class="form-control" name="slogin" />
		</div>
		<br>
		<div class="col-md-3">
			Mot de passe : <input type="password" class="form-control" name="spassword"/>
		</div>
		<font color="red"><%=request.getAttribute("erreur") != null ? request.getAttribute("erreur") : ""%></font>
		<br>
		<div class="col-md-3">
			<button type="submit" class="btn btn-primary">Connexion</button>
			<input class="form-check form-check-inline" type="checkbox" name="smemo" value="memo">Se souvenir de moi
		</div>
		
	</form>
		<br>
		
		<div class="col-md-3">
			<a href="<%= request.getContextPath() %>/ReinitialisationMdp.html">
			<input class="btn btn-outline-danger" type="button" value="Mot de passe oublié">
			</a>
			<br>
		</div>
	<br>

		<div class="col-md-3">
			<a href="<%= request.getContextPath() %>/creationProfil.html">
			<input class="btn btn-outline-success my-2 my-sm-0" type="submit" value="Créer un compte">
			</a>
		</div>
	</div>


</body>
</html>