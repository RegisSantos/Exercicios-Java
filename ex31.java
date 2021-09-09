package lista_execícios;

import java.util.Scanner;

public class ex31 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int escolha1;
		int escolha2;
		String jogada1;
		String jogada2;
		
		System.out.println("Vamos jogar JoKenPo (Pedra-Papel-Tesoura)");
		System.out.println("1 - Pedra / 2 - Papel / 2 - Tesoura");
		System.out.printf("JOGADOR 1 - Escolha: ");
		escolha1=entrada.nextInt();
		System.out.printf("JOGADOR 2 - Escolha: ");
		escolha2=entrada.nextInt();
		
		if (escolha1 == 1) {
			jogada1 = "Pedra";
			System.out.println();
			System.out.println("Jogador 1 escolheu: " + jogada1);
		} else if (escolha1 == 2) {
			jogada1 = "Papael";
			System.out.println();
			System.out.println("Jogador 1 escolheu: " + jogada1);
		} else if (escolha1 == 3) {
			jogada1 = "Tesoura";
			System.out.println();
			System.out.println("Jogador 1 escolheu: " + jogada1);
		} else {
			System.out.println();
			System.out.println("Jogada errada. Escolha 1, 2 ou 3");
			System.out.println("Tente novamente");
		}
		
		
		
		if (escolha2 == 1) {
			jogada2 = "Pedra";
			System.out.println("Jogador 2 escolheu: " + jogada2);
		} else if (escolha2 == 2) {
			jogada2 = "Papael";
			System.out.println("Jogador 2 escolheu: " + jogada2);
		} else if (escolha2 == 3) {
			jogada2 = "Tesoura";
			System.out.println("Jogador 2 escolheu: " + jogada2);
		} else {
			System.out.println();
			System.out.println("Jogada errada. Escolha 1, 2 ou 3");
			System.out.println("Tente novamente");
		}
		
	}
	
}

//***incompleto

/*
31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
*/