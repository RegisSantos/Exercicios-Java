package lista_exec�cios;

import java.util.Scanner;

public class ex42 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n;
		int x = 1;
		
		System.out.print("Informe um n�mero inteiro e positivo: ");
		n = entrada.nextInt();
		
		while (x <= n) {
			System.out.print(x + " ");
			x++;
		}
		
		System.out.println();
		System.out.println("Acabou!");
	}

}

/*

42) Fa�a um algoritmo que pergunte ao usu�rio um n�mero inteiro e positivo qualquer e mostre uma contagem at� esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

*/