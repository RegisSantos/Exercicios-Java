package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double dinheiro;
		double dolar;
		double conversao;
		
		System.out.printf("Informe qual valor em REAIS voc� tem na carteira: ");
		dinheiro=entrada.nextDouble();
		
		dolar = 3.45;
		conversao = (dinheiro * dolar);
		
		System.out.println();
		System.out.println("Valor em reais: R$" + deci.format(dinheiro));
		System.out.println("Voc� pode comprar US$" + deci.format(conversao));


	}

}


/*

9) Fa�a um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) e mostre quantos d�lares ela pode comprar.
Considere US$1,00 = R$3,45.

*/