package lista_exec�cios;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double dist;
		double Km;
		double Hm;
		double Dam;
		double dm;
		double cm;
		double mm;

		System.out.printf("Informe uma determinada dist�ncia (em Km): ");
		dist = entrada.nextDouble();

		Km = (dist / 1000);
		Hm = (dist / 100);
		Dam = (dist / 10);
		dm = (dist * 10);
		cm = (dist * 100);
		mm = (dist * 1000);

		System.out.println();
		System.out.println("A dist�ncia de " + dist + "m corresponde a: ");
		System.out.println(Km + "Km");
		System.out.println(Hm + "Hm");
		System.out.println(Dam + "Dam");
		System.out.println(dist + "m");
		System.out.println(dm + "dm");
		System.out.println(cm + "cm");
		System.out.println(mm + "mm");

	}

}

/*

8) Desenvolva um programa que leia uma dist�ncia em metros e mostre os valores relativos em outras medidas.
Ex: Digite uma dist�ncia em metros: 185.72
A dist�ncia de 185.72m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
185.72m
1857.2dm
18572.0cm
185720.0mm

*/