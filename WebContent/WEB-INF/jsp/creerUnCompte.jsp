<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Créer un compte</title>
</head>
<body>

	<div>
		<form action="" method="post">
			<div>
				Identifiant : <input type="text" name="sid">
			</div>
			<br>
			<div>
				Mot de passe : <input type="password" name="spassword">
			</div>
			<br>
			<div>
				<a href="/accueilConnecte.html">
				<input type="submit" value="Connexion">
				</a>
				<input type="checkbox" name="smemo" value="memo">Se souvenir de moi
				<a href="accueil"><input type="button" value="Mot de passe oublié"></a>
			</div>		
			<br>	
			<div>
				<a href="mon profil"><input type="submit" value="Créer un compte"></a>
			</div>
		</form>
	</div>
</body>
</html>