package lista_exec�cios;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		
		System.out.print("Qual � o seu nome: ");
		nome=entrada.nextLine();
		System.out.println("\nOl� " + nome + ", � um prazer te conhecer!");
	}

}

/*

2) Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual � o seu nome? Jo�o da Silva
Ol� Jo�o da Silva, � um prazer te conhecer!

*/