package funcs;

import java.util.Scanner;

public class Ejercicio04_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int clave;

		System.out.println("Cual es el valor que quieres buscar: ");
		clave = sc.nextInt();

		int busqueda = buscar(t, clave);

		System.out.println("El valor esta en la posición " + busqueda);

		sc.close();
	}

	public static int buscar(int t[], int clave) {
		int busqueda = 0;
		while (busqueda < t.length && clave != t[busqueda]) {
			busqueda++;
		}

		// Si lo pones al reves es decir pones que mientras que busqueda sea mayor
		// devuelva -1 nunca va a devolver -1 y devuelve el ultimo valor de la tabla
		if (busqueda < t.length) {
			return busqueda;
		} else {
			return -1;
		}

	}

}
