package lista_exec�cios;

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
			System.out.println("O ano " + ano + " � um ano bissexto!");
		} else if (ano % 400 == 0) {
			System.out.println();
			System.out.println("O ano " + ano + " � um ano bissexto!");
		} else {
			System.out.println();
			System.out.println("O ano " + ano + " N�O � um ano bissexto!");
		}
		
	}

}

/*

21) Fa�a um algoritmo que leia um determinado ano e mostre se ele � ou n�o BISSEXTO.

*/