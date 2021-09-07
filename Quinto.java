package application;

import java.util.Locale;
import java.util.Scanner;

public class Quinto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escolha uma das 3 opções: ");
		System.out.println("0 - Pedra");
		System.out.println("1 - Papel");
		System.out.println("2 - Tesoura");
		
		int op1;
		int op2;
		
		int game = 3;
		
		for (int i = 0; i<=game; i++) {
				op1 = sc.nextInt();
				op2 = sc.nextInt();
				if ((op1 == 0 && op2 == 2) || (op1 == 1 && op2 == 0) || 
						(op1 == 2 && op2 == 1)) {
					System.out.println("Jogador 1 venceu!");
				}else if ((op2 == 0 && op1 == 1) || (op2 == 1 && op1 == 1) ||
						(op2 == 2 && op2 == 1)) {
					System.out.println("Jogador 2 venceu!");
				}else {
					System.out.println("Empate!");
				}
			}
		sc.close();
    }
}