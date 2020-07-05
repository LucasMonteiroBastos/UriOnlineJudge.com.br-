import java.util.Locale;
import java.util.Scanner;

public class uri117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		while(a < 0.0 || a > 10.0) {
			System.out.println("nota invalida");
			a = sc.nextDouble();
		}
		
		double b = sc.nextDouble();
		while(b < 0.0 || b > 10.0) {
			System.out.println("nota invalida");
			b = sc.nextDouble();
		}
		
		double media = (a + b) / 2.0;
		System.out.printf("media = %.2f%n", media);
		sc.close();
	}

}
