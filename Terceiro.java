import java.util.Locale;
import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double number = sc.nextDouble();

        if (number % 2 == 0) {
            System.out.printf("O numero %.2f é divisível por 2", number);
        } else if (number % 5 == 0) {
            System.out.printf("O numero %.2f é divisível por 5", number);
        } else if (number % 10 == 0) {
            System.out.printf("O numero %.2f é divisível por 10", number);
        } else {
            System.out.printf("O numero %.2f não é divisível nem por 2,5 e 10", number);
        }

        sc.close();
    }
}
