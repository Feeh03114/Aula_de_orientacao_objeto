import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Imovel> imoveis = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("\nMenu: \n1 – Inserir Imóvel \n2 – Exibir Imóveis \n3 – Sair \n");
            int menu = sc.nextInt();

            switch (menu) {
            case 1:
                while (true) {
                    System.out.print("Tipo do Imóvel: \n1 – Velho \n2 – Novo \n");
                    int escolha2 = sc.nextInt();
                    if (escolha2 == 1) {
                        boolean velho = true;
                        inserirImovel(sc, imoveis, velho);
                        break;
                    } else if (escolha2 == 2) {
                        boolean velho = false;
                        inserirImovel(sc, imoveis, velho);
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 2:
                imoveis.forEach(f -> System.out.println(f));
                break;
            case 3:
                System.exit(0);
            }
        }
    }

    private static void inserirImovel(Scanner sc, ArrayList<Imovel> imoveis, boolean velho) {
        System.out.print("Código: ");
        int codigo = sc.nextInt();

        System.out.print("Endereço: ");
        String endereco = sc.next();

        System.out.print("Valor: ");
        Double valor = sc.nextDouble();

        if (velho == true) {
            System.out.print("Valor do Desconto: ");
            double valorDesconto = sc.nextDouble();

            ImovelVelho imovel = new ImovelVelho(codigo, endereco, valor, valorDesconto);
            imoveis.add(imovel);
        } else {
            System.out.print("Valor Adicional: ");
            double valorAdicional = sc.nextDouble();

            ImovelNovo imovel = new ImovelNovo(codigo, endereco, valor, valorAdicional);
            imoveis.add(imovel);
        }
    }
}