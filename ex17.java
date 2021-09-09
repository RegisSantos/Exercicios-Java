package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex17 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double vel;
		double dif;
		double cal;
		
		System.out.printf("Informe a velocidade registrada do veívulo: ");
		vel=entrada.nextDouble();
		
		if (vel > 80) {
			dif = (vel - 80);
			cal = (dif * 5);
			System.out.println();
			System.out.println("Veículo acima da velocidade permitida, ultrapassando " + dif + "Km/h.");
			System.out.println("Multa no valor de: R$" + deci.format(cal));
		} else {
			System.out.println();
			System.out.println("Veículo dentro do limite de velocidade!");
			System.out.println("Não se aplica multa!");
		}
		
	}

}

/*

17) Escreva um programa que pergunte a velocidade de um carro.
Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado.
Nesse caso, exiba o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.

*/