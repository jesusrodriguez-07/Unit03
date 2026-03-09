package modelosdeexamen;

public class ApuntesString {
	
	public static void main (String[] args) {
		// 1. Creacion e informacion basica
		String texto = "Hola Mundo Java";

		// 1.1 length(): Devuelve la cantidad total de caracteres (incluyendo espacios).
		int tamaño = texto.length(); // Resultado: 15

		// 1.2. charAt(indice): Saca una letra exacta en la posición que le digas (empieza en 0).
		char letra = texto.charAt(0); // Resultado: 'H'

		// 1.3. isEmpty(): Comprueba si el texto no tiene NADA (longitud 0).
		boolean vacio = texto.isEmpty(); // Resultado: false

		// 1.4. isBlank(): Comprueba si está vacío O si solo tiene espacios en blanco.
		String textoConEspacios = "   ";
		boolean enBlanco = textoConEspacios.isBlank(); // Resultado: true	
		
		// 2. Comparacion de textos
		String clave1 = "secreto";
		String clave2 = "SECRETO";

		// 2.1. equals(): Compara si son EXACTAMENTE iguales (distingue mayúsculas y minúsculas).
		boolean iguales = clave1.equals(clave2); // Resultado: false

		// 2.2. equalsIgnoreCase(): Compara ignorando si están en mayúsculas o minúsculas.
		boolean igualesSinImportar = clave1.equalsIgnoreCase(clave2); // Resultado: true

		// 2.3. compareTo(): Útil para ordenar alfabéticamente. 
		// Devuelve 0 si son iguales, un negativo si va antes en el diccionario, o positivo si va después.
		int orden = "Ana".compareTo("Zebra"); // Resultado: Negativo (Ana va antes)
		
		
		// 3. Busqueda y Rastreo
		//
		
		String frase = "El perro come pienso de perro";

		// 3.1. indexOf(): Busca la PRIMERA vez que aparece una letra o palabra y te da su posición.
		int primeraVez = frase.indexOf("perro"); // Resultado: 3

		// 3.2. lastIndexOf(): Busca la ÚLTIMA vez que aparece una letra o palabra.
		int ultimaVez = frase.lastIndexOf("perro"); // Resultado: 24 (Si no existe, devuelve -1)

		// 3.3. contains(): Solo te dice (true/false) si una palabra está dentro del texto.
		boolean tienePienso = frase.contains("pienso"); // Resultado: true

		// 3.4. startsWith() y endsWith(): Comprueba si empieza o termina por algo concreto.
		boolean empiezaConEl = frase.startsWith("El"); // Resultado: true
		boolean acabaConGato = frase.endsWith("gato"); // Resultado: false
		
		// 4. Extraer y romper textos
		// Para cuando necesitas sacar un "trozo" de una frase mas grande
		
		String archivo = "foto_vacaciones.jpg";

		// 4.1. substring(inicio): Corta el texto desde la posición que le digas hasta el final.
		String extension = archivo.substring(15); // Resultado: ".jpg"

		// 4.2. substring(inicio, fin): Corta desde el inicio (incluido) hasta el fin (NO incluido).
		String nombre = archivo.substring(0, 15); // Resultado: "foto_vacaciones"

		// 4.3. split(): Rompe el texto en varios trozos usando un separador y devuelve un Array.
		String lista = "manzana,pera,platano";
		String[] frutas = lista.split(","); // Resultado: ["manzana", "pera", "platano"]
		
		// 5. Modificacion y formateo
		
		String sucio = "   Hola Mundo   ";

		// 5.1. toLowerCase() y toUpperCase(): Pasa todo a minúsculas o a mayúsculas.
		String mayus = sucio.toUpperCase(); // Resultado: "   HOLA MUNDO   "

		// 5.2. trim() y strip(): Quitan los espacios sobrantes al principio y al final (strip es más moderno).
		String limpio = sucio.trim(); // Resultado: "Hola Mundo"

		// 5.3. replace(): Cambia una letra o palabra por otra en todo el texto.
		String censurado = limpio.replace("Mundo", "****"); // Resultado: "Hola ****"

		// 5.4. String.valueOf(): Convierte CUALQUIER tipo de dato (número, boolean, etc.) a texto.
		int numero = 100;
		String numeroEnTexto = String.valueOf(numero); // Resultado: "100"
		
		
		
		
		
		// Para que no salgan errores por no usar las variables
		
		System.out.println(tamaño);
		System.out.println(letra);
		System.out.println(vacio);
		System.out.println(enBlanco);
		System.out.println(iguales);
		System.out.println(igualesSinImportar);
		System.out.println(orden);
		System.out.println(primeraVez);
		System.out.println(ultimaVez);
		System.out.println(tienePienso);
		System.out.println(empiezaConEl);
		System.out.println(acabaConGato);
		System.out.println(extension);
		System.out.println(nombre);
		System.out.println(frutas);
		System.out.println(mayus);
		System.out.println(censurado);
		System.out.println(numeroEnTexto);


	}

}
