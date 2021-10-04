package entities;

public class Funcionario {
	public int Cracha;
	public String nome;
	public char TipoVinculo;
	public float ValorHora;
	public float QtdeHora;
	public float Salario;
	public float ValorDesconto;

	public Funcionario(Integer cracha, String nome, char TipoVinculo, float ValorHora, float QtdeHora, float Salario,
			float ValorDesconto) {
		this.Cracha = cracha;
		this.nome = nome;
		this.TipoVinculo = TipoVinculo;
		this.ValorHora = ValorHora;
		this.QtdeHora = QtdeHora;
		this.Salario = Salario;
		this.ValorDesconto = ValorDesconto;
	}

	public int getCracha() {
		return Cracha;
	}

	public void setCracha(Integer cracha) {
		this.Cracha = cracha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getTipoVinculo() {
		return TipoVinculo;
	}

	public void setTipoVinculo(char tipovinculo) {
		this.TipoVinculo = tipovinculo;
	}

	public float getValorHora() {
		return ValorHora;
	}

	public void setValorHora(float valorhora) {
		this.ValorHora = valorhora;
	}

	public float getQtdeHora() {
		return QtdeHora;
	}

	public void setQtdeHora(float qtdehora) {
		this.QtdeHora = qtdehora;
	}

	public float getSalario() {
		return Salario;
	}

	public void setSalario(float salario) {
		this.Salario = salario;
	}

	public float getValorDesconto() {
		return ValorDesconto;
	}

	public void setAf(float valordesconto) {
		this.ValorDesconto = valordesconto;
	}

	public float CalcularValorSalario() {
		if (TipoVinculo == "m") {
			return ValorHora * QtdeHora - ValorDesconto;
		} else {
			return Salario - ValorDesconto;
		}
	}

	public String imprimir() {
		return "Cracha: " + Cracha + "\n" + "Nome: " + nome + "\n" + "Tipo Vinculo: " + TipoVinculo + "\n" + "Salário: "
				+ CalcularValorSalario() + "\n" + "Desconto: " + ValorDesconto + "\n" + "Valor a receber: " + Salario
				+ "\n";
	}

}