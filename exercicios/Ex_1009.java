package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.println(" *Salário com Bônus*");
		System.out.print("Digite o nome do vendedor:  ");
		String nome = sc.next();
		System.out.print("Salario fixo: ");
		double fixo = sc.nextDouble();
		System.out.print("Total de vendas realizadas: ");
		double vendas = sc.nextDouble();
		double salario = fixo + vendas*0.15;
		System.out.printf("-------------------------------\n\n");
		System.out.println(nome);
		System.out.printf("TOTAL = R$ %.2f", salario);
		sc.close();
	}

}
