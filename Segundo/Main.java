package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = null;
		String ra = "";
		String nome = "";
		float ac1 = 0;
		float ac2 = 0;
		float ag = 0;
		float af = 0;
		int escolha = 0;

		while (escolha != 3) {
			System.out.println("===MENU===");
			System.out.println("1 - Criar aluno");
			System.out.println("2 - Ver aluno");
			System.out.println("3 - Sair\n");
			escolha = sc.nextInt();

			if (escolha == 1) {
				System.out.println("\nRA: ");
				ra = sc.next();
				System.out.println("Nome: ");
				nome = sc.next();
				System.out.println("AC1: ");
				ac1 = sc.nextFloat();
				System.out.println("AC2: ");
				ac2 = sc.nextFloat();
				System.out.println("AG: ");
				ag = sc.nextFloat();
				System.out.println("AF: ");
				af = sc.nextFloat();
				aluno1 = new Aluno(ra, nome, ac1, ac2, ag, af);
			} else if (escolha == 2) {
				System.out.println("\n" + aluno1.imprimir());
			} else {
				System.out.println("Finalizando");

			}
		}
		;

		sc.close();

	}

}