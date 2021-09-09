package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double quantKm;
		double calKm;
		int dias;
		int calDias;
		double calT;
		
		System.out.printf("Informe a quantidade de Km percorridos: ");
		quantKm=entrada.nextDouble();
		System.out.printf("Informe por quantos dias o carro fui utilizado: ");
		dias=entrada.nextInt();
		
		calKm = (quantKm * 0.2);
		calDias = (dias * 90);
		calT = (calDias + calKm);
		
		System.out.println();
		System.out.println("Quilômetros rodados: " + quantKm + "Km");
		System.out.println("Dias que o carro foi utilizado: " + dias + " dias.");
		System.out.println("Preço por Km rodado: R$" + deci.format(calKm));
		System.out.println("Preço por dia utilizado: R$" + deci.format(calDias));
		System.out.println("Preço Total: R$" + deci.format(calT));
		
	}

}

/*

14) A locadora de carros precisa da sua ajuda para cobrar seus serviços.
Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado.
Calcule o preço total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

*/