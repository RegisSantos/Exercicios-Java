package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex35 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double km;
		double calDia;
		double calKm;
		double calTotal;
		int dias;
		int tipo;
		
		System.out.print("Informe o tipo de carro alugado (1 - Popular / 2 - Luxo): ");
		tipo=entrada.nextInt();
		System.out.print("Informe a quantidade de Km percorridos com o carro: ");
		km=entrada.nextDouble();
		System.out.print("Informe a quantidade dias de utilização do carro: ");
		dias=entrada.nextInt();
		
		if (tipo == 1) {
			calDia = (90 * dias);
			if (km <= 100) {
				calKm = (km * 0.20);
			} else {
				calKm = (km * 0.10);
			}
			
			calTotal = (calDia + calKm);
			
			System.out.println();
			System.out.println("Tipo de carro: POPULAR.");
			System.out.println("Quilômetros percorridos: " + deci.format(km) + "km.");
			System.out.println("Dias de uso: " + dias + " dia(s).");
			System.out.println("Preço a pagar pela quilomentragem: R$" + deci.format(calKm));
			System.out.println("Preço a pagar pelos dias de uso: R$" + deci.format(calDia));
			System.out.println("Valor total a pagar: R$" + deci.format(calTotal));
			
		} else if (tipo == 2) {
			calDia = (150 * dias);
			if (km <= 200) {
				calKm = (km * 0.30);
			} else {
				calKm = (km * 0.25);
			}
			
			calTotal = (calDia + calKm);
			
			System.out.println();
			System.out.println("Tipo de carro: LUXO.");
			System.out.println("Quilômetros percorridos: " + deci.format(km) + "km.");
			System.out.println("Dias de uso: " + dias + " dia(s).");
			System.out.println("Preço a pagar pela quilomentragem: R$" + deci.format(calKm));
			System.out.println("Preço a pagar pelos dias de uso: R$" + deci.format(calDia));
			System.out.println("Valor total a pagar: R$" + deci.format(calTotal));
			
		} else {
			System.out.println();
			System.out.println("Você indicou o número errado para indicar o tipo de carro!");
			System.out.println("Informe 1 p/ carro POPULAR ou 2 p/ CARRO DE LUXO): ");
			System.out.println("Tente Novamente! ");
			
		}
		
	}

}

/*

35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços.
O aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para carro de luxo.
Além disso, o cliente paga por Km percorrido.
Faça um programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e quantos Km foram percorridos.

No final mostre o preço a ser pago de acordo com a tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km

- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km

*/