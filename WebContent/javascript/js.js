/**
 * Cette fonction permet:<br>
-lorsque les "Achats" sont selectionnés 
de désactiver les choix sur "Mes ventes"<br>
-lorsque les "Mes ventes" sont selectionnés
de désactiver les choix sur "Achats"
 */
function selectAchatOuVente() {
	
	if(document.getElementById ('achats').checked){
		document.getElementById("1").disabled = false;
		document.getElementById("2").disabled = false;
		document.getElementById("3").disabled = false;
		document.getElementById("4").disabled = true;
		document.getElementById("5").disabled = true;
		document.getElementById("6").disabled = true;

	}else if(document.getElementById('ventes').checked){
		document.getElementById("1").disabled = true;
		document.getElementById("2").disabled = true;
		document.getElementById("3").disabled = true;
		document.getElementById("4").disabled = false;
		document.getElementById("5").disabled = false;
		document.getElementById("6").disabled = false;
	}
}



