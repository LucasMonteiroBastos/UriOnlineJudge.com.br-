import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int distancia = sc.nextInt();
		double combustivel = sc.nextDouble();
		
		double result = distancia / combustivel;
		
		System.out.printf("%.3f km/l%n",result);
		
		
		
		sc.close();
	}

}
