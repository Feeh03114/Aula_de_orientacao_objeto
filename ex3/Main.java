import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculadoraCientifica calc = new CalculadoraCientifica();
        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Segundo numero: ");
        double n2 = sc.nextDouble();

        System.out.print("Soma " + n1 + " + " + n2 + " = " + calc.soma(n1, n2));
        System.out.print("\nSubtração " + n1 + " - " + n2 + " = " + calc.subtracao(n1, n2));
        System.out.print("\nDivisão " + n1 + " / " + n2 + " = " + calc.divisao(n1, n2));
        System.out.print("\nMultiplicação " + n1 + " * " + n2 + " = " + calc.multiplicacao(n1, n2));

        System.out.print("\nRaiz quadrada de " + n1 + " = " + calc.raizQuadrada(n1));
        System.out.print("\nPotencia: " + n1 + " elevado a " + n2 + " = " + calc.potencia(n1, n2));
        sc.close();
    }
}