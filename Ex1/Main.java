import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Consultor> consultores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("\nMenu: \n1 – Inserir Funcionário \n2 – Exibir Funcionário \n3 – Sair \n");
            int menu = sc.nextInt();

            switch (menu) {
            case 1:
                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Salário: ");
                float salario = sc.nextFloat();

                System.out.print("Percentual acrescimo consultor: ");
                float percentual = sc.nextFloat();

                Consultor consultor = new Consultor(nome, salario, percentual);
                consultores.add(consultor);
                break;
            case 2:
                consultores.forEach(c -> System.out.println(c.toString()));
                break;
            default:
                System.exit(0);
                break;
            }
        }
    }

}