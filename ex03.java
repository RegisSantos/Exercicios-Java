package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double salario;
		String nome;
		
		System.out.print("Informe o nome do(a) fuincionário(a): ");
		nome=entrada.nextLine();
		System.out.print("Informe o salário de " + nome + ": ");
		salario=entrada.nextDouble();
		
		System.out.print("\nO(a) funcionário(a) " + nome + " recebe um salário de: R$" + deci.format(salario));

	}

}

/*

3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

*/