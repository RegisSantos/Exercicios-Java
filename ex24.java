package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex24 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double dist;
		double preco;
		
		System.out.printf("Informe qual a dist�ncia a ser percorrida: ");
		dist=entrada.nextDouble();
		
		if (dist <= 200) {
			preco = (dist * 0.5);
			System.out.println();
			System.out.println("Dist�ncia a ser percorrida: " + deci.format(dist) + "Km");
			System.out.println("Valor a ser pago: R$" + deci.format(preco));
		} else {
			preco = (dist * 0.45);
			System.out.println();
			System.out.println("Dist�ncia a ser percorrida: " + deci.format(dist) + "Km");
			System.out.println("Valor a ser pago: R$" + deci.format(preco));
		}
	}
}

/*

24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja percorrer em Km.
Calcule o pre�o da passagem, cobrando R$0.50 por Km para viagens at� 200Km e R$0.45 para viagens mais longas.

*/