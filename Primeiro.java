import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Idade: ");
		int num = sc.nextInt();
	
		
		System.out.println();
		System.out.printf("Idade = %d", num);
		
	
		sc.close();
	}

}
