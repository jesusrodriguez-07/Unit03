package funcs;

public class Ejercicio01_1 {

	public static void main(String[] args) {
		int tabla[] = {1, 2, 3, 5} ;
		
		int resultado = mostrarTabla(tabla);
		
		System.out.println("La suma de los valores del array: " + resultado);

	}

	public static int mostrarTabla(int[] tabla) {

		int suma=0;
		for (int i = 0; i < tabla.length; i++) {
			suma += tabla[i];
		}
		return suma;
	}

}
