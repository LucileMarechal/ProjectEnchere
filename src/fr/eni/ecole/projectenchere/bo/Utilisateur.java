package fr.eni.ecole.projectenchere.bo;

import java.util.List;

public class Utilisateur {
		//Attributs d'instance
		private Integer noUtilisateur;
		private String pseudo;
		private String nom;
		private String prenom;
		private String email;
		private String telephone;
		private String rue;
		private String codePostal;
		private String ville;
		private String motDePasse;
		private Integer credit;
		private Boolean administrateur;
	
		//Un article aura un utilisateur
		//Un utilisateur peut avoir plusieurs articles
		//Liste d'article dans cette classe du coup ?
		//List<ArticleVendu> article=null;


		//Constructeurs
		public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
				String rue, String codePostal, String ville, String motDePasse, Integer credit, Boolean administrateur) {
			setPseudo(pseudo);
			setNom(nom);
			setPrenom(prenom);
			setEmail(email);
			setTelephone(telephone);
			setRue(rue);
			setCodePostal(codePostal);
			setVille(ville);
			setMotDePasse(motDePasse);
			setCredit(credit);
			setAdministrateur(administrateur);
		}
	

		public Utilisateur(Integer noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone,
			String rue, String codePostal, String ville) {
		setNoUtilisateur(noUtilisateur);
		setPseudo(pseudo);
		setNom(nom);
		setPrenom(prenom);
		setEmail(email);
		setTelephone(telephone);
		setRue(rue);
		setCodePostal(codePostal);
		setVille(ville);
		}
		
		public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
				String rue, String codePostal, String ville) {
		setPseudo(pseudo);
		setNom(nom);
		setPrenom(prenom);
		setEmail(email);
		setTelephone(telephone);
		setRue(rue);
		setCodePostal(codePostal);
		setVille(ville);
		}
			
		
		public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
				String rue, String codePostal, String ville, String motDePasse) {
		setPseudo(pseudo);
		setNom(nom);
		setPrenom(prenom);
		setEmail(email);
		setTelephone(telephone);
		setRue(rue);
		setCodePostal(codePostal);
		setVille(ville);
		setMotDePasse(motDePasse);
		}


		public Utilisateur() {
		
		}

	//Getter et Setter



	public Integer getNoUtilisateur() {
		return noUtilisateur;
	}

	public void setNoUtilisateur(Integer noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public Boolean getAdministrateur() {
		return administrateur;
	}

	public void setAdministrateur(Boolean administrateur) {
		this.administrateur = administrateur;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utilisateur [noUtilisateur=");
		builder.append(getNoUtilisateur());
		builder.append(", pseudo=");
		builder.append(getPseudo());
		builder.append(", nom=");
		builder.append(getNom());
		builder.append(", prenom=");
		builder.append(getPrenom());
		builder.append(", email=");
		builder.append(getEmail());
		builder.append(", telephone=");
		builder.append(getTelephone());
		builder.append(", rue=");
		builder.append(getRue());
		builder.append(", codePostal=");
		builder.append(getCodePostal());
		builder.append(", ville=");
		builder.append(getVille());
		builder.append(", motDePasse=");
		builder.append(getMotDePasse());
		builder.append(", credit=");
		builder.append(getCredit());
		builder.append(", administrateur=");
		builder.append(getAdministrateur());
		builder.append("]");
		return builder.toString();
	}




}
