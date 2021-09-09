public class TesteIR {

	public static void main(String[] args) {

		double salario = 4200.0;

		System.out.println("Dedução do Imposto de Renda:");
		System.out.println("Salário: " + salario);

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println();
			System.out.println("Alíquota do IR: 7.5%");
			System.out.println("Pode deduzir na declaração o valor de: R$ 142.00");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println();
			System.out.println("Alíquota do IR: 15%");
			System.out.println("Pode deduzir na declaração o valor de R$ 350.00");
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println();
			System.out.println("Alíquota do IR: 22.5%");
			System.out.println("Pode deduzir na declaração o valor de R$ 636.00");
		}
	}
}

/*
 * Salário: R$3.300;
 */