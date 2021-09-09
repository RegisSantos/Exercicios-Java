package lista_exec�cios;

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
		System.out.println("�rea: " + deci.format(area));
		
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

28) Fa�a um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua �rea em m�.
O programa tamb�m devemostrar a classifica��o desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m� = TERRENO POPULAR
- Entre 100m� e 500m� = TERRENO MASTER
- Acima de 500m� = TERRENO VIP

*/