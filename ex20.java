package lista_execícios;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;

		System.out.printf("Informe um número: ");
		n = entrada.nextInt();

		if (n > 0 && n % 2 == 0) {
			System.out.println();
			System.out.println("O número é PAR e POSITIVO!");
		} else if (n < 0 && n % 2 == 0) {
			System.out.println();
			System.out.println("O número é PAR e NEGATIVO!");
		} else if (n > 0 && n % 2 != 0) {
			System.out.println();
			System.out.println("O número é ÍMPAR e POSITIVO!");
		} else if (n < 0 && n % 2 != 0) {
			System.out.println();
			System.out.println("O número é ÍMPAR e NEGATIVO!");
		} else {
			System.out.println();
			System.out.println("O número 0 é neutro!");
		}

	}

}

/*

20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR, e se é POSITIVO ou NEGATIVO.

*/