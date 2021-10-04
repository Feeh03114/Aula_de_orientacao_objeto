package entities;

public class Pessoa {
	public String cpf;
	public String nome;
	public int idade;
	public char sx;

	public Pessoa(String cpf, String nome, Integer idade, char sx) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.sx = sx;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public char getSx() {
		return sx;
	}

	public void setSx(char sx) {
		this.sx = sx;
	}

	public String imprimir() {
		return "CPF: " + cpf + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Sexo: " + sx + "\n";
	}

}