package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ex33 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double valorCasa;
		double salario;
		int parcelas;
		
		System.out.println("********SIMULA��O********");
		System.out.printf("Informe o valor da casa: ");
		valorCasa=entrada.nextDouble();
		System.out.printf("Informe o valor do sal�rio: ");
		salario=entrada.nextDouble();
		System.out.printf("Informe a quantidade de parcelas a serem pagas: ");
		parcelas=entrada.nextInt();
		
		double valorPrestacao = (valorCasa / parcelas);
		double porcentagem = (salario * 30) / 100;
		
		System.out.println();
		System.out.println("Valor da Casa: R$" + deci.format(valorCasa));
		System.out.println("Sal�rio do comprador: R$" + deci.format(salario));
		System.out.println("Quantidade de parcelas: " + parcelas);
		System.out.println("Valor das parcelas: R$" + deci.format(valorPrestacao));
		
		if (valorPrestacao > porcentagem) {
			System.out.println();
			System.out.println("Empr�stimo NEGADO!");
			System.out.println("O valor da parcela ultrapassa 30% do sal�rio com pretendente, comprometendo a viabilidade financeira da negocia��o!");
		} else {
			System.out.println();
			System.out.println("Empr�stimo APROVADO!");
			System.out.println("Parab�ns pela aquisi��o!");
		}
		
	}

}

//***incompleto

/*

33) Escreva um programa para aprovar ou n�o o empr�stimo banc�rio para a compra de uma casa.
O programa vai perguntar o valor da casa, o sal�rio do comprador e em quantos anos ele vai pagar.
Calcule o valor da presta��o mensal, sabendo que ela n�o pode exceder 30% do sal�rio ou ent�o o empr�stimo ser� negado.

*/