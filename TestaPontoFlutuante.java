public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		double salario;
		salario = 1250.70;
		
		System.out.println("Salário: R$" + salario);
		
		int n1 = 10;
		int n2 = 5;
		
		int soma = n1 + n2;
		int sub = n1 - n2;
		int mult = n1 * n2;
		double Pi = 3.14;
		int divisor = 2;
		double div = n1 / n2;
		double divPi = Pi / divisor;
		
		System.out.println();
		System.out.println(n1 + " + " + n2 + " = " + soma + " - Soma");
		System.out.println(n1 + " - " + n2 + " = " + sub + " - Subtração");
		System.out.println(n1 + " x " + n2 + " = " +  mult + " - Multiplicação");
		System.out.println(n1 + " / " + n2 + " = " + div + " - Divisão");
		System.out.println(Pi + " / " + divisor + " = " + divPi + " - Divisão do Pi");
		
		int outraDivisao = 5 / 2;
		
		System.out.println();
		System.out.println("Resultado Inteiro: " + outraDivisao);
		
		double novaTentativa = 5.0 / 2;
		
		System.out.println();
		System.out.println("Resultado Real: " + novaTentativa);
		
	}

}
