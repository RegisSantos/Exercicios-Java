package laços_repetição;

public class TesteWhile2 {

	public static void main(String[] args) {

		int n = 1;

		while (n <= 10) {

			while (n % 2 == 1) {
				System.out.println(n);
				n++;
			} // fim while2
			n++;

		} // fim while1

	}

}
