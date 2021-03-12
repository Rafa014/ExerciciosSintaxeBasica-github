package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Cálculo Simples*");
		System.out.println("Digite o codigo, numero e o valor unitario da peça 1:  ");
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		System.out.println("Digite o codigo, numero e o valor unitario da peça 2:  ");
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		double total = valor1 * num1 + valor2 * num2;
		System.out.printf("-------------------------------\n\n");
		System.out.printf("Codigo 1: %d | Codigo 2: %d\n",cod1,cod2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		sc.close();
	}

}
