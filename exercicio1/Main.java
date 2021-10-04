package application;

import java.util.Locale;
import java.util.Scanner;
import entites.Calculadora;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		while (true) {
			System.out.println("===Menu===");
			System.out.println("\n1-Somar \n2-Subtrair \n3-Multiplicar \n4-Dividr" + "\n5-Sair");
			int opcao = sc.nextInt();
			if (opcao == 5) {
				System.out.println("Encerrando a calculadora");
				sc.close();
				return;
			}
			System.out.println("Insira o primeiro numero: ");
			double numero1 = sc.nextInt();
			System.out.println("Insira o segundo numero: ");
			double numero2 = sc.nextInt();
			switch (opcao) {
				case 1:
					System.out.println("Resultado da soma: " + calc.soma(numero1, numero2));
					break;
				case 2:
					System.out.println("Resultado da subtração: " + calc.subtracao(numero1, numero2));
					break;
				case 3:
					System.out.println("Resultado da multiplicação: " + calc.multiplicacao(numero1, numero2));
					break;
				case 4:
					System.out.println("Resultado da divisão: " + calc.divisao(numero1, numero2));
			}
		}
	}
}