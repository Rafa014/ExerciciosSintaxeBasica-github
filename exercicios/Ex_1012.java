package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double A, B, C;
		System.out.println(" *Área*");
		System.out.println("Digite os valores de A, B e C: ");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		double triangulo = (A * C)/2;
		double circulo = Math.pow(C,2) * 3.14159;
		double trapezio = ((A + B) * C)/2;
		double quadrado = Math.pow(B,2);
		double retangulo = A * B;
		System.out.printf("TRIANGULO = %.3f\n", triangulo);
		System.out.printf("CIRCULO = %.3f\n", circulo);
		System.out.printf("TRAPEZIO = %.3f\n", trapezio);
		System.out.printf("QUADRADO = %.3f\n", quadrado);
		System.out.printf("RETANGULO = %.3f\n", retangulo);
		
		sc.close();
	}

}
