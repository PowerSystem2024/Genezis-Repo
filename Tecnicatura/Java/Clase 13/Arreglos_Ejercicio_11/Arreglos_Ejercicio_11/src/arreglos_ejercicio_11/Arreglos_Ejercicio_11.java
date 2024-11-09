/*
Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma 
creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,
e insertarlo en el lugar adecuado para que la tabla continue ordenada.
*/
package arreglos_ejercicio_11;

import java.util.Scanner;

public class Arreglos_Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10]; // Arreglo de tamaño 10
        int numElementos = 5; // Solo llenaremos 5 posiciones al inicio

        // Leer los 5 elementos ordenados
        System.out.println("Ingrese 5 números en orden creciente:");
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
            // Validar orden creciente
            if (i > 0 && arreglo[i] < arreglo[i - 1]) {
                System.out.println("Error: El número ingresado no está en orden creciente. Inténtelo de nuevo.");
                i--; // Pedir nuevamente el número
            }
        }

        // Leer el número N a insertar
        System.out.print("\nIngrese el número N a insertar en el arreglo: ");
        int N = scanner.nextInt();

        // Buscar la posición donde insertar N
        int posicion = 0;
        while (posicion < numElementos && arreglo[posicion] < N) {
            posicion++;
        }

        // Desplazar elementos hacia la derecha para hacer espacio
        for (int i = numElementos; i > posicion; i--) {
            arreglo[i] = arreglo[i - 1];
        }

        // Insertar N en la posición encontrada
        arreglo[posicion] = N;

        // Mostrar el arreglo resultante
        System.out.println("\nEl arreglo resultante es:");
        for (int i = 0; i < numElementos + 1; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
