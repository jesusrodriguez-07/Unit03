package modelosdeexamen;

import java.util.Arrays;


public class ApuntesaArrays {

	public static void main(String[] args) {
		// 1. Creacion e inicializacion
		
		// Forma 1: Sabes el TAMAÑO, pero aún no los datos.
		// Crea un array de 5 huecos. Por defecto, Java los llena de ceros (0).
		int[] numerosVacios = new int[5]; 
		
		// Forma 2: Sabes los DATOS desde el principio.
		// Java cuenta cuántos elementos hay y le asigna el tamaño automáticamente (aquí, tamaño 4).
		String[] nombres = {"Ana", "Juan", "Pedro", "Lucía"};
		
		// 2. Acceso y modificacion 
		
		int[] puntuaciones = {85, 90, 78, 100};

		// 1. LEER un dato: Usamos los corchetes [ ] con el índice dentro.
		int notaJuan = puntuaciones[1]; // Resultado: 90 (es el segundo elemento)
		
		// 2. MODIFICAR un dato: Accedemos a la posición y le asignamos un nuevo valor con '='.
		puntuaciones[2] = 80; // Cambiamos el 78 por un 80.

		// ¡CUIDADO! Si intentas acceder a puntuaciones[4], el programa explotará
		// con un error llamado "ArrayIndexOutOfBoundsException" porque solo llega hasta el 3.
		
		// 3. Length
		
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};

		// Nos dice el tamaño total del array.
		int cantidad = vocales.length; // Resultado: 5

		// El uso más común en la historia de Java: recorrer un array entero
		for (int i = 0; i < vocales.length; i++) {
		    System.out.println("Vocal: " + vocales[i]);
		}
		
		// 4. Java.util.arrays
		
		// ... dentro de tu main ...
		int[] desordenados = {5, 2, 8, 1, 9};

		// 4.1. IMPRIMIR (toString): Si haces System.out.println(desordenados) te saldrá 
		// basura de memoria tipo "[I@7a81197d". Para verlo bien, usa esto:
		String textoArray = Arrays.toString(desordenados); 
		// Resultado por consola: "[5, 2, 8, 1, 9]"

		// 4.2. ORDENAR (sort): Ordena los números de menor a mayor (o alfabéticamente).
		Arrays.sort(desordenados); 
		// Ahora el array es: {1, 2, 5, 8, 9}

		// 4.3. COMPARAR (equals): Como pasaba con los Strings, no uses '=='.
		int[] arrayA = {1, 2, 3};
		int[] arrayB = {1, 2, 3};
		boolean sonIguales = Arrays.equals(arrayA, arrayB); // Resultado: true

		// 4.4. COPIAR Y RECORTAR (copyOf): ¡Esto te habría salvado en el examen!
		// Crea un nuevo array copiando los datos del viejo, pero con el tamaño nuevo que le digas.
		int[] original = {10, 20, 30};
		int[] masGrande = Arrays.copyOf(original, 5); // Resultado: {10, 20, 30, 0, 0}
		
		// 5. Arrays de dos dimensiones Matrices
		
		// Se usan dos corchetes [filas][columnas].
		// Aquí creamos una matriz de 3 filas y 2 columnas.
		int[][] tablero = new int[3][2];

		// Para acceder o modificar, necesitas dar las dos coordenadas.
		tablero[0][0] = 5; // Fila 0, columna 0
		tablero[2][1] = 9; // Fila 2 (la última), columna 1 (la última)

		
		
		
		// Para que no salgan errores de variables sin usar
		System.out.println(numerosVacios);
		System.out.println(nombres);
		System.out.println(puntuaciones);
		System.out.println(notaJuan);
		System.out.println(cantidad);
		System.out.println(textoArray);
		System.out.println(sonIguales);
		System.out.println(masGrande);


	}

}
