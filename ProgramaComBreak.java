package laços_repetição;

public class ProgramaComBreak {

	public static void main(String[] args) {
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				if (coluna > linha) {
					break;
				}//fim if
				System.out.print(coluna + 1);
			}//fim for coluna
			System.out.println();
		}//fim for linha
	}
}