package la�os_repeti��o;

public class TestaLacos {

	public static void main(String[] args) {

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

			for (int contador = 1; contador <= 10; contador++) {

				System.out.print(multiplicador + "x" + contador + " = " + multiplicador * contador);
				System.out.print(" ");

			} // fim for2

			System.out.println();

		} // fim for1
	}

}
