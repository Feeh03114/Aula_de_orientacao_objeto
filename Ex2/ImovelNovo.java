public class ImovelNovo extends Imovel {

    private double valorAdicional;

    public ImovelNovo() {
    }

    public ImovelNovo(int codigo, String endereco, double valor, double valorAdicional) {
        super(codigo, endereco, valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double calcularValorImovel() {
        return super.calcularValorImovel() + valorAdicional;
    }

    @Override
    public String toString() {
        return super.toString() + "\nValor Adicional = " + valorAdicional + "\nValor Final do Imóvel = "
                + calcularValorImovel();
    }
}