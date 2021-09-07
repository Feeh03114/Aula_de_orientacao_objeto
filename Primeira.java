import java.util.Locale;
import java.util.Scanner;

public class Primeira {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double maior, menor, meio;
		System.out.println("Number: ");
		double num = sc.nextDouble();
		maior = num;
		menor = num;
		meio = num;
		
		for(int i = 0;i <3; i++){
			System.out.println("Number: ");
			num = sc.nextDouble();
			if (num < menor){
				menor = num;
			}else if (num > maior){
				maior = num;
			}else if num> menor && num <maior{
				meio = num;
			}
			
		}

		System.out.println("Maior: %.2f\nMenor: %.2f\nMeio: %.2f ", maior, menor, meio);
		
		
		sc.close();
	}

}
