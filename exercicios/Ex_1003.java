package exercicios;

import java.util.Scanner;

public class Ex_1003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Soma Simples*");
		System.out.print("Digite os valores de A e B: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int soma = A + B;
		System.out.printf("SOMA = %d", soma);
		sc.close();

	}

}
