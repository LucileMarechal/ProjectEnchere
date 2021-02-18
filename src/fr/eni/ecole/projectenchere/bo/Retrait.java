package fr.eni.ecole.projectenchere.bo;

public class Retrait {
	
	private Integer noRetrait;
	private String rue;
	private String code_postal;
	private String ville;
	
	//Constructeur
	public Retrait(String rue, String code_postal, String ville) {
	}
	
	//Constructeur - selectByNoRetrait
	public Retrait(int no_retrait, String rue, String code_postal, String ville) {
		// TODO Auto-generated constructor stub
	}


public Retrait() {
		// TODO Auto-generated constructor stub
	}

	//Getter et Setter
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Integer getNoRetrait() {
		return noRetrait;
	}

	public void setNoRetrait(Integer noRetrait) {
		this.noRetrait = noRetrait;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Retrait [rue=");
		builder.append(getRue());
		builder.append(", code_postal=");
		builder.append(getCode_postal());
		builder.append(", ville=");
		builder.append(getVille());
		builder.append("]");
		return builder.toString();
	}


	
}
