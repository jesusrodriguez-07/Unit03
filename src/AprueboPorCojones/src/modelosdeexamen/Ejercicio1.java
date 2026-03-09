package modelosdeexamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un texto largo");
		String textoLargo = sc.nextLine();
		System.out.println("Introduce un texto oculto a buscar en el texto anterior");
		String textoOculto = sc.nextLine();

		// Limpiar cadena sirve para poner el texto largo formateado en minusculas
		// ademas de quitar cualquier espacio
		String cadenaLimpia = limpiarCadena(textoLargo);
		String ocultoLimpio = limpiarCadena(textoOculto);

		// Convierte las cadenas formateadas ya en arrays listos para buscar indices
		char[] cadenaArray = cadenaArray(cadenaLimpia);
		char[] ocultoArray = cadenaArray(ocultoLimpio);

		int[] posiciones = buscarCadena(cadenaArray, ocultoArray);
		
		System.out.println("Resultados");
		System.out.println("El mensaje aparece " + posiciones.length + " veces");

		if (posiciones.length > 0) {
			for (int i = 0; i < posiciones.length; i++) {
				System.out.print(posiciones[i] + " ");
			}
			System.out.println();
		} else {
			System.out.println("No se ha encontrado el mensaje oculto");
		}

		double porcentaje = calcularPorcentaje(posiciones, cadenaArray, ocultoArray);

		// Usamos printf para mostrarlo bonito con 2 decimales
		System.out.printf("Porcentaje de letras utilizadas: %.2f%%\n", porcentaje);

		sc.close();
	}

	/**
	 * 
	 * @param textoLargo
	 * @return
	 */
	public static String limpiarCadena(String textoLargo) {

		String minusc = textoLargo.toLowerCase();
		String cadenaLimpia = minusc.replace(" ", "");

		return cadenaLimpia;
	}

	/**
	 * 
	 * @param cadenaLimpia
	 * @return
	 */
	public static char[] cadenaArray(String cadenaLimpia) {
		char[] arrayCadena = new char[cadenaLimpia.length()];

		for (int i = 0; i < arrayCadena.length; i++) {
			arrayCadena[i] = cadenaLimpia.charAt(i);
		}

		return arrayCadena;
	}

	/**
	 * 
	 * @param textoLargo
	 * @param textoOculto
	 * @return
	 */
	public static int[] buscarCadena(char[] textoLargo, char[] textoOculto) {
		int palabrasEncontradas = 0;

		int[] Posiciones = new int[textoLargo.length];

		for (int i = 0; i < textoLargo.length; i++) {

			if (textoLargo[i] == textoOculto[0]) {

				if (textoOculto.length == 1) {
					Posiciones[palabrasEncontradas] = i;
					palabrasEncontradas++;
					continue; 
				}

				int letrasCoincidentes = 1;

				for (int j = i + 1; j < textoLargo.length; j++) {

					if (textoLargo[j] == textoOculto[letrasCoincidentes]) {
						letrasCoincidentes++; 
					}

					if (letrasCoincidentes == textoOculto.length) {
						Posiciones[palabrasEncontradas] = i; 
						palabrasEncontradas++; 
						break;
					}
				}
			}
		}

		int[] resultadoDefinitivo = new int[palabrasEncontradas];
		for (int k = 0; k < palabrasEncontradas; k++) {
			resultadoDefinitivo[k] = Posiciones[k];
		}

		return resultadoDefinitivo;
	}

	public static double calcularPorcentaje(int[] posiciones, char[] textoLargo, char[] textoOculto) {
		// 1. Calculamos cuántas letras se han usado en total
		int letrasUsadas = posiciones.length * textoOculto.length;
		int letrasTotales = textoLargo.length;

		// 2. Protegemos por si el texto estuviera vacío (evita dividir por cero)
		if (letrasTotales == 0) {
			return 0.0;
		}

		// 3. Calculamos el porcentaje casteando a (double) para no perder decimales
		double porcentaje = ((double) letrasUsadas / letrasTotales) * 100;

		return porcentaje;
	}
}
