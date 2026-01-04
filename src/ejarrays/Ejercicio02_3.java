package ejarrays;

public class Ejercicio02_3 {

	public static void main(String[] args) {

		int[][] matriz = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] traspuesta = trasponer(matriz);

		System.out.println("Original: ");
		imprimirMatriz(matriz);
		
		
		System.out.println("Traspuesta: ");
		imprimirMatriz(traspuesta);
		
	}
	
	
	/**
	 * Función que traspone una matriz rectangular
	 * @param matriz array bidimensional
	 * @return array bidimensional que es la matriz traspuesta de la original
	 */
	
	public static int[][] trasponer(int[][] matriz) {
		if (matriz == null) {
			throw new IllegalArgumentException("La matriz no puede ser null.");
		}
		if (matriz.length == 0 || matriz[0] == null) {
			throw new IllegalArgumentException("La matriz tiene que tener al menos una fila.");
		}
		
		int filas = matriz.length;
		int columnas = matriz[0].length;
		
		for (int indiceFila = 0; indiceFila < filas;indiceFila++) {
			if (matriz[indiceFila] == null || matriz[indiceFila].length != columnas) {
				throw new IllegalArgumentException("Columnas de mierda");
			}
		}
		
		int[][] resultado = new int[columnas][filas];
		
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				resultado[columna][fila] = matriz[fila][columna];
			}
		}
		
		return resultado;
	}

	/**
	 * Imprime una matriz por pantalla 
	 * @param matriz array bidimensional
	 */
	public static void imprimirMatriz(int[][] matriz) {
		
		for (int fila=0;fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length;columna++) {
				System.out.print(matriz[fila][columna] + "\t");
			}
			System.out.println();
		}
	}
	
}