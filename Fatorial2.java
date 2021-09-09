public class Fatorial2 {

	public static void main(String[] args) {
		
		int f = 1;

		for (int i = 1; i <= 10; i++) {

			f *= i;
			System.out.println("A fatoração de " + i + " é: " + f);

		} // fim for
	}
}
