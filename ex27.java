package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex27 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0");
		
		double n1;
		double n2;
		double n3;
		double media;
		
		System.out.printf("Informe a 1ª nota: ");
		n1=entrada.nextDouble();
		System.out.printf("Informe a 2ª nota: ");
		n2=entrada.nextDouble();
		System.out.printf("Informe a 3ª nota: ");
		n3=entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println();
		System.out.println("Média: " + deci.format(media));
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO!");
		} else if (media < 7 && media >= 6) {
			System.out.println("Aluno EM RECUPERAÇÃO!");
		} else {
			System.out.println("Aluno REPROVADO!");
		}
		
	}

}

/*

27) Crie um programa que leia 3 notas de um aluno e calcule a sua média, mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO

*/