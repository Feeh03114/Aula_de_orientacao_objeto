package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa1 = null;
		String cpf = "";
		String nome = "";
		Integer Idade = 0;
		char sx;
		int escolha = 0;

		while (escolha != 3) {
			System.out.println("===MENU===");
			System.out.println("1 - Criar pessoa");
			System.out.println("2 - Ver pessoa");
			System.out.println("3 - Sair\n");
			escolha = sc.nextInt();

			if (escolha == 1) {
				System.out.println("\nCPF: ");
				cpf = sc.next();
				System.out.println("Nome: ");
				nome = sc.next();
				System.out.println("Idade: ");
				Idade = sc.nextInt();
				System.out.println("Sexo: ");
				sx = sc.next().charAt(0);
				pessoa1 = new Pessoa(cpf, nome, Idade, sx);
			} else if (escolha == 2) {
				System.out.println("\n" + pessoa1.imprimir());
			} else {
				System.out.println("Finalizando");

			}
		}
		;

		sc.close();

	}

}