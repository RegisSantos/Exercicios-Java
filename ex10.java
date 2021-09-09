package lista_exec�cios;

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
		System.out.println("�rea a ser pintada: " + deci.format(area) + "m�");
		System.out.println("Quantidade de tinta necess�ria: " + deci.format(quant) + "L");

	}

}

/*

10) Fa�a um algoritmo que leia a largura e altura de uma parede, calcule e mostre a �rea a ser pintada e a quantidade de tinta necess�ria
para o servi�o, sabendo que cada litro de tinta pinta uma �rea de 2 metros quadrados.

*/