package ejarrays;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Diseñar un programa que solicite al usuario 5 números decimales y los
		// almacene en una tabla. Utiliza el mismo bucle tanto para solicitar los 5
		// números como para almacenarlos en la tabla. A continuación, en un bucle
		// distinto, mostrar por consola los números en el mismo orden en el que se han
		// introducido.

		Scanner sc = new Scanner(System.in);
		int decimal[] = new int[5];
		
		for (int i=0; i<decimal.length;i++) {
		System.out.println("Introduce 5 valores para meter sus valores en el array");
		decimal[i] = sc.nextInt();
		}
		
		System.out.print("Estos son los 5 valores [");
		for (int i=0;i<decimal.length;i++) {
		System.out.print(decimal[i] + ",");
		}
		System.out.print("]");
		
		sc.close();
	}

}
