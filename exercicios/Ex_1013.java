package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1013 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int a, b, c;
		System.out.println(" *O Maior*");
		System.out.println("Digite três valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		int MaiorAB = (a+b + a*b*(a-b))/2;
		int maior = (c - MaiorAB + c + MaiorAB)/2;
		
		System.out.printf("%d eh o maior",maior);
		sc.close();
	}

}
