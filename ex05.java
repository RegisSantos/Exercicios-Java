package lista_exec�cios;

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
		
		System.out.printf("Informe a 1� nota: ");
		n1=entrada.nextDouble();
		System.out.printf("Informe a 2� nota: ");
		n2=entrada.nextDouble();
		System.out.printf("Informe a 3� nota: ");
		n3=entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.printf("\nA m�dia entre " + n1 + ", " + n2 + " e " + n3 + " �: " + deci.format(media));
		
	}

}

/*

5) Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre na tela a sua m�dia na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A m�dia entre 4.5 e 8.5 � igual a 6.5

*/