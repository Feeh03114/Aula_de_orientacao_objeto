import java.util.Locale;
import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double valueproduct = sc.nextDouble();

        if (valueproduct < 20) {
            double venda = valueproduct + (valueproduct * 0.45);
            System.out.printf("Valor de venda desse produto é de %.2f ", venda);
        } else {
            double venda = valueproduct + (valueproduct * 0.30);
            System.out.printf("Valor de venda desse produto é de %.2f ", venda);
        }

        sc.close();
    }
}
