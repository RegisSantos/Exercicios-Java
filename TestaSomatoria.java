package la�os_repeti��o;

public class TestaSomatoria {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			
			//total = total + contador;
			total += contador;
			contador++;
			
		}//fim while
		System.out.println(total);
	}

}

/*

T   C
0 + 1 = 1
1 + 2 = 3
3 + 3 = 6
6 + 4 = 10
10 + 5 = 15
15 + 6 = 21
21 + 7 = 28
28 + 8 = 36
36 + 9 = 45
45 + 10 = 55

*/