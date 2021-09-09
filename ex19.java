package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex19 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0");
		
		String nome;
		double n1;
		double n2;
		double n3;
		double media;
		
		System.out.printf("Informe o nome do(a) aluno(a): ");
		nome=entrada.nextLine();
		System.out.printf("Informe a 1� nota de " + nome + ": ");
		n1=entrada.nextDouble();
		System.out.printf("Informe a 2� nota de " + nome + ": ");
		n2=entrada.nextDouble();
		System.out.printf("Informe a 3� nota de " + nome + ": ");
		n3=entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println();
		System.out.println("A m�dia de " + nome + " �: " + deci.format(media));
		
		if (media >= 7) {
			System.out.println(nome + " est� APROVADO(A)!");
		} else if (media < 7 && media >=6) {
			System.out.println(nome + " est� EM RECUPERA��O!");
		} else {
			System.out.println(nome + " est� REPROVADO(A)!");
		}
		
	}

}

/*

19) Crie um algoritmo que leia o nome e as tr�s notas de um aluno, calcule a sua m�dia e mostre na tela.
No final, analise a m�dia e mostre se o aluno teve ou n�o um bom aproveitamento (se ficou acima da m�dia 7.0).

*/