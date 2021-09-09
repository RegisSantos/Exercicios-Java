package lista_execícios;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;
		int ant;
		int suc;

		System.out.printf("Informe um número: ");
		n = entrada.nextInt();

		ant = (n - 1);
		suc = (n + 1);

		System.out.println();
		System.out.println("Número digitado: " + n);
		System.out.println("Antecessor: " + ant);
		System.out.println("Sucessor: " + suc);

	}

}

/*

6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
Ex: Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
 
 */