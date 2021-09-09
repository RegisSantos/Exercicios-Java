public class Fatorial {

	public static void main(String[] args) {

		int n = 1;
		int f = 1;

		while (n <= 10) {

			f *= n;
			System.out.println("O fatorial de " + n + " é: " + f);
			n++;

		} // fim while
	}
}