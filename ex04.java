package lista_exec�cios;

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

		System.out.printf("Informe o 1� n�mero: ");
		n1 = entrada.nextInt();
		System.out.printf("Informe o 2� n�mero: ");
		n2 = entrada.nextInt();

		soma = (n1 + n2);
		sub = (n1 - n2);
		mult = (n1 * n2);
		div = (n1 / n2);

		System.out.println();
		System.out.println("Soma: " + n1 + " + " + n2 + " = " + soma);
		System.out.println("Subtra��o: " + n1 + " - " + n2 + " = " + sub);
		System.out.println("Multiplica��o: " + n1 + " x " + n2 + " = " + mult);
		System.out.println("Divis�o: " + n1 + " / " + n2 + " = " + div);

	}

}

/*

4) Desenvolva um algoritmo que leia dois n�meros inteiros e mostre as 4 opera��es matem�ticas b�sicas entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 � igual a 13.

*/