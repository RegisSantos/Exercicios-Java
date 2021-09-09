package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");

		String nome;
		double salA;
		double salR;
		double cal;
		char gen;
		int anos;

		System.out.print("Informe o nome do(a) colaborador(a): ");
		nome = entrada.nextLine();
		System.out.print("Informe o g�nero de " + nome + " (M/F) : ");
		gen = entrada.next().charAt(0);
		System.out.print("Informe o sal�rio atual de " + nome + ": ");
		salA = entrada.nextDouble();
		System.out.print("Informe h� quantos anos " + nome + " trabalha na empresa: ");
		anos = entrada.nextInt();

		if (gen == 'F' || gen == 'f') {
			if (anos < 15) {
				cal = (salA * 5) / 100;
				salR = (salA + cal);
				System.out.println();
				System.out.println("Porcentagem de reajuste: 5%");
				System.out.println("Valor do reajuste: R$" + deci.format(cal));
				System.out.println("Valor do sal�rio reajustado: R$" + deci.format(salR));
			} else if (anos >= 15 && anos < 20) {
				cal = (salA * 12) / 100;
				salR = (salA + cal);
				System.out.println();
				System.out.println("Porcentagem de reajuste: 12%");
				System.out.println("Valor do reajuste: R$" + deci.format(cal));
				System.out.println("Valor do sal�rio reajustado: R$" + deci.format(salR));
			} else {
				cal = (salA * 23) / 100;
				salR = (salA + cal);
				System.out.println();
				System.out.println("Porcentagem de reajuste: 23%");
				System.out.println("Valor do reajuste: R$" + deci.format(cal));
				System.out.println("Valor do sal�rio reajustado: R$" + deci.format(salR));
			}
		} else if (gen == 'M' || gen == 'm') {
			if (anos < 20) {
				cal = (salA * 3) / 100;
				salR = (salA + cal);
				System.out.println();
				System.out.println("Porcentagem de reajuste: 3%");
				System.out.println("Valor do reajuste: R$" + deci.format(cal));
				System.out.println("Valor do sal�rio reajustado: R$" + deci.format(salR));
			} else if (anos >= 20 && anos < 30) {
				cal = (salA * 13) / 100;
				salR = (salA + cal);
				System.out.println();
				System.out.println("Porcentagem de reajuste: 13%");
				System.out.println("Valor do reajuste: R$" + deci.format(cal));
				System.out.println("Valor do sal�rio reajustado: R$" + deci.format(salR));
			} else {
				cal = (salA * 25) / 100;
				salR = (salA + cal);
				System.out.println();
				System.out.println("Porcentagem de reajuste: 25%");
				System.out.println("Valor do reajuste: R$" + deci.format(cal));
				System.out.println("Valor do sal�rio reajustado: R$" + deci.format(salR));
			}
		} else {
			System.out.println();
			System.out.println("Voc� n�o informou o g�nero corretamente!");
			System.out.println("Tente novamente!");
		}
	}
}

/*

37) Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um aumento de acordo com alguns fatores.
Fa�a um programa que leia o sal�rio atual, o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na empresa.
No final, mostre o seu novo sal�rio, baseado na tabela a seguir:

- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 at� 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%

- Homens
- menos de 20 anos de empresa: +3%
- de 20 at� 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%

*/