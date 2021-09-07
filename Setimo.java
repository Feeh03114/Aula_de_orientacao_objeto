import java.util.Locale;
import java.util.Scanner;

public class Setimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int Idade = sc.nextInt();

        if (Idade < 16) {
            System.out.printf("Não eleitor (abaixo de 16 anos) idade: %d ", Idade);
        } else if ((Idade >= 18) && (Idade <= 65)) {
            System.out.printf("Eleitor obrigatório (entre 18 e 65 anos)  idade: %d ", Idade);
        } else if (((Idade >= 16) && (Idade <= 18)) || ((Idade > 65))) {
            System.out.printf("Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)  idade: %d ", Idade);
        }
        sc.close();
    }
}
