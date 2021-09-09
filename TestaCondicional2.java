package condicional;

public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais: ");

		int idade = 16;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;
		
		System.out.println("Valor acompanhado: " + acompanhado);

		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos. Pode entrar");
		} else if (idade < 18 && acompanhado) {
			System.out.println("Você é menor de idade, mas pode entrar, pois está acompanhado.");
		} else {
			System.out.println("Você não pode entrar, pois é menor de idade e está desacompanhado.");
		}

	}

}
