package lista_exec�cios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex34 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.00");
		
		double altura;
		double peso;
		double imc;
		
		System.out.printf("Informe sua altura: ");
		altura=entrada.nextDouble();
		System.out.printf("Informe seu peso: ");
		peso=entrada.nextDouble();
		
		imc = (peso / (altura * altura));
		
		System.out.println();
		System.out.println("Seu IMC � de: " + deci.format(imc));
		
		if (imc < 18.5) {
			System.out.println("Voc� est� ABAIXO do peso ideal!");
			System.out.println("Cuidado com a anorexia!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Voc� est� no seu PESO IDEAL!");
			System.out.println("Parab�ns!");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Voc� est� ACIMA do seu peso ideal!");
			System.out.println("Cuidado com o sobrepeso!");
		} else if (imc >= 30 && imc < 40) {
			System.out.println("Voc� est� com OBESIDADE!");
			System.out.println("Procure seu m�dico!");
		} else {
			System.out.println("Voc� est� com OBESIDADE M�RBIDA!");
			System.out.println("Procure seu m�dico URGENTEMENTE!");
		}
		
	}

}

/*

34) O �ndice de Massa Corp�rea (IMC) � um valor calculado baseado na altura e no peso de uma pessoa.
De acordo com o valor do IMC, podemos classificar o indiv�duo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade m�rbida

*/