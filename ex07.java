package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");

		int n;
		int dobro;
		double tp;

		System.out.printf("Informe um número: ");
		n = entrada.nextInt();

		dobro = (n * 2);
		tp = (n / (float) 3);

		System.out.println();
		System.out.println("Número informado: " + n);
		System.out.println("Dobro: " + dobro);
		System.out.println("Terça parte: " + deci.format(tp));

	}

}

/*

7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
Ex: Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666

*/