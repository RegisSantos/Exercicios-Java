package la�os_repeti��o;

public class TestaFor2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("� n�mero PAR: " + i);
			} // fim if1
		} // fim for1
		
		
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("� n�mero �MPAR: " + i);
			} // fim if2
		} // fim for2
		
	}
}