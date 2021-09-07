package application;

import java.util.Locale;
import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int num;
		do {
			System.out.println("Digite um valor maior que zero: ");
			num = sc.nextInt();
		}while (num <= 0); 
		
		for ( int i = 0; i <= 10; i++) {
			System.out.println(num + "*" + i +" = " + num*i);
		}
		
		sc.close();
	}

}