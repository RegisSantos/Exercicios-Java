package lista_execícios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n1;
		int n2;
		int soma;
		int sub;
		int mult;
		int div;

		System.out.printf("Informe o 1º número: ");
		n1 = entrada.nextInt();
		System.out.printf("Informe o 2º número: ");
		n2 = entrada.nextInt();

		soma = (n1 + n2);
		sub = (n1 - n2);
		mult = (n1 * n2);
		div = (n1 / n2);

		System.out.println();
		System.out.println("Soma: " + n1 + " + " + n2 + " = " + soma);
		System.out.println("Subtração: " + n1 + " - " + n2 + " = " + sub);
		System.out.println("Multiplicação: " + n1 + " x " + n2 + " = " + mult);
		System.out.println("Divisão: " + n1 + " / " + n2 + " = " + div);

	}

}

/*

4) Desenvolva um algoritmo que leia dois números inteiros e mostre as 4 operações matemáticas básicas entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.

*/