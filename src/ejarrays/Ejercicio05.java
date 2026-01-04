package ejarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[10];
		int sumaTotal = 0;
		int maxnum = 0;
		int minnum = 0;

		System.out.println("Introduce 10 números por teclado");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			sumaTotal += num[i];
			System.out.println("Este es el valor del número: " + (i + 1) + ":" + num[i]);
		}

		Arrays.sort(num);
		maxnum = num[num.length-1];
		minnum = num[0];

		System.out.println("Este es la suma total de los valores: " + sumaTotal);
		System.out.println("Este es el valor más grande de la tabla: " + maxnum);
		System.out.println("Este es el valor más pequeño de la tabla: " + minnum);

		sc.close();

	}

}
