import java.util.Locale;
import java.util.Scanner;

public class Quarto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Altura : ");
		double alt = sc.nextDouble();
        
        System.out.println("Largura  : ");
		double larg = sc.nextDouble();

        double area =  alt*larg;
		double periodo =  (2*alt)+(2*larg);
		System.out.printf("Periodo: (2x %.2f) + (2x %.2f) = %.2f", alt, larg, periodo);
        System.out.printf("\nArea: %.2f x %.2f = %.2f", alt, larg, area);
		
	
		sc.close();
	}

}
