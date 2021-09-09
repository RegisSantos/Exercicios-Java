package lista_execícios;

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
			System.out.println("Já atingiu a maioridade, e está apto a votar!");
		} else if (cal < 18 && cal >=16) {
			System.out.println("Você é menor de idade e já tem 16 anos ou mais!");
			System.out.println("Pode votar, desde que apresente documentação comprovando emancipação!");
		} else {
			System.out.println("Você é menor de idade! Não pode votar!");
		}
		
	}

}

/*

18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade dela e depois mostre se ela pode ou não votar.

*/