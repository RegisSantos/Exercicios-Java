package lista_exec�cios;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;

		System.out.printf("Informe um n�mero: ");
		n = entrada.nextInt();

		if (n > 0 && n % 2 == 0) {
			System.out.println();
			System.out.println("O n�mero � PAR e POSITIVO!");
		} else if (n < 0 && n % 2 == 0) {
			System.out.println();
			System.out.println("O n�mero � PAR e NEGATIVO!");
		} else if (n > 0 && n % 2 != 0) {
			System.out.println();
			System.out.println("O n�mero � �MPAR e POSITIVO!");
		} else if (n < 0 && n % 2 != 0) {
			System.out.println();
			System.out.println("O n�mero � �MPAR e NEGATIVO!");
		} else {
			System.out.println();
			System.out.println("O n�mero 0 � neutro!");
		}

	}

}

/*

20) Desenvolva um programa que leia um n�mero inteiro e mostre se ele � PAR ou �MPAR, e se � POSITIVO ou NEGATIVO.

*/