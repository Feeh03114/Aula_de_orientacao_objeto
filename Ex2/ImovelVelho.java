public class ImovelVelho extends Imovel {

    private double valorDeconto;

    public ImovelVelho() {
    }

    public ImovelVelho(int codigo, String endereco, double valor, double valorDeconto) {
        super(codigo, endereco, valor);
        this.valorDeconto = valorDeconto;
    }

    public double getValorDeconto() {
        return valorDeconto;
    }

    public void setValorDeconto(double valorDeconto) {
        this.valorDeconto = valorDeconto;
    }

    @Override
    public double calcularValorImovel() {
        return super.calcularValorImovel() - valorDeconto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor do Deconto = " + valorDeconto + "\nValor Final do Imóvel = "
                + calcularValorImovel();
    }
}
