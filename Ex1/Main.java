import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("\nMenu: \n1 – Inserir Funcionário \n2 – Exibir Funcionário \n3 – Sair \n");
            int menu = sc.nextInt();
            switch (menu) {
            case 1:
                while (true) {
                    System.out.print("Tipo do Funcionário: \n1 – Horista \n2 – Mensalista \n");
                    int tipo = sc.nextInt();
                    if (tipo == 1) {
                        boolean horista = true;
                        inserirFuncionario(sc, funcionarios, horista);
                        break;
                    } else if (tipo == 2) {
                        boolean horista = false;
                        inserirFuncionario(sc, funcionarios, horista);
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                funcionarios.forEach(f -> System.out.println(f));
                break;
            case 3:
                System.exit(0);
            }
        }
    }

    private static void inserirFuncionario(Scanner sc, ArrayList<Funcionario> funcionarios, boolean horista) {
        System.out.print("Número do cracha: ");
        int numeroCracha = sc.nextInt();

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Setor: ");
        String setor = sc.next();

        System.out.print("Função: ");
        String funcao = sc.next();

        if (horista == true) {
            System.out.print("Quantidade de horas: ");
            int qtdhoras = sc.nextInt();

            System.out.print("Valor da Hora: ");
            double valorHora = sc.nextDouble();

            FuncionarioHorista funcionario = new FuncionarioHorista(numeroCracha, nome, setor, funcao, qtdhoras,
                    valorHora);
            funcionarios.add(funcionario);
        } else {
            System.out.print("Salário: ");
            double salario = sc.nextDouble();

            FuncionarioMensalista funcionario = new FuncionarioMensalista(numeroCracha, nome, setor, funcao, salario);
            funcionarios.add(funcionario);
        }
    }
}