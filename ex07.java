package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");

		int n;
		int dobro;
		double tp;

		System.out.printf("Informe um n�mero: ");
		n = entrada.nextInt();

		dobro = (n * 2);
		tp = (n / (float) 3);

		System.out.println();
		System.out.println("N�mero informado: " + n);
		System.out.println("Dobro: " + dobro);
		System.out.println("Ter�a parte: " + deci.format(tp));

	}

}

/*

7) Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a sua ter�a parte.
Ex: Digite um n�mero: 3.5
O dobro de 3.5 � 7.0
A ter�a parte de 3.5 � 1.16666

*/