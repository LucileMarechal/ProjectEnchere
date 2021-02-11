package fr.eni.ecole.projectenchere.bo;

public class CategorieArticle {
	private Integer noCategorie;
	private String libelle;

	//Constructeur
	public CategorieArticle(Integer noArticle, String libelle) {
	}
	public CategorieArticle() {
		// TODO Auto-generated constructor stub
	}
	//Getter et Setter
	


	public Integer getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(Integer noArticle) {
		this.noCategorie = noArticle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	//Méthode toString
	@Override
	public String toString() {
		return "CategorieArticle [noArticle=" + noCategorie + ", libelle=" + libelle + "]";
	}
	
	



}
