package sequenciais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int Hinicio, Hfinal, Durou1, Durou2, dia;

		dia = 24;
		
		System.out.println("Horario do inicio do jogo: ");
		Hinicio = teclado.nextInt();

		System.out.println("Horario do fim do jogo: ");
		Hfinal = teclado.nextInt();
		
		Durou1 = (Hfinal - Hinicio);
		Durou2 = ((dia) - Hinicio + Hfinal);


		if (Hinicio < 0 || Hfinal < 0)
			System.out.println("-");

		else if (Hinicio < Hfinal)
			System.out.printf("O JOGO DUROU: " + Durou1 + " HORAS");
		else
			System.out.printf("O JOGO DUROU: " + Durou2 + " HORAS");
	}

}
