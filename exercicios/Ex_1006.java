package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double A, B, C;
		System.out.println(" *Média 2*");
		do {
			System.out.println("Digite as notas A, B e C: ");
			A = sc.nextDouble();
			B = sc.nextDouble();
			C = sc.nextDouble();
			if (A < 0 || A > 10 || B < 0 || B > 10 || C < 0 || C > 10)
				System.out.println("Notas invalidas (0.0 a 10.0). Tente novamente...");
		} while (A < 0 || A > 10 || B < 0 || B > 10 || C < 0 || C > 10);
		double media = (A*2 + B*3 + C*5)/10;
		System.out.printf("MEDIA = %.1f", media);
		sc.close();
	}

}
