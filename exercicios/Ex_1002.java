package exercicios;

import java.util.Scanner;

public class Ex_1002 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" *Área do Círculo*");
		System.out.print("Digíte o raio do circulo: ");
		double raio = sc.nextDouble();
		double area = Math.pow(raio, 2) * 3.14;
		System.out.println("Area = " + area);
		sc.close();
		
	}
}
