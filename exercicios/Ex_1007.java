package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1007 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int A, B, C, D;
		System.out.println(" *Diferença*");
		System.out.println("Digite os valores de A, B, C e D: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		int diferenca = A * B - C * D;
		System.out.println("DIFERENÇA = "+ diferenca);
		sc.close();
	}

}
