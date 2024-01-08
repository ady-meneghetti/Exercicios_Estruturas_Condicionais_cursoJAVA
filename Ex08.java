package sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		float renda, ImpostoRenda;

		System.out.printf("Imforme o valor do salário: ");
		renda = teclado.nextFloat();

		ImpostoRenda = 0;

		if (renda >= 0.00 && renda <= 2000.00)
			System.out.println("Isento");

		if (renda > 2000.00 && renda <= 3000.00)
			ImpostoRenda = (renda * (8 / 100));

		if (renda > 3000.00 && renda <= 4500.00)
			ImpostoRenda = (renda * (18 / 100));

		if (renda > 4500.00)
			ImpostoRenda = (renda * (28 / 100));
		
		System.out.printf("R$ "+ ImpostoRenda);
	}

}
