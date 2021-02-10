package fr.eni.ecole.projectenchere.bo;

public class CategorieArticle {
	private Integer noArticle;
	private String libelle;

	//Constructeur
	public CategorieArticle(Integer noArticle, String libelle) {
	}

	//Getter et Setter
	
	public Integer getNoArticle() {
		return noArticle;
	}

	public void setNoArticle(Integer noArticle) {
		this.noArticle = noArticle;
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
		return "CategorieArticle [noArticle=" + noArticle + ", libelle=" + libelle + "]";
	}
	
	



}
