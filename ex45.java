package lista_exec�cios;

import java.util.Scanner;

public class ex45 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		int nx;
		
		System.out.print("Informe o primeiro valor: ");
		n1 = entrada.nextInt();
		System.out.print("Informe o �ltimo valor: ");
		n2 = entrada.nextInt();
		System.out.print("Informe o valor de incremento: ");
		n3 = entrada.nextInt();
		System.out.println();
		
		if (n1 > n2) {
			nx = n1;
			n1 = n2;
			n2 = nx;
		} else if (n1 == n2) {
			System.out.println("Os dois valores informados s�o iguais!");
			System.out.println("Opera��o inv�lida!");
			System.out.println("Tente novamente!");
		}
		
		while (n1 <= n2) {
			System.out.print(n1 + " ");
			n1 = n1 + n3;
		}
		
		System.out.print("Acabou!");
		
	}

}

/*

45) O programa anterior vai ter um problema quando digitarmos o primeiro valor maior que o �ltimo.
Resolva esse problema com um c�digo que funcione em qualquer situa��o.

*/