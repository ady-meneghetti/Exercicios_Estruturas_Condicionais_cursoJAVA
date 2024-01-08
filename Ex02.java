package sequenciais;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int val1;
		
		System.out.println("Digite um valor: ");
		val1=teclado.nextInt();
		
		if (val1%2==0)
			System.out.println("PAR");
		else
			System.out.println("IMPAR");

	}

}
