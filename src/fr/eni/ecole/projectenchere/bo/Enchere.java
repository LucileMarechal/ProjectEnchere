package fr.eni.ecole.projectenchere.bo;

import java.sql.Date;

public class Enchere  {

	//Attributs

	private Date dateEnchere; 
	//import de Date.sql mais je ne sais pas si il vaut mieux import de Date.util 
	private Integer montant_enchere;
	
	//Constructeurs
	public Enchere(Date dateEnchere, Integer montant_enchere) {
	}

	//Getter et setter
	public Date getDateEnchere() {
		return dateEnchere;
	}

	public void setDateEnchere(Date dateEnchere) {
		this.dateEnchere = dateEnchere;
	}

	public Integer getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(Integer montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	
	//M�thode toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Enchere [dateEnchere=");
		builder.append(getDateEnchere());
		builder.append(", montant_enchere=");
		builder.append(getMontant_enchere());
		builder.append("]");
		return builder.toString();
	}

}


