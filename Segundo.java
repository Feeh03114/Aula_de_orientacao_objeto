import java.util.Locale;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double number = sc.nextDouble();
        System.out.println("Informe mais um numero: ");
        double number1 = sc.nextDouble();

        if (number == number1) {
            System.out.printf("O numero %.2f e  %.2f iguais", number, number1);
        } else if (number != number1) {
            System.out.printf("O numero %.2f e  %.2f não são iguais", number, number1);
        } else if (number > number1) {
            System.out.printf("\n%.2f,  %.2f", number, number1);
        } else if (number < number1) {
            System.out.printf("\n%.2f,  %.2f", number1, number);
        }
    }

}
