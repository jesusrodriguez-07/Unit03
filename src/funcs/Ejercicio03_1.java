package funcs;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int longitud = 0;
		int pares[] = new int [longitud];
		int fin = 0;
		int numrandom;
		
		System.out.println("Introduce el número de valores que quieres: ");
		longitud = sc.nextInt();
		
		System.out.println("Introduce desde 2 hasta que número quieres que sean los valores: ");
		fin = sc.nextInt();
		
		numrandom = random.nextInt(2, fin);
				
		if (numrandom % 2 == 0) {
			numrandom = numrandom + 1;
		}
		
		for (int i=0; i<pares.length;i++) {
			pares[i] = numrandom;
		}
		
		for (int i=0; i<pares.length;i++) {
			System.out.println("Este es el valor" + i+1 + "de la tabla: " + pares[i]);
		}

		sc.close();
	}
	
//	public static int[] rellenaPares (int longitud, int fin) {
		
		
		
		
//	}
	
}
