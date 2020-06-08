import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, anos, meses, dias, resto;
		
		n = sc.nextInt();
		
		anos  = n / 365;
		resto = n % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " ano(es)");
		System.out.println(dias + " ano(s)");
		
		
		
		
	
		
		
		
		
		
		sc.close();
	}

}
