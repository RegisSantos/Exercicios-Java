package lista_exec�cios;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int n;
		int ant;
		int suc;

		System.out.printf("Informe um n�mero: ");
		n = entrada.nextInt();

		ant = (n - 1);
		suc = (n + 1);

		System.out.println();
		System.out.println("N�mero digitado: " + n);
		System.out.println("Antecessor: " + ant);
		System.out.println("Sucessor: " + suc);

	}

}

/*

6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu sucessor.
Ex: Digite um n�mero: 9
O antecessor de 9 � 8
O sucessor de 9 � 10
 
 */