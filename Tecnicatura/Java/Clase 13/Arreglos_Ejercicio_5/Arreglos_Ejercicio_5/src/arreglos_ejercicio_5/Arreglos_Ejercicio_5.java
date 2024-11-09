/*
Ejercicio 5: Leer por teclado dos tablas de 10 números
enteros y mezclarlas en una tercera de la forma: el 1° de
A, el 1° de B, el 2° de A, el 2° de B, etc.
*/
package arreglos_ejercicio_5;

import java.util.Scanner;

public class Arreglos_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaC = new int[20]; // Tabla para almacenar la mezcla

        // Leer valores para la primera tabla (tablaA)
        System.out.println("Llenamos el primer arreglo:");
        for (int i = 0; i < tablaA.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaA[i] = scanner.nextInt();
        }

        // Leer valores para la segunda tabla (tablaB)
        System.out.println("\nLlenamos el segundo arreglo:");
        for (int i = 0; i < tablaB.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            tablaB[i] = scanner.nextInt();
        }

        // Mezclar las tablas en la tercera (tablaC)
        int j = 0; // índice para la tablaC
        for (int i = 0; i < 10; i++) {
            tablaC[j++] = tablaA[i]; 
            tablaC[j++] = tablaB[i]; 
        }

        // Mostrar la tablaC con el orden mezclado
        System.out.println("\nMostramos el tercer arreglo:");
        for (int i = 0; i < tablaC.length; i++) {
            System.out.print(tablaC[i] + " ");
        }
    }
}

