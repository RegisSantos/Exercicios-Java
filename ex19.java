package lista_execícios;

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
		System.out.printf("Informe a 1ª nota de " + nome + ": ");
		n1=entrada.nextDouble();
		System.out.printf("Informe a 2ª nota de " + nome + ": ");
		n2=entrada.nextDouble();
		System.out.printf("Informe a 3ª nota de " + nome + ": ");
		n3=entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println();
		System.out.println("A média de " + nome + " é: " + deci.format(media));
		
		if (media >= 7) {
			System.out.println(nome + " está APROVADO(A)!");
		} else if (media < 7 && media >=6) {
			System.out.println(nome + " está EM RECUPERAÇÃO!");
		} else {
			System.out.println(nome + " está REPROVADO(A)!");
		}
		
	}

}

/*

19) Crie um algoritmo que leia o nome e as três notas de um aluno, calcule a sua média e mostre na tela.
No final, analise a média e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0).

*/