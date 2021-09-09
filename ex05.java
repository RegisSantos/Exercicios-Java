package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex05 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double n1;
		double n2;
		double n3;
		double media;
		
		System.out.printf("Informe a 1ª nota: ");
		n1=entrada.nextDouble();
		System.out.printf("Informe a 2ª nota: ");
		n2=entrada.nextDouble();
		System.out.printf("Informe a 3ª nota: ");
		n3=entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.printf("\nA média entre " + n1 + ", " + n2 + " e " + n3 + " é: " + deci.format(media));
		
	}

}

/*

5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5

*/