import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica() {
    }

    public String raizQuadrada(double primeiroNumero) {
        return String.format("%.2f", Math.sqrt(primeiroNumero));
    }

    public double potencia(double primeiroNumero, double segundoNumero) {
        return Math.pow(primeiroNumero, segundoNumero);
    }
}