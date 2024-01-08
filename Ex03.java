package sequenciais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int A, B, C;
			
		System.out.println("Digite um valor:");
		A= teclado.nextInt();
		
		System.out.println("Digite segundo valor:");
		B= teclado.nextInt();
		
		if(A%B==0 || B%A==0)
				System.out.println("MULTIPLOS");
		else
				System.out.println("NAO MULTIPLOS");
				
			
	}

}
