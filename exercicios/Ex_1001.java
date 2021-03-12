package exercicios;

import java.util.Scanner;

public class Ex_1001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Extremamente Básico*");
		System.out.print("Digite os valores de A e B: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		int x = A + B;
		System.out.printf("x = %d", x);
		sc.close();

	}

}
