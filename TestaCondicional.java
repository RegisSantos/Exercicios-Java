package condicional;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais: ");

		int idade = 17;
		int quantidade = 2;

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos. Pode entrar");
		} else if ((idade < 18) && (quantidade >= 2)) {
			System.out.println("Voc� � menor de idade, mas pode entrar pois est� acompanhado.");
		} else {
			System.out.println("Voc� n�o pode entrar, pois � menor de idade e est� desacompanhado.");
		}

	}

}
