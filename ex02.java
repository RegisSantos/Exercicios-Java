package lista_execícios;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		
		System.out.print("Qual é o seu nome: ");
		nome=entrada.nextLine();
		System.out.println("\nOlá " + nome + ", é um prazer te conhecer!");
	}

}

/*

2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!

*/