package modelosdeexamen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		String[] mensajes = { "LA NIEBLA CUBRE EL PUENTE", "NO MIRES DETRAS DE LA PUERTA",
				"EL RELOJ SUENA A MEDIANOCHE", "LAS SOMBRAS SABEN TU NOMBRE", "TODO MENSAJE DEJA UNA HUELLA",
				"EL ECO REPITE LA VERDAD", "ALGUIEN ESCONDE ALGO AQUI", "NUNCA APAGUES LA RADIO" };

		do {
			System.out.println("1. Mostrar mensajes");
			System.out.println("2. Contar letra en un mensaje");
			System.out.println("3. Extraer mensaje oculto");
			System.out.println("4. Buscar palabra en todos los mensajes");
			System.out.println("5. Marcar mensaje como alterado");
			System.out.println("6. Mostrar palabra mas larga de un mensaje");
			System.out.println("7. Mostrar estadisticas generales");
			System.out.println("8. Salir");
			System.out.println("Elige una opción");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				mostrarMensajes(mensajes);
				break;

			case 2:
				System.out.println("Dime el indice del mensaje");
				int ind2 = sc.nextInt();
				if (esIndiceValido(mensajes, ind2)) {
					System.out.println("Dime la letra a contar ");
					char let = sc.next().charAt(0);
					int cant = contarLetra(mensajes[ind2], let);
                    System.out.println("La letra '" + let + "' aparece " + cant + " veces.");
                } else {
                    System.out.println("Índice no válido.");
				}
				break;
				
			case 3:
				System.out.println("Dime el indice del mensaje");
				int ind3 = sc.nextInt();
				if (esIndiceValido(mensajes, ind3) ) {
					System.out.println("Mensaje oculto: " + extraerMensajeOculto(quitarEspacios(mensajes[ind3])));
				} else {
					System.out.println("Indice no valido");
				}	
				break;
			
			case 4:
				System.out.println("Dime que palabra quieres buscar");
				String palabra = sc.nextLine();
				int vecesEncontradas = buscarMensajesConPalabra(mensajes, palabra);
				System.out.println("La palabra " + palabra + " se ha encontrado " + vecesEncontradas + " veces.");
				break;
				
			case 5:
				System.out.println("Dime el indice del mensaje que quieres alterar");
				int ind5 = sc.nextInt();
				if (marcarAlterado(mensajes, ind5)) {
					System.out.println("Mensaje alterado con exito " + mensajes[ind5]);
				} else {
					System.out.println("Mensaje invalido o ya alterado");
				};
				break;
				
			case 6:
				System.out.println("Dime el indice del mensaje a buscar palabra mas larga");
				int ind6 = sc.nextInt();
				
				if (esIndiceValido(mensajes, ind6)) {
					System.out.println("La palabra mas larga del mensaje es: " + palabraMasLarga(mensajes[ind6]));
				} else {
					System.out.println("indice no valido");
				};
				break;
				
			case 7:
				mostrarEstadisticas(mensajes);
				break;
				
			case 8:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opcion incorrecta");
			}

		} while (opcion != 8);

		sc.close();
	}

	static void mostrarMensajes(String[] mensajes) {
		for (int i = 0; i < mensajes.length; i++) {
			System.out.println("Posición " + i + "." + mensajes[i]);
		}
	}

	static boolean esIndiceValido(String[] mensajes, int indice) {
		if (indice < mensajes.length && indice >= 0) {
			return true;
		} else {
			return false;
		}
	}

	static int contarLetra(String mensaje, char letra) {
		int contador = 0;
		String minusc = mensaje.toLowerCase();
		char letraMinusc = Character.toLowerCase(letra);

		for (int i = 0; i < minusc.length(); i++) {
			if (minusc.charAt(i) == (letraMinusc)) {
				contador++;
			}
		}
		return contador;

	}

	static String quitarEspacios(String mensaje) {
		String sinespacio = mensaje.replace(" ", "");
		return sinespacio;
	}

	static String extraerMensajeOculto(String mensajeSinEspacio) {
		String pares = "";

		for (int i = 0; i < mensajeSinEspacio.length(); i++) {
			if (i % 2 == 0) {
				pares += mensajeSinEspacio.charAt(i);
			}
		}
		return pares;

	}

	static int buscarMensajesConPalabra(String[] mensajes, String palabra) {
		String palabraMinusc = palabra.toLowerCase();
		int contador = 0;

		for (int i = 0; i < mensajes.length; i++) {
			String mensajeLimpio = mensajes[i].toLowerCase();
			if (mensajeLimpio.contains(palabraMinusc)) {
				contador++;
			}
			;
		}
		return contador;

	}

	static boolean marcarAlterado(String[] mensajes, int indice) {
		if (esIndiceValido(mensajes, indice) == false) {
			return false;
		} else {
			if (!mensajes[indice].startsWith("[ALTERADO]")) {
				mensajes[indice] = "[ALTERADO]" + mensajes[indice];
				return true;
			} else {
				return false;
			}
		}
	}

	static String palabraMasLarga(String mensaje) {
		String[] listaDePalabras = mensaje.split(" ");
		String palabraMasLarga = "";

		for (int i = 0; i < listaDePalabras.length; i++) {
			if (listaDePalabras[i].length() > palabraMasLarga.length()) {
				palabraMasLarga = listaDePalabras[i];
			}
			;
		}
		return palabraMasLarga;
	}

	static void mostrarEstadisticas(String[] mensajes) {
		int totalMensajes = mensajes.length;
		int totalAlterados = 0;
		String mensajeMasLargo = "";
		int letraA = 0;
		
		for ( int i = 0; i < mensajes.length; i++) {
			if (mensajes[i].startsWith("[ALTERADO]")) {
				totalAlterados++;
			}
			if (mensajes[i].length() > mensajeMasLargo.length()) {
				mensajeMasLargo = mensajes[i];
			}
			letraA += contarLetra(mensajes[i], 'a');
		}
		
		
		System.out.println(totalMensajes);
		System.out.println(totalAlterados);
		System.out.println(mensajeMasLargo);
		System.out.println(letraA);
	}

}
