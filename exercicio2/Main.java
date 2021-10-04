package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Apolice;

public class Program {
	public static void Main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Apolice apolice = null;
		while (true) {
			System.out.println("===Menu===");
			System.out.println("\n1-Criar Apolice \n2-Ver Dados Apolice\n3-Sair");
			int escolha = sc.nextInt();
			switch (escolha) {
				case 1:
					apolice = new Apolice();
					System.out.println("Numero da apolice: ");
					apolice.setNumero(sc.nextInt());
					System.out.println("Nome: ");
					apolice.setNome(sc.next());
					System.out.println("Idade: ");
					apolice.setIdade(sc.nextInt());
					System.out.println("Sexo: ");
					apolice.setSexo(sc.next().charAt(0));
					System.out.println("Valor do Automovel: ");
					apolice.setValorAutomovel(sc.nextDouble());
					break;
				case 2:
					if (apolice != null) {
						System.out.println(apolice.imprimir());
					} else {
						System.out.println("Apolice não criada");
					}
					break;
				case 3:
					System.out.println("Encerrando o porograma");
					sc.close();
					return;
			}
		}
	}
}