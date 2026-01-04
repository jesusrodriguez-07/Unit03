package ejarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int longitud=0;
		int valor;

		System.out.println("Introduce el valor de la longitud del array y despues el valor del que lo quieres llenar");
		longitud = sc.nextInt();
		valor = sc.nextInt();

		int num[] = new int[longitud];
		
		Arrays.fill(num, valor);;
		
		System.out.println(Arrays.toString(num));
		
		sc.close();

	}

}
