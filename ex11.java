package lista_exec�cios;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int A;
		int B;
		int C;
		int D;

		System.out.printf("Informe o valor de A: ");
		A = entrada.nextInt();
		System.out.printf("Informe o valor de B: ");
		B = entrada.nextInt();
		System.out.printf("Informe o valor de C: ");
		C = entrada.nextInt();

		D = ((B * B) - 4 * (A * C));

		System.out.println();
		System.out.println("C�lculo de Delta: D = b�-4ac");
		System.out.println("D = " + B + "�" + "-4x(" + A + "x" + C + ")");
		System.out.println("D = " + D);

	}

}

/*

11) Desenvolva uma l�gica que leia os valores de A, B e C de uma equa��o do segundo grau e mostre o valor de Delta.

*/