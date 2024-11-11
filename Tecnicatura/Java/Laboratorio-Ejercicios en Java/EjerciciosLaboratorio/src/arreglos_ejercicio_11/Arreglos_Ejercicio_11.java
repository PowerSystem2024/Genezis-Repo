/*
Ejercicio11 Leer 5 elementos numericos que se introduciaran ordenados de forma creciente. Estos los guardaremos en una tabla de tamaño 10
Leer un número N, e insertarlo en el lugar adecuado para que la tabla continue ordenada
 */

package arreglos_ejercicio_11;

import java.util.Scanner;

public class Arreglos_Ejercicio_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente;
        int numero, sitio_num;

        // Llenar el arreglo con 5 elementos de forma creciente
        System.out.println("Llenar el arreglo con 5 números ordenados crecientemente:");

        // Llenando el arreglo
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print((i + 1) + ". Digite un número: ");
                arreglo[i] = entrada.nextInt();

                // Verificar si el número se mantiene ordenado
                if (i > 0 && arreglo[i] < arreglo[i - 1]) {
                    System.out.println("El número debe ser mayor o igual al anterior para mantener el orden creciente.");
                }
            } while (i > 0 && arreglo[i] < arreglo[i - 1]); // Verificar orden creciente
        }

        // Leer el número N que se desea insertar
        System.out.print("Digite un número a insertar: ");
        numero = entrada.nextInt();

        // Encontrar la posición adecuada para insertar el número
        sitio_num = 0;
        while (sitio_num < 5 && arreglo[sitio_num] < numero) {
            sitio_num++;
        }

        // Mover los elementos para hacer espacio para el número
        for (int i = 4; i >= sitio_num; i--) {
            arreglo[i + 1] = arreglo[i];
        }

        // Insertar el número en el lugar adecuado
        arreglo[sitio_num] = numero;

        // Mostrar el arreglo después de la inserción
        System.out.print("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) { // Solo mostrar los primeros 6 elementos
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
