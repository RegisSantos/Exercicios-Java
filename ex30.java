package lista_execícios;

import java.util.Scanner;

public class ex30 {
	
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
		
		if (s1 < (s2 + s3) && s2 < (s1 + s3)  && s3 < (s1 + s2)) {
			System.out.println();
			System.out.println("Os 3 segmentos de reta FORMAM um triângulo!");
			if (s1 == s2 && s2 == s3) {
				System.out.println("Esse triângulo é do tipo EQUILÁTERO!");
			} else if ((s1 == s2 && s2!= s3) || (s1 == s3 && s2 != s3) || (s2 == s3 && s3 != s1)) {
				System.out.println("Esse triângulo é do tipo ISÓCELES!");
			} else if (s1 != s2 && s2 != s3) {
				System.out.println("Esse triângulo é do tipo ESCALENO!");
			}
		} else {
			System.out.println();
			System.out.println("Os 3 segmentos NÃO FORMAM um triângulo!");
		}
		
	}

}

/*
30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes

*/