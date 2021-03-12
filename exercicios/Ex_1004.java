package exercicios;

import java.util.Scanner;

public class Ex_1004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Produto Simples*");
		System.out.print("Digite os valores de x e y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int PROD = x * y;
		System.out.printf("PROD = %d", PROD);
		sc.close();
	}

}
