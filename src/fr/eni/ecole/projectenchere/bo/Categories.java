package fr.eni.ecole.projectenchere.bo;

public class Categories {
	private Integer noCategorie;
	private String libelle;

	//Constructeur
	public Categories(Integer noCategorie, String libelle) {
		super();
		this.noCategorie = noCategorie;
		this.libelle = libelle;
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
	
	//M�thode toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategorieArticle [noCategorie=");
		builder.append(getNoCategorie());
		builder.append(", libelle=");
		builder.append(getLibelle());
		builder.append("]");
		return builder.toString();
	}


}
