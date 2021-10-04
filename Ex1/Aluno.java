package entities;

public class Aluno {

	private String ra;
	private String nome;

	public Aluno() {
	}

	public aluno(String ra, String nome) {
		this.ra = ra;
		this.nome = nome;
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

	public String imprimir() {
		return "RA:" + ra + "\n" + "Nome: " + nome;
	}

}