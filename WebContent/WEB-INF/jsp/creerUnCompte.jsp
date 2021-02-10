<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Créer un compte</title>
</head>
<body>

<h1>ENI-Enchères</h1>

	<div>
		<div>
			Identifiant : <input type="text" name="sid">
		</div>
		<br>
		<div>
			Mot de passe : <input type="password" name="spassword">
		</div>
		<br>
		<div>
			<a href="<%= request.getContextPath() %>/accueilAvecConnexion.html">
			<input type="submit" value="Connexion">
			</a>
			<input type="checkbox" name="smemo" value="memo">Se souvenir de moi
			<a href="<%= request.getContextPath() %>/ReinitialisationMdp.html"><input type="button" value="Mot de passe oublié"></a>
		</div>	
		<br>
		<div>
			<a href="<%= request.getContextPath() %>/creationProfil.html">
			<input type="submit" value="Créer un compte">
			</a>
		</div>
	</div>


</body>
</html>