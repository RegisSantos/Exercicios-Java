package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");

		double preco;
		double desc;
		double total;

		System.out.printf("Infrome o pre�o do produto: ");
		preco = entrada.nextDouble();

		desc = (preco * 5) / 100;
		total = (preco - desc);

		System.out.println();
		System.out.println("Pre�o do Produto: R$" + deci.format(preco));
		System.out.println("Valor do Desconto: R$" + deci.format(desc));
		System.out.println("Valor final a pagar: R$" + deci.format(total));
	}

}

/*

12) Crie um programa que leia o pre�o de um produto, calcule e mostre o seu PRE�O PROMOCIONAL, com 5% de desconto.

*/