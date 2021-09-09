package lista_execícios;

import java.util.Scanner;

public class ex21 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int ano;
		int cal;
		
		System.out.printf("Informe um determinado ano: ");
		ano=entrada.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println();
			System.out.println("O ano " + ano + " É um ano bissexto!");
		} else if (ano % 400 == 0) {
			System.out.println();
			System.out.println("O ano " + ano + " É um ano bissexto!");
		} else {
			System.out.println();
			System.out.println("O ano " + ano + " NÃO É um ano bissexto!");
		}
		
	}

}

/*

21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

*/