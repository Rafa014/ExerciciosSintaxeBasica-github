package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Consumo*");
		System.out.print("Digite a distancia total (em Km): ");
		int X = sc.nextInt();
		System.out.print("Digite o total de combustivel gasto (em litros): ");
		double Y = sc.nextDouble();
		double consumo = X/Y;
		System.out.printf("----------------------\n\n");
		System.out.printf("%.3f km/l",consumo);
		sc.close();

	}

}
