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
	private String pseudo;
	private Integer noUtilisateur;
	private Integer noCategorie;
	private Integer retrait;
	private String libelle;
	
	
	//Constructeur
	/**
	 * Constructeur de base #vide
	 */
	public ArticleVendu() {
	}
	
	public ArticleVendu(String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres,
			Integer prixInitial, Integer prixVente, Integer noUtilisateur, Integer noCategorie,
			Integer retrait) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.noUtilisateur = noUtilisateur;
		this.noCategorie = noCategorie;
		this.retrait = retrait;
	}

	public ArticleVendu(Integer noArticle, String nomArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, Integer prixInitial, Integer prixVente, Integer noUtilisateur,
			Integer noCategorie, Integer retrait) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.noUtilisateur = noUtilisateur;
		this.noCategorie = noCategorie;
		this.retrait = retrait;
	}

	public ArticleVendu(int int1, String string, String string2, Date date, Date date2, int int2, int int3,
				int int4, int int5, int int6) {
			this.noArticle = int1;
			this.nomArticle = string;
			this.description = string2;
			this.dateDebutEncheres = date;
			this.dateFinEncheres = date2;
			this.prixInitial = int2;
			this.prixVente = int3;
			this.noUtilisateur = int4;
			this.noCategorie = int5;
			this.retrait = int6;
		}

	public ArticleVendu(Integer noArticle,  String nomArticle, Integer prixInitial, Date dateFinEncheres,  String pseudo) {
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.pseudo = pseudo;
	}
	
			public ArticleVendu(int noArticle, String nomArticle, int prixInitial, Date dateFinEncheres, String pseudo, int noUtilisateur) {
				this.noArticle = noArticle;
				this.nomArticle = nomArticle;
				this.prixInitial = prixInitial;
				this.dateFinEncheres = dateFinEncheres;
				this.pseudo = pseudo;
				this.noUtilisateur = noUtilisateur;
				
		}	
			
			
	/**
	 * Ce constructeur sert pour la selection par catégorie via le libelle
	 * @param nomArticle
	 * @param prixInitial
	 * @param dateFinEncheres
	 * @param pseudo
	 * @param noCategorie
	 */
		public ArticleVendu(String nomArticle, int prixInitial, Date dateFinEncheres, String pseudo, int noCategorie) {
		
			this.nomArticle = nomArticle;
			this.dateFinEncheres = dateFinEncheres;
			this.prixInitial = prixInitial;
			this.pseudo = pseudo;
			this.noCategorie = noCategorie;
	}
	
		
		/**
		 * Constructeur servant à afficher une vente
		 */
		public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres, Date dateFinEncheres, int prixInitial, int prixVente, int noUtilisateur,
			int noCategorie, int retrait, String libelle , String pseudo) {
		this.noArticle=noArticle;
		this.nomArticle=nomArticle;
		this.description=description;
		this.dateDebutEncheres=dateDebutEncheres;
		this.dateFinEncheres=dateFinEncheres;
		this.prixInitial=prixInitial;
		this.prixVente=prixVente;
		this.noUtilisateur=noUtilisateur;
		this.noCategorie=noCategorie;
		this.retrait=retrait;
		this.libelle=libelle;
		this.pseudo=pseudo;
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

	public void setPrixInitial(Integer prixInitial) {
		this.prixInitial = prixInitial;
	}

	public Integer getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(Integer prixVente) {
		this.prixVente = prixVente;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public Integer getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(Integer noCategorie) {
		this.noCategorie = noCategorie;
	}

	public Integer getRetrait() {
		return retrait;
	}

	public void setRetrait(Integer retrait) {
		this.retrait = retrait;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArticleVendu [noArticle=");
		builder.append(noArticle);
		builder.append(", nomArticle=");
		builder.append(nomArticle);
		builder.append(", description=");
		builder.append(description);
		builder.append(", dateDebutEncheres=");
		builder.append(dateDebutEncheres);
		builder.append(", dateFinEncheres=");
		builder.append(dateFinEncheres);
		builder.append(", prixInitial=");
		builder.append(prixInitial);
		builder.append(", prixVente=");
		builder.append(prixVente);
		builder.append(", pseudo=");
		builder.append(pseudo);
		builder.append(", noUtilisateur=");
		builder.append(noUtilisateur);
		builder.append(", noCategorie=");
		builder.append(noCategorie);
		builder.append(", retrait=");
		builder.append(retrait);
		builder.append(", libelle=");
		builder.append(noCategorie);
		builder.append("]");
		return builder.toString();
	}
	




}
