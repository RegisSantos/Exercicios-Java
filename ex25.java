package lista_exec�cios;

import java.util.Scanner;

public class ex25 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int s1;
		int s2;
		int s3;
		
		System.out.printf("Informe o 1� segmento de reta: ");
		s1=entrada.nextInt();
		System.out.printf("Informe o 2� segmento de reta: ");
		s2=entrada.nextInt();
		System.out.printf("Informe o 3� segmento de reta: ");
		s3=entrada.nextInt();
		
		if (s1 < (s2 + s3) && s2 < (s1 + s3) && s3 < (s1 + s2)) {
			System.out.println();
			System.out.println("Os segmentos de reta FORMAM um tri�ngulo: ");
		} else {
			System.out.println();
			System.out.println("Os segmentos de reta N�O FORMAM um tri�ngulo: ");
		}
		
	}

}

/*

25) [DESAFIO] Crie um programa que leia o tamanho de tr�s segmentos de reta.
Analise seus comprimentos e diga se � poss�vel formar um tri�ngulo com essas retas.
Matematicamente, para tr�s segmentos formarem um tri�ngulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

*/