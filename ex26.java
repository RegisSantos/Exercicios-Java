package lista_exec�cios;

import java.util.Scanner;

public class ex26 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.printf("Informe o 1� n�mero: ");
		n1=entrada.nextInt();
		System.out.printf("Informe o 2� n�mero: ");
		n2=entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println();
			System.out.println("Dos n�meros informados, " + n1 + " � o maior.");
		} else if (n1 < n2) {
			System.out.println();
			System.out.println("Dos n�meros informados, " + n2 + " � o maior.");
		} else {
			System.out.println();
			System.out.println("Os dois n�meros s�o iguais.");
		}
		
	}

}

/*

26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
- O primeiro valor � o maior
- O segundo valor � o maior
- N�o existe valor maior, os dois s�o iguais

*/