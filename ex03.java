package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double salario;
		String nome;
		
		System.out.print("Informe o nome do(a) fuincion�rio(a): ");
		nome=entrada.nextLine();
		System.out.print("Informe o sal�rio de " + nome + ": ");
		salario=entrada.nextDouble();
		
		System.out.print("\nO(a) funcion�rio(a) " + nome + " recebe um sal�rio de: R$" + deci.format(salario));

	}

}

/*

3) Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no final uma mensagem.
Ex:
Nome do Funcion�rio: Maria do Carmo
Sal�rio: 1850,45
O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho.

*/