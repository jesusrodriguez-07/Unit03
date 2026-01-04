package ejarrays;

import java.util.Scanner;

public class Ejercicio03_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int filas=0;
		int columnas=0;
		
		System.out.println("Introduce el valor de las filas que  quieres en el array");
		filas = sc.nextInt();
		
		System.out.println("Introduce el valor de las columnas que quieres");
		columnas = sc.nextInt();
		
		int array[][] = new int [filas][columnas];
		
		for (int i = 0; i < array.length;i++) {
			for (int j = 0; j < array[0].length;j++) {
				array[i][j] = 10*i+j;
			}
		}
		
		for (int i = 0; i < array.length;i++) {
			for ( int j = 0 ; j < array[0].length;j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
