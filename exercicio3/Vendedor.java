package entities;

public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public String imprimir(double valorVenda, double desconto) {
        return "Codigo: " + codigo + "\n" + "Nome: " + nome + "\n" + "Valor venda: " + valorVenda + "\n"
                + "% Comissao: " + percentualComissao + "\n" + "Desconto: " + desconto + "\n" + "Valor a pagar: "
                + calcularPagamentoComissao(valorVenda, desconto);

    }
}