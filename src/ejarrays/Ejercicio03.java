package ejarrays;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Escribe un programa que lea 10 números por teclado, los almacene en una
		// tabla, y que luego los muestre en orden inverso, es decir, el primero que se
		// introduce es el último en mostrarse.
		
		Scanner sc = new Scanner(System.in);
		
		int reversa[] = new int[10];
		
		for (int i=0;i<reversa.length;i++) {
			System.out.println("Introduce 10 valores que se mostraran al reves: " + i + "º valor: ");
			reversa[i] = sc.nextInt();
		}
		
		System.out.print("Estos son los valores al reves: [");
		for (int i=reversa.length - 1;i>=0;i--) {
			System.out.print(reversa[i] + ",");
		}
		System.out.print("]");
		
		
		sc.close();

	}

}
