package condicional;

public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Testando condicionais: ");

		int idade = 17;
		int quantidade = 2;

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos. Pode entrar");
		} else if ((idade < 18) && (quantidade >= 2)) {
			System.out.println("Você é menor de idade, mas pode entrar pois está acompanhado.");
		} else {
			System.out.println("Você não pode entrar, pois é menor de idade e está desacompanhado.");
		}

	}

}
