import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double number = sc.nextDouble();
        System.out.println("Informe mais um numero: ");
        double number1 = sc.nextDouble();

        if (number == number1) {
            System.out.printf("O numero %.2f e  %.2f iguais", number, number1);
        } else {
            System.out.printf("O numero %.2f e  %.2f não são iguais", number, number1);
        }

    }

}
