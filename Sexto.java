import java.util.Locale;

public class Sexto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double conta = Math.pow(Math.pow((6*(3+2)), 2)/(3*2)-(Math.pow((((1-5)*(2-7)/2)),2)),3)/Math.pow(10, 3); 
		System.out.printf("%.2f", conta);
	}

}
