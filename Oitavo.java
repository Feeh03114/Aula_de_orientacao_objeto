import java.util.Locale;
import java.util.Scanner;

public class Setimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Mês (Numero): ");
        int mesnumber = sc.nextInt();

        switch (mesnumber) {
            case 1:
                System.out.printf("Janeiro");
                break;
            case 2:
                System.out.printf("Fevereiro");
                break;
            case 3:
                System.out.printf("Março");
                break;
            case 4:
                System.out.printf("Abril");
                break;
            case 5:
                System.out.printf("Maio");
                break;
            case 6:
                System.out.printf("Junho");
                break;
            case 7:
                System.out.printf("Julho");
                break;
            case 8:
                System.out.printf("Agosto");
                break;
            case 9:
                System.out.printf("Setembro");
                break;
            case 10:
                System.out.printf("Outubro");
                break;
            case 11:
                System.out.printf("Novembro");
                break;
            case 12:
                System.out.printf("Dezembro");
                break;
            default:
                System.out.printf("Não existe esse mês");
                break;

        }

        sc.close();
    }
}
