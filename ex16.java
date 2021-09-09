package lista_execícios;

import java.util.Scanner;

public class ex16 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quant;
		int anos;
		
		System.out.printf("Informe a quantidade de cigarros fumados por dia: ");
		quant=entrada.nextInt();
		System.out.printf("Informe por quantos anos você fumou: ");
		anos=entrada.nextInt();
		
		int calA = (quant * 365); //calcula a quantidade de cigarros fumados em 1 ano
		int calT = (calA * anos); //calcula a quantidade de cigarros fumados nos anos de fumo
		int calP = (calT * 10); //calcula quanto tempo de vida perdeu a cada cigarro
		int calTotal = (calP / 24);
		
		System.out.println();
		System.out.println("Quantidade de cigarros fumados em 1 ano: " + calA);
		System.out.println("Quantidade de cigarros fumados pelo período de consumo: " + calT);
		System.out.println("Tempo de vida perdido pelo consumo de cigarro: " + calTotal + " dias!");
		
	}

}

/*

16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um fumante.
Pergunte a quantidade de cigarros fumados por dias e quantos anos ele já fumou.
Considere que um fumante perde 10 min de vida a cada cigarro.
Calcule quantos dias de vida um fumante perderá e exiba o total em dias.

*/