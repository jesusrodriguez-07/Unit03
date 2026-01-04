package funcs;

import java.util.Scanner;

public class Ejercicio05_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 2, 1, 3, 4, 5, 6, 7};
        int valor;

        System.out.print("Introduce el valor que quieres buscar en la tabla: ");
        valor = sc.nextInt();

        int[] posiciones = buscarTodos(t, valor);

        if (posiciones.length == 0) {
            System.out.println("El valor no se encuentra en la tabla.");
        } else {
            System.out.print("El valor se encuentra en las posiciones: ");
            for (int pos : posiciones) {
                System.out.print(pos + " ");
            }
        }

        sc.close();
    }

    public static int[] buscarTodos(int[] t, int valor) {

        int contador = 0;

        // Contar cuántas veces aparece el valor
        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                contador++;
            }
        }

        // Si no aparece, devolver tabla vacía
        if (contador == 0) {
            return new int[0];
        }

        // Crear array con el tamaño exacto
        int[] posiciones = new int[contador];
        int j = 0;

        // Guardar los índices donde aparece
        for (int i = 0; i < t.length; i++) {
            if (t[i] == valor) {
                posiciones[j] = i;
                j++;
            }
        }

        return posiciones;
    }
}

