package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex23 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		String nome;
		char sexo;
		double preco;
		double desc;
		double precof;
		
		System.out.printf("Informe o nome do(a) cliente: ");
		nome=entrada.nextLine();
		System.out.printf("Informe o sexo do(a) cliente: ");
		sexo=entrada.next().charAt(0);
		System.out.printf("Informe o valor de compra: ");
		preco=entrada.nextDouble();
		
		if (sexo == 'F' || sexo == 'f') {
			System.out.println();
			desc = (preco * 13) / 100;
			precof = (preco - desc);
			System.out.println("Nome do cliente: " + nome);
			System.out.println("Desconto especial de 13% para mulheres no Dia das Mulheres!");
			System.out.println("Valor do produto: R$" + deci.format(preco));
			System.out.println("Valor do desconto: R$" + deci.format(desc));
			System.out.println("Valor final a pagar: R$" + deci.format(precof));
		} else if (sexo == 'M' || sexo == 'm') {
			System.out.println();
			desc = (preco * 5) / 100;
			precof = (preco - desc);
			System.out.println("Nome do cliente: " + nome);
			System.out.println("Desconto de 5% para clientes do sexo Masculino!");
			System.out.println("Valor do produto: R$" + deci.format(preco));
			System.out.println("Valor do desconto: R$" + deci.format(desc));
			System.out.println("Valor final a pagar: R$" + deci.format(precof));
		}
		
	}

}


/*

23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos para todos, mas especialmente para mulheres.
Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto

*/