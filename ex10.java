package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");

		double h;
		double l;
		double area;
		double quant;

		System.out.printf("Informe a altura da parede: ");
		h = entrada.nextDouble();
		System.out.printf("Informe a largura da parede: ");
		l = entrada.nextDouble();

		area = (h * l);
		quant = (area / 2);

		System.out.println();
		System.out.println("Área a ser pintada: " + deci.format(area) + "m²");
		System.out.println("Quantidade de tinta necessária: " + deci.format(quant) + "L");

	}

}

/*

10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e mostre a área a ser pintada e a quantidade de tinta necessária
para o serviço, sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

*/