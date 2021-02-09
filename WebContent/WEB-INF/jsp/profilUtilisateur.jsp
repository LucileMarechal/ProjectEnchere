<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profil utilisateur</title>
</head>
<body>
	<div>
		<div>
			Pseudo : <input type="text" name="spseudo" value="<%= request.getParameter("spseudo") %>">
		</div>
		<div>
			Heure : <input type="time" name="stime" value="<%= request.getParameter("stime") %>">
		</div>
		<div>
			Repas : <textarea rows="5" cols="30" name="srepas">
				<%= request.getParameter("srepas") != null ? request.getParameter("srepas") : ""%>
			</textarea>
		</div>
		<div>
			<input type="submit" value="Valider">
			<a href="<%= request.getContextPath()%>">
			<input type="button" value="Annuler"></a>
		</div>
	</div>
</body>
</html>