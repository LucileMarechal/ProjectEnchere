<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Création profil</title>
</head>
<body>
	<h1>Mon profil</h1>
	
	<div>
		<form>
			<div>
				<div>
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
				<div>
					<input type="submit" value="Enregistrer">
				</div>
				<br>
				<div>
					<a href="/accueil"><input type="submit" value="Supprimer mon compte"></a>
				</div>
			</div>
		</form>
	</div>
</body>
</html>