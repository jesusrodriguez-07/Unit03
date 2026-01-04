package funcs;

public class Ejercicio01_1 {

    public static void main(String[] args) {
        int[] numeros = { 10, 1, 5 };

        int sumaTotal = sumarTabla(numeros);
        System.out.println("Suma total = " + sumaTotal);
    }

    /**
     * Suma todos los valores de una tabla de enteros
     * @param numeros tabla de entrada (no puede ser null)
     * @return suma total de los elementos de la tabla
     */
    public static int sumarTabla(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("La tabla no puede ser null.");
        }

        int sumaTotal = 0;
        for (int indiceActual = 0; indiceActual < numeros.length; indiceActual++) {
            sumaTotal += numeros[indiceActual];
        }
        return sumaTotal;
    }
}