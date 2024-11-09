/*
Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros
y una posición(entre 0 y 9). Eliminar el elemento situado en la posición
dada sin dejar huecos.
*/
package arreglos_ejercicio_12;

import java.util.Scanner;

public class Arreglos_Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        // Leer los 10 elementos numéricos
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Digite un número " + (i + 1) + ":" );
            arreglo[i] = scanner.nextInt();
        }

        // Leer la posición a eliminar (validando que esté entre 0 y 9)
        int posicion;
        do {
            System.out.print("\nIngrese la posición a eliminar (entre 0 y 9): ");
            posicion = scanner.nextInt();
            if (posicion < 0 || posicion >= 10) {
                System.out.println("Posición inválida. Debe ser un número entre 0 y 9.");
            }
        } while (posicion < 0 || posicion >= 10);

        // Eliminar el elemento desplazando los elementos hacia la izquierda
        for (int i = posicion; i < arreglo.length - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        // Mostrar el arreglo resultante sin el último elemento
        System.out.println("\nEl arreglo después de eliminar el elemento en la posición " + posicion + " es:");
        for (int i = 0; i < arreglo.length - 1; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
