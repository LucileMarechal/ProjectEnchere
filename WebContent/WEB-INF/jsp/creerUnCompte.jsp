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
			Identifiant : <input  type="text" class="form-control" name="slogin"/>
		</div>
		<br>
		<div class="col-md-3">
			Mot de passe : <input type="password" class="form-control" name="spassword"/>
		</div>
		<br>
		<div>
			<button type="submit" class="btn btn-primary">Connexion</button>
		</div>
	</form>
		<br>
		
		<div>
			<input class="form-check-input" type="checkbox" name="smemo" value="memo">Se souvenir de moi
			<a href="<%= request.getContextPath() %>/ReinitialisationMdp.html"><input type="button" value="Mot de passe oublié">
			</a>
		</div>
	
		<div>
			<a href="<%= request.getContextPath() %>/creationProfil.html">
			<input type="submit" value="Créer un compte">
			</a>
		</div>
	</div>


</body>
</html>