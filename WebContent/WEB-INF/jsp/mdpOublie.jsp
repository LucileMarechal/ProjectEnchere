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
		<br>
		<div>
			<a href="<%= request.getContextPath() %>/SinscrireSeConnecter.html">
			<input type="submit" value="Réinitialisation du mot de passe">
			</a>
		</div>	
		<br>

	</div>

</body>
</html>