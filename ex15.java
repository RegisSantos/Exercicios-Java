package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex15 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		int dias;
		double sal;
		double cal1;
		double cal2;
		
		System.out.printf("Informe a quantidade de dias trabalhados: ");
		dias=entrada.nextInt();
		
		cal1 = (8 * 25);
		cal2 = (cal1 * dias);
		
		System.out.println();
		System.out.println("Dias trabalhados: " + dias);
		System.out.println("Rendimentos di�rios: R$" + deci.format(cal1));
		System.out.println("Valor final do Sal�rio: R$" + deci.format(cal2));
		
	}

}

/*

15) Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o sal�rio de um funcion�rio, sabendo que ele trabalha
8 horas por dia e ganha R$25 por hora trabalhada.

*/