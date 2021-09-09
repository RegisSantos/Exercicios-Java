package lista_execícios;

import java.util.Scanner;

public class ex26 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.printf("Informe o 1º número: ");
		n1=entrada.nextInt();
		System.out.printf("Informe o 2º número: ");
		n2=entrada.nextInt();
		
		if (n1 > n2) {
			System.out.println();
			System.out.println("Dos números informados, " + n1 + " é o maior.");
		} else if (n1 < n2) {
			System.out.println();
			System.out.println("Dos números informados, " + n2 + " é o maior.");
		} else {
			System.out.println();
			System.out.println("Os dois números são iguais.");
		}
		
	}

}

/*

26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais

*/