package lista_exec�cios;

import java.util.Scanner;

public class ex30 {
	
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
		
		if (s1 < (s2 + s3) && s2 < (s1 + s3)  && s3 < (s1 + s2)) {
			System.out.println();
			System.out.println("Os 3 segmentos de reta FORMAM um tri�ngulo!");
			if (s1 == s2 && s2 == s3) {
				System.out.println("Esse tri�ngulo � do tipo EQUIL�TERO!");
			} else if ((s1 == s2 && s2!= s3) || (s1 == s3 && s2 != s3) || (s2 == s3 && s3 != s1)) {
				System.out.println("Esse tri�ngulo � do tipo IS�CELES!");
			} else if (s1 != s2 && s2 != s3) {
				System.out.println("Esse tri�ngulo � do tipo ESCALENO!");
			}
		} else {
			System.out.println();
			System.out.println("Os 3 segmentos N�O FORMAM um tri�ngulo!");
		}
		
	}

}

/*
30) [DESAFIO] Refa�a o algoritmo 25, acrescentando o recurso de mostrar que tipo de tri�ngulo ser� formado:
- EQUIL�TERO: todos os lados iguais
- IS�SCELES: dois lados iguais
- ESCALENO: todos os lados diferentes

*/