package lista_exec�cios;

import java.util.Scanner;

public class ex22 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int anoA;
		int anoN;
		int cal;
		int dif;
		
		System.out.printf("Informe o ano atual: ");
		anoA=entrada.nextInt();
		System.out.printf("Informe o seu ano de nascimento: ");
		anoN=entrada.nextInt();
		
		cal = (anoA - anoN);
		
		if (cal == 18) {
			System.out.println();
			System.out.println("Voc� tem 18 anos! Voc� deve se alistar e se apresentar esse ano!");
		} else if (cal < 18) {
			dif = (18 - cal);
			System.out.println();
			System.out.println("Voc� tem " + cal + " anos!");
			System.out.println("Ainda faltam " + dif + " anos pro seu alistamento!");
		} else {
			dif = (cal - 18);
			System.out.println();
			System.out.println("Voc� tem " + cal + " anos!");
			System.out.println("O seu alistamento foi h� " + dif + " anos!");
		}
		
	}

}

/*

22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situa��o em rela��o ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
- Se j� tiver depois dos 18 anos, mostre quantos anos j� se passaram do alistamento.

*/