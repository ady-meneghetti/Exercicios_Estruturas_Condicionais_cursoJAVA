package sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);
		
		float x,y;
		String quadrante;
		
		System.out.printf("Imforme o primeiro valor: ");
		x= teclado.nextFloat();
		
		System.out.printf("Informe o segundo valor: ");
		y= teclado.nextFloat();
		
		quadrante= "";
		
		if (x==0.0 && y==0.0)
			quadrante= "Origem";
		
		if (x==0.0 && y>0)
			quadrante= "Eixo Y";
		
		if (x>0 && y==0)
			quadrante= "Eixo X";
		
		if (x>0 && y>0)
			quadrante= "Q1";
		
		if(x<0 && y>0)
			quadrante= "Q2";
		
		if(x<0 && y<0)
			quadrante= "Q3";
		
		if(x>0 && y<0)
			quadrante= "Q4";
		
		System.out.println("Quadrante: " + quadrante);
	}

}
