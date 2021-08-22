import java.util.Locale;
import java.util.Scanner;

public class Segundo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("comprimento: ");
		double comp = sc.nextDouble();
        System.out.println("largura : ");
		double larg = sc.nextDouble();
        System.out.println("altura  : ");
		double alt = sc.nextDouble();
	
		double resul =  comp*larg*alt;
		System.out.println("%2f");
		System.out.printf("%.2f X %.2f x %.2f = %.2f",comp,larg, alt,resul);
		
	
		sc.close();
	}

}
