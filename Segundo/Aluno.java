package entities;

public class Aluno {
	public String ra;
	public String nome;
	public float ac1;
	public float ac2;
	public float ag;
	public float af;
	
	public Aluno(String ra, String nome, float ac1, float ac2, float ag,
			float af) {
		this.ra = ra;
		this.nome = nome;
		this.ac1 = ac1;
		this.ac2 = ac2;
		this.ag = ag;
		this.af = af;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getAc1() {
		return ac1;
	}

	public void setAc1(float ac1) {
		this.ac1 = ac1;
	}

	public float getAc2() {
		return ac2;
	}

	public void setAc2(float ac2) {
		this.ac2 = ac2;
	}

	public float getAg() {
		return ag;
	}

	public void setAg(float ag) {
		this.ag = ag;
	}

	public float getAf() {
		return af;
	}

	public void setAf(float af) {
		this.af = af;
	}
	
	public float calcularMedia() {
		return (float) ((ac1*0.15) + (ac2*0.30) + (ag*0.10) + (af*0.45));
	}
	public String verificarAprovacao() {
		if (calcularMedia() >= 5) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
	}
	public String imprimir() {
		return "RA: " + ra +"\n"
				+ "Nome: "+ nome +"\n"
				+ "AC1: " + ac1 +"\n"
				+"AC2: "+ ac2+"\n"
				+"AG: " + ag +"\n"
				+ "AF: " + af+"\n"
				+ "Media: " + calcularMedia() +"\n"
				+"Situação: " + verificarAprovacao() +"\n"; 
	}
	

}