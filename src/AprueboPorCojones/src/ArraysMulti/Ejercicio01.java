package ArraysMulti;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas de la tabla");
		int filas = sc.nextInt();
		System.out.println("Ahora introduce el número de columnas");
		int columnas = sc.nextInt();
		
		int tabla [][] = rellenarTabla(filas,columnas);
		
	
		imprimirTabla(tabla);
		sc.close();
	}

	public static int[][] rellenarTabla (int filas, int columnas){
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int tabla[][] = new int [filas][columnas];
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				tabla[i][j] = random.nextInt(0,100);
			}
		}
		sc.close();
	return tabla;
	}
	
	public static void imprimirTabla (int [][] tabla) {
		for (int i=0; i < tabla.length;i++) {
			for ( int j=0; j < tabla[0].length; j++) {
				if (j == tabla[i].length-1) {
					System.out.print(tabla[i][j]);
				} else {
					System.out.print(tabla[i][j] + ", ");
				}
				
			}
			System.out.println();
		}
	}
}

