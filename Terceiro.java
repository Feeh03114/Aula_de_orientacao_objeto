package application;

import java.util.Locale;
import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira 20 numeros: ");
		double N = 20;
		
		double somapositivos = 0;
		double numnegativos = 0;
		
		for(int i=0; i<N; i++) {
			double x = sc.nextDouble();
			if(x > 0) {
				somapositivos += x;
			}else if (x < 0){
				numnegativos++;
			}
		}
		System.out.println("Soma dos positivos: " + somapositivos);
		System.out.println("Total de números negativos: "+ numnegativos);
		
		sc.close();
	}

}