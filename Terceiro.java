import java.util.Locale;
import java.util.Scanner;

public class Terceiro {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Velocidade: ");
		int Vel = sc.nextInt();
        
        System.out.println("Tempo : ");
		double temp = sc.nextDouble();

        double velm =  Vel/temp;
		double dist =  Vel*temp;
        double listros =  dist/12;
		System.out.printf("Velocidade Média: %.2f \nTempo: %.2f\nDistancia: %.2f\nLitros: %.2f", velm, temp, dist, listros);
		
	
		sc.close();
	}

}
