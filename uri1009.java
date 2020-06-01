import java.util.Locale;
import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		
		double resultado = (totalVendas  * 15) / 100.0;
		double resultadoFinal = salarioFixo + resultado;
		
		System.out.printf("TOTAL = R$ %.2f%n", resultadoFinal);
		
		
		sc.close();
	}

}
