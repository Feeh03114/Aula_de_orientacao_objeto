public abstract class Calculadora {

    public double soma(double primeiroNumero, double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public double subtracao(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public double divisao(double primeiroNumero, double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }

    public double multiplicacao(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }
}