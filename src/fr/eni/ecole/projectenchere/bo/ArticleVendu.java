package fr.eni.ecole.projectenchere.bo;

import java.sql.Date;

public class ArticleVendu {
	//Attributs d'instance
	private Integer noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEncheres;
	private Date dateFinEncheres;
	private Integer prixInitial;
	private Integer prixVente;
	Utilisateur noUtilisateur;
	CategorieArticle noCategorie;
	Retrait retrait;
	

	
	//Constructeur 

	
	public ArticleVendu(String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
			Integer prixInitial, Integer prixVente, Utilisateur noUtilisateur, CategorieArticle noCategorie) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.noUtilisateur = noUtilisateur;
		this.noCategorie = noCategorie;
	}



	//Getter et Setter

	public Integer getNoArticle() {
		return noArticle;
	}



	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
	}

	public String getNomArticle() {
		return nomArticle;
	}

	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebutEncheres() {
		return dateDebutEncheres;
	}

	public void setDateDebutEncheres(Date dateDebutEncheres) {
		this.dateDebutEncheres = dateDebutEncheres;
	}

	public Date getDateFinEncheres() {
		return dateFinEncheres;
	}

	public void setDateFinEncheres(Date dateFinEncheres) {
		this.dateFinEncheres = dateFinEncheres;
	}

	public Integer getPrixInitial() {
		return prixInitial;
	}

	public void setPrixInitial(Integer miseAprix) {
		this.prixInitial = miseAprix;
	}

	public Integer getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}



	//M�thode toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [noArticle=");
		builder.append(getNoArticle());
		builder.append(", nomArticle=");
		builder.append(getNomArticle());
		builder.append(", description=");
		builder.append(getDescription());
		builder.append(", dateDebutEncheres=");
		builder.append(getDateDebutEncheres());
		builder.append(", dateFinEncheres=");
		builder.append(getDateFinEncheres());
		builder.append(", prixInitial=");
		builder.append(getPrixInitial());
		builder.append(", prixVente=");
		builder.append(getPrixVente());
		builder.append("]");
		return builder.toString();
	}


}
