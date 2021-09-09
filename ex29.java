package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex29 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		String nome;
		double sal;
		int anos;
		double reaj;
		double salF;
		
		System.out.printf("Informe o nome do(a) funcionário(a): ");
		nome=entrada.nextLine();
		System.out.printf("Informe o salário atual de " + nome + ": ");
		sal=entrada.nextDouble();
		System.out.printf("Informe quantos anos " + nome + " trabalha na empresa: ");
		anos=entrada.nextInt();
		
		if (anos < 3) {
			reaj = (sal * 3) / 100;
			salF = (sal + reaj);
			System.out.println();
			System.out.println("Nome do(a) funcionário(a): " + nome);
			System.out.println("Tempo de trabalho de " + nome + " na empresa: " + anos);
			System.out.println("Salário atual de " + nome + ": R$" + deci.format(sal));
			System.out.println("Valor de reajuste: R$" + deci.format(reaj));
			System.out.println("Salário final a ser pago para " + nome + ": R$" + deci.format(salF));
		} else if (anos >= 3 && anos <10) {
			reaj = (sal * 12.5) / 100;
			salF = (sal + reaj);
			System.out.println();
			System.out.println("Nome do(a) funcionário(a): " + nome);
			System.out.println("Tempo de trabalho na empresa: " + anos);
			System.out.println("Salário atual: R$" + deci.format(sal));
			System.out.println("Valor de reajuste: R$" + deci.format(reaj));
			System.out.println("Salário Reajustado: R$" + deci.format(salF));
		} else {
			reaj = (sal * 20) / 100;
			salF = (sal + reaj);
			System.out.println();
			System.out.println("Nome do(a) funcionário(a): " + nome);
			System.out.println("Tempo de trabalho na empresa: " + anos);
			System.out.println("Salário atual: R$" + deci.format(sal));
			System.out.println("Valor de reajuste: R$" + deci.format(reaj));
			System.out.println("Salário Reajustado: R$" + deci.format(salF));
		}
		
	}

}

/*

29) Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário,
reajustado de acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%

*/