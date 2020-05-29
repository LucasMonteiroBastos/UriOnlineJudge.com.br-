import java.util.Locale;
import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int numeroHorasTrabalhadas = sc.nextInt();
		double valorHoras = sc.nextDouble();
		double salario = numeroHorasTrabalhadas * valorHoras;

		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();
	}

}