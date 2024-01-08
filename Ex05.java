package sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner teclado = new Scanner(System.in);

		int cq, xs, xb, ts, ref, quantidade, codigo;
		float Pcq, Pxs, Pxb, Pts, Pref, total;

		cq = 1;
		xs = 2;
		xb = 3;
		ts = 4;
		ref = 5;

		Pcq = 4.00f;
		Pxs = 4.50f;
		Pxb = 5.00f;
		Pts = 2.00f;
		Pref = 1.50f;

		total = 0f;

		System.out.println("Digite o codigo do item: ");
		codigo = teclado.nextInt();

		System.out.println("Digite a quantidade de item: ");
		quantidade = teclado.nextInt();

		if (codigo == cq)
			total = (quantidade * Pcq);

		if (codigo == xs)
			total = (quantidade * Pxs);

		if (codigo == xb)
			total = (quantidade * Pxb);

		if (codigo == ts)
			total = (quantidade * Pts);

		if (codigo == ref)
			total = (quantidade * Pref);

		System.out.printf("Total: R$ %.2f%n", total);

	}

}
