import java.util.Locale;
import java.util.Scanner;

public class Sexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 2021;

        System.out.println("Informe ano de nascimento: ");
        int anonasci = sc.nextInt();

        if (anonasci <= year) {
            int response = (year - anonasci);
            System.out.printf("Idade é igual a: %d ", response);
        } else {
            System.out.printf("Ano de  %d invalido", anonasci);
        }

        sc.close();
    }
}
