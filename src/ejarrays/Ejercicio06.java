package ejarrays;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[8];

		System.out.println("Tienes que introducir 8 números por teclado");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			
			if (num[i] % 2 == 0) {
				System.out.println(num[i] + " es par");
			} else {
				System.out.println(num[i] + " es impar");
			}
		}

			sc.close();

	}

}
