package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double A, B;
		System.out.println(" *Média 1*");
		do {
			System.out.print("Digite as notas A e B: ");
			A = sc.nextDouble();
			B = sc.nextDouble();
			if (A < 0 || A > 10 || B < 0 || B > 10)
				System.out.println("Notas invalidas (0 a 10). Tente novamente...");
		} while (A < 0 || A > 10 || B < 0 || B > 10);
		double media = (A*3.5 + B*7.5)/11;
		System.out.printf("MEDIA = %.5f", media);
		sc.close();
	}

}
