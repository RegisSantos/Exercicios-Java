package lista_exec�cios;

public class ex43 {
	public static void main(String[] args) {
		
		int n = 30;
		
		while (n >= 1) {
			if (n%4 != 0) {
				System.out.print(n + " ");
			} else if (n%4 == 0) {
				System.out.print("[" + n + "]" + " ");
			}
			n--;
		}
	}

}

/*

43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 at� 1, marcando os n�meros que forem divis�veis por 4,
exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...

*/
