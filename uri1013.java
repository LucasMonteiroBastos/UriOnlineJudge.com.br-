import java.util.Scanner;

public class uri1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maiorAb = (a + b + Math.abs(a-b)) / 2;
		int maiorAbc = (maiorAb + c + Math.abs(maiorAb-c)) / 2;
		
		System.out.printf("%d eh o maior",maiorAbc);
		
		sc.close();
	}

}
