package la�os_repeti��o;

public class TestaLacos2 {

	public static void main(String[] args) {
		for (int linha = 0; linha < 10; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("*");
			} // fim for2	
			System.out.println();
		} // fim for1
	}

}
