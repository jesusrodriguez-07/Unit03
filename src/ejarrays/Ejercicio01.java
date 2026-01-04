package ejarrays;

import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {

        int[] numeros = new int[10];     // Array de 10 enteros
        Random random = new Random();      // Utilidad Random de Java

        // Rellenar el array con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; 
            // nextInt(100) genera entre 0 y 99 → +1 hace que sea 1–100
        }

        System.out.print("Array [");
        // Mostrar los valores
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ ",");
        }
        System.out.print("]");
    }
}
