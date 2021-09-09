package lista_exec�cios;

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
		
		System.out.printf("Informe a 1� nota: ");
		n1=entrada.nextDouble();
		System.out.printf("Informe a 2� nota: ");
		n2=entrada.nextDouble();
		System.out.printf("Informe a 3� nota: ");
		n3=entrada.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println();
		System.out.println("M�dia: " + deci.format(media));
		
		if (media >= 7) {
			System.out.println("Aluno APROVADO!");
		} else if (media < 7 && media >= 6) {
			System.out.println("Aluno EM RECUPERA��O!");
		} else {
			System.out.println("Aluno REPROVADO!");
		}
		
	}

}

/*

27) Crie um programa que leia 3 notas de um aluno e calcule a sua m�dia, mostrando uma mensagem no final, de acordo com a m�dia atingida:
- M�dia at� 4.9: REPROVADO
- M�dia entre 5.0 e 6.9: RECUPERA��O
- M�dia 7.0 ou superior: APROVADO

*/