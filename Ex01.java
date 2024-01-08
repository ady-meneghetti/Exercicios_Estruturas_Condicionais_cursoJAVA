package sequenciais;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int val1;
		
		System.out.println("Digite um valor: ");
		val1= teclado.nextInt();
		
		if (val1<0) 
			System.out.println("NEGATIVO");
			
		else System.out.println("NAO NEGATIVO");
				}

}
