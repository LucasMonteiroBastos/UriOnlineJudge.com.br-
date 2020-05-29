import java.util.Scanner;

public class uri1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distanciaKm = sc.nextInt();
		
		int tempoMinutos = distanciaKm * 2;
		
		System.out.println(tempoMinutos + " minutos");
		
		sc.close();
	}

}
