package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		double pi = 3.14159;
		System.out.println(" *Esfera*");
		System.out.print("Digíte o raio da esfera: ");
		double raio = sc.nextDouble();
		double volume = 4.0/3 * pi * Math.pow(raio, 3);
		System.out.printf("VOLUME = %.3f",volume);
		sc.close();
	}

}
