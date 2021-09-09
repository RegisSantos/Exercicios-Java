package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex28 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double larg;
		double comp;
		double area;
		
		System.out.printf("Informe a largura do terreno: ");
		larg=entrada.nextDouble();
		System.out.printf("Informe o comprimento do terreno: ");
		comp=entrada.nextDouble();
		
		area = (larg * comp);
		
		System.out.println();
		System.out.println("Área: " + deci.format(area));
		
		if (area < 100) {
			System.out.println("Terreno POPULAR!");
		} else if (area >= 100 && area <= 500) {
			System.out.println("Terreno MASTER!");
		} else {
			System.out.println("Terreno VIP!");
		}
		
	}

}

/*

28) Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m².
O programa também devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP

*/