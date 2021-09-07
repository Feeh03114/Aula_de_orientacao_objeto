package application;

import java.util.Locale;
import java.util.Scanner;

public class Segundo{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira 20 numeros: ");
		double N = 20;
		double soma = 0;
		
		for(int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			soma += x;
		}
		System.out.println(soma);
		sc.close();
	}
}