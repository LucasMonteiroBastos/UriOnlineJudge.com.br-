

import java.util.Scanner;

public class uri1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, quociente, resto, nota;
		
		N = sc.nextInt();
		System.out.println(N);
		
		resto = N;
		
		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	resto = resto % nota;
	
		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	resto = resto % nota;	
	
		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	resto = resto % nota;
	
		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	resto = resto % nota;
	
		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	resto = resto % nota;
	
		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	resto = resto % nota;

		System.out.println(resto + " notas(s) de R$ de nota 1,00");
		
	
		sc.close();
	}

}
