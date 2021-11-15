public class FuncionarioHorista extends Funcionario {
    private int qtdHora;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdHora,
            double valorHora) {
        super(numeroCracha, nome, setor, funcao);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public int getQtdHora() {
        return this.qtdHora;
    }

    public void setQtdHora(int qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantidade de Horas = " + getQtdHora() + "\nValor da Hora = " + getValorHora();
    }
}
