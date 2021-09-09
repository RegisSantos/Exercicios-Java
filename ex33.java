package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;


public class ex33 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double valorCasa;
		double salario;
		int parcelas;
		
		System.out.println("********SIMULAÇÃO********");
		System.out.printf("Informe o valor da casa: ");
		valorCasa=entrada.nextDouble();
		System.out.printf("Informe o valor do salário: ");
		salario=entrada.nextDouble();
		System.out.printf("Informe a quantidade de parcelas a serem pagas: ");
		parcelas=entrada.nextInt();
		
		double valorPrestacao = (valorCasa / parcelas);
		double porcentagem = (salario * 30) / 100;
		
		System.out.println();
		System.out.println("Valor da Casa: R$" + deci.format(valorCasa));
		System.out.println("Salário do comprador: R$" + deci.format(salario));
		System.out.println("Quantidade de parcelas: " + parcelas);
		System.out.println("Valor das parcelas: R$" + deci.format(valorPrestacao));
		
		if (valorPrestacao > porcentagem) {
			System.out.println();
			System.out.println("Empréstimo NEGADO!");
			System.out.println("O valor da parcela ultrapassa 30% do salário com pretendente, comprometendo a viabilidade financeira da negociação!");
		} else {
			System.out.println();
			System.out.println("Empréstimo APROVADO!");
			System.out.println("Parabéns pela aquisição!");
		}
		
	}

}

//***incompleto

/*

33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado.

*/