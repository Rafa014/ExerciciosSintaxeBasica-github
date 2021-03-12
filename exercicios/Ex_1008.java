package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Salário*");
		System.out.print("Informe o ID do funcionario:  ");
		int id = sc.nextInt();
		System.out.print("Número de horas trabalhadas: ");
		int horas = sc.nextInt();
		System.out.print("Salario por hora: ");
		double valor = sc.nextDouble();
		double salario = valor * horas;
		System.out.printf("-------------------------------\n\n");
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f", salario);
		sc.close();
	}

}
