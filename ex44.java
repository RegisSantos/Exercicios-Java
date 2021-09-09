package lista_execícios;

import java.util.Scanner;

public class ex44 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
		
		System.out.print("Digite o primeiro valor: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o último valor: ");
		n2 = entrada.nextInt();
		System.out.print("Digite o valor do incremento: ");
		n3 = entrada.nextInt();
		
		while (n1 <= n2) {
			System.out.print(n1 + " ");
			n1 = n1 + n3;
		}
		
		System.out.print("Acabou!");
		
	}

}

/*

44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!

*/