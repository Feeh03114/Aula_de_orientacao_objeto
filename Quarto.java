import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double maior, menor, number;

        System.out.println("Informe um numero: ");
        number = sc.nextDouble();

        maior = number;
        menor = number;
        if (number <= menor) {
            menor = number;
        } else if (number >= maior) {
            maior = number;
        }

        System.out.println("Informe um numero: ");
        number = sc.nextDouble();

        if (number <= menor) {
            menor = number;
        } else if (number >= maior) {
            maior = number;
        }

        System.out.println("Informe um numero: ");
        number = sc.nextDouble();

        if (number <= menor) {
            menor = number;
        } else if (number >= maior) {
            maior = number;
        }
        System.out.println("Informe um numero: ");
        number = sc.nextDouble();

        if (number <= menor) {
            menor = number;
        } else if (number >= maior) {
            maior = number;
        }
        System.out.println("Informe um numero: ");
        number = sc.nextDouble();

        if (number <= menor) {
            menor = number;
        } else if (number >= maior) {
            maior = number;
        }

        System.out.printf("Maior: %.2f, Menor: %.2f ", maior, menor);

        sc.close();
    }
}
