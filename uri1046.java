import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int horaTotal;
		if(horaInicial < horaFinal) {
			horaTotal = horaFinal - horaInicial;
		}
		else {
			horaTotal = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + horaTotal + " HORA(S)");
		
		sc.close();
	}

}
