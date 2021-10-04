package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Vendedor;

public class Program {
	private static Vendedor vend;

	public static void Main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("===MENU===");
			System.out.println("1-Cadastrar Vendedor \n2-Calcular Comissão \n3-Sair");
			int escolha = sc.nextInt();
			switch (escolha) {
				case 1:
					System.out.println("Insira o codigo: ");
					int codigo = sc.nextInt();
					System.out.println("Insira o nome: ");
					String nome = sc.next();
					System.out.println("Porcentagem da comissão: ");
					double percentualComissao = sc.nextDouble();
					vend = new Vendedor(codigo, nome, percentualComissao);
					break;
				case 2:
					System.out.println("Calculando a comissão");
					System.out.println("Valor da venda: ");
					double valorVendanovo = sc.nextDouble();
					double valorVenda = valorVendanovo;
					System.out.println("Valor do desconto: ");
					double descontonovo = sc.nextDouble();
					double desconto = descontonovo;
					System.out.println(vend.imprimir(valorVenda, desconto));
					vend = new Vendedor();
				case 3:
					System.out.println("Encerrando o programa");
					sc.close();
					return;
			}
		}
	}
}