package condicional;

public class TesteEscopo {
	
	public static void main(String[] args) {

		System.out.println("Testando condicionais: ");

		int idade = 16;
		int quantidadePessoas = 2;
		
		//boolean acompanhado = quantidadePessoas >= 2;
		boolean acompanhado; 
		
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("Valor acompanhado: " + acompanhado);

		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos. Pode entrar");
		} else if (idade < 18 && acompanhado) {
			System.out.println("Voc� � menor de idade, mas pode entrar, pois est� acompanhado.");
		} else {
			System.out.println("Voc� n�o pode entrar, pois � menor de idade e est� desacompanhado.");
		}

	}

}