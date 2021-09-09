package lista_execícios;

import java.util.Scanner;

public class ex25 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int s1;
		int s2;
		int s3;
		
		System.out.printf("Informe o 1º segmento de reta: ");
		s1=entrada.nextInt();
		System.out.printf("Informe o 2º segmento de reta: ");
		s2=entrada.nextInt();
		System.out.printf("Informe o 3º segmento de reta: ");
		s3=entrada.nextInt();
		
		if (s1 < (s2 + s3) && s2 < (s1 + s3) && s3 < (s1 + s2)) {
			System.out.println();
			System.out.println("Os segmentos de reta FORMAM um triângulo: ");
		} else {
			System.out.println();
			System.out.println("Os segmentos de reta NÃO FORMAM um triângulo: ");
		}
		
	}

}

/*

25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
Matematicamente, para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

*/