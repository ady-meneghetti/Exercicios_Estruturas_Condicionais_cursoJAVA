package sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);
		
		float valor;
		int v1a, v1b, v2a, v2b, v3a, v3b, v4a, v4b;
		String intervalo;
		
		v1a= 0;
		v1b= 25;
		v2a= 25;
		v2b= 50;
		v3a= 50;
		v3b= 75;
		v4a= 75;
		v4b= 100;
		
		System.out.printf("Digite um valor: ");
		valor= teclado.nextFloat();
		
		intervalo= "";
		
		if (valor<v1a || valor>v4b)
			intervalo= "Fora de intervalo";
		
		if (valor>=v1a && valor<=v1b)
			intervalo= "("+ v1a +","+ v1b +")";
		
		if (valor>v2a && valor<=v2b)
			intervalo= "("+ v2a +","+ v2b +")";
		
		if (valor>v3a && valor<=v3b)
			intervalo= "("+ v3a +","+ v3b +")";
		
		if (valor>v4a && valor<=v4b)
			intervalo= "("+ v4a +","+ v4b +")";
		
		System.out.println("Intervalo: " + intervalo);

	}

}
