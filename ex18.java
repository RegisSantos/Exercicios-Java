package lista_exec�cios;

import java.util.Scanner;

public class ex18 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int anoA;
		int anoN;
		int cal;
		
		System.out.printf("Informe o ano atual: ");
		anoA=entrada.nextInt();
		System.out.printf("Informe o ano do seu nascimento: ");
		anoN=entrada.nextInt();
		
		cal = (anoA - anoN);
		
		System.out.println();
		System.out.println("Sua idade: " + cal + " anos.");
		
		if (cal >= 18) {
			System.out.println("J� atingiu a maioridade, e est� apto a votar!");
		} else if (cal < 18 && cal >=16) {
			System.out.println("Voc� � menor de idade e j� tem 16 anos ou mais!");
			System.out.println("Pode votar, desde que apresente documenta��o comprovando emancipa��o!");
		} else {
			System.out.println("Voc� � menor de idade! N�o pode votar!");
		}
		
	}

}

/*

18) Fa�a um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou n�o votar.

*/