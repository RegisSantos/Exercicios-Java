package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");

		double sal;
		double reaj;
		double salF;

		System.out.printf("Informe o valor do salário atual do funcionário: R$ ");
		sal = entrada.nextDouble();

		reaj = (sal * 15) / 100;
		salF = (sal + reaj);

		System.out.println();
		System.out.println("Valor do salário: R$" + deci.format(sal));
		System.out.println("Porcentagem de reajuste: 15%");
		System.out.println("Valor do reajuste: R$" + deci.format(reaj));
		System.out.println("Valor do salário reajustado: R$" + deci.format(salF));
	}

}

/*

13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o seu novo salário, com 15% de aumento.

*/