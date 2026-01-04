package funcs;

//
//import java.util.Arrays;
//import java.util.Random;
//
//public class Ejercicio01_2 {

//	public static void main(String[] args) {
//		
//		Random random = new Random();
//		
//		int[][] tabla = new int[6][10];
//		
//		for (int i = 0; i < tabla.length;i++) {
//			for (int j = 0; j < tabla[0].length;j++) {
//				tabla[i][j] = random.nextInt(0, 1001); 
//			}
//		}
//		 
//		int [] maximini = new int[2];
//		
//		for (int i = 0; i < maximini.length; i++) {
//			maximini [i] = ordenar(tabla);
//		}
//		
//		for (int i = 0; i < maximini.length; i++) {
//			System.out.println(maximini);
//		}
//		
//	}
//	
//	public static int[] ordenar(int[][] tabla, int [] maximini) {
//		
//		
//		Arrays.sort(tabla);
//		
//		for (int i = 0; i < maximini.length; i++) {
//			maximini[1] = 
//		}
	
	
	import java.util.Random;

	public class Ejercicio01_2 {

	   
	    public static void main(String[] args) {

	        int[][] tabla = new int[6][10];
	        Random random = new Random();

	        // Rellenar la tabla con valores entre 0 y 1000
	        for (int i = 0; i < tabla.length; i++) {
	            for (int j = 0; j < tabla[i].length; j++) {
	                tabla[i][j] = random.nextInt(1001);
	            }
	        }

	        // Llamada a la función
	        int[] resultado = obtenerMinMax(tabla);

	        // Mostrar resultados por consola
	        System.out.println("Valor mínimo de la tabla: " + resultado[0]);
	        System.out.println("Valor máximo de la tabla: " + resultado[1]);
	    }
	    
	    
	    /**
	     * Función que recibe una tabla bidimensional y devuelve
	     * un array con el mínimo (posición 0) y el máximo (posición 1)
	     */
	    public static int[] obtenerMinMax(int[][] tabla) {

	        int min = tabla[0][0];
	        int max = tabla[0][0];

	        for (int i = 0; i < tabla.length; i++) {
	            for (int j = 0; j < tabla[0].length; j++) {
	                if (tabla[i][j] < min) {
	                    min = tabla[i][j];
	                }
	                if (tabla[i][j] > max) {
	                    max = tabla[i][j];
	                }
	            }
	        }

	        return new int[]{min, max};
	    }

	}
