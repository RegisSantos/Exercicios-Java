package lista_execícios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex36 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double horas;
		double cal;
		int pontos;
		
		System.out.print("Informe a quantidade de horas de atividades físicas no mês: ");
		horas=entrada.nextDouble();
		
		if (horas < 10) {
			pontos = 2;
		} else if (horas >= 10 && horas < 20) {
			pontos = 5;
		} else {
			pontos = 10;
		}
		
		cal = (pontos * 0.05);
		
		System.out.println();
		System.out.println("Quantidade de horas: " + deci.format(horas));
		System.out.println("Quantidade de pontos: " + pontos);
		System.out.println("Valor por pontos: R$0.05");
		System.out.println("Valor total a receber: " + deci.format(cal));
		
	}

}


/*

36) Um programa de vida saudável quer dar pontos atividades físicas que podem ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)

*/