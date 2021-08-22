import java.util.Locale;
import java.util.Scanner;

public class Quinto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Temperatura em ºC : ");
		double temp = sc.nextDouble();

        double F =  (9*temp+160)/5;
		System.out.printf("Conversao: (9 x %.2f + 160) / 5", temp);
        System.out.printf("\nF= %.2f", F);
		
	
		sc.close();
	}

}
