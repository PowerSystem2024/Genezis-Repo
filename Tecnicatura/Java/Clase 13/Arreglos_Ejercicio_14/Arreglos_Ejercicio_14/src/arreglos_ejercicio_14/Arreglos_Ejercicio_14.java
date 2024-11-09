/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
Copiar(fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/
package arreglos_ejercicio_14;

import java.util.Scanner;

public class Arreglos_Ejercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir los arreglos con tamaño 10
        int[] tablaOriginal = new int[10];
        int[] tablaPares = new int[10];
        int[] tablaImpares = new int[10];

        // Leer 10 números en orden para la tabla original
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < tablaOriginal.length; i++) {
            System.out.print("Digite un número: ");
            tablaOriginal[i] = scanner.nextInt();
        }

        // Separar los números pares e impares
        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < tablaOriginal.length; i++) {
            if (tablaOriginal[i] % 2 == 0) {
                tablaPares[contadorPares++] = tablaOriginal[i]; // Guardamos los pares
            } else {
                tablaImpares[contadorImpares++] = tablaOriginal[i]; // Guardamos los impares
            }
        }

        // Mostrar la tabla original
        System.out.println("\nTabla Original:");
        for (int i = 0; i < tablaOriginal.length; i++) {
            System.out.print(tablaOriginal[i]);
            if (i < tablaOriginal.length - 1) {
                System.out.print(" - ");
            }
        }

        // Mostrar la tabla de Pares
        System.out.println("\n\nTabla de Pares:");
        if (contadorPares == 0) {
            System.out.println("No hay números pares.");
        } else {
            for (int i = 0; i < contadorPares; i++) {
                System.out.print(tablaPares[i]);
                if (i < contadorPares - 1) {
                    System.out.print(" - ");
                }
            }
        }

        // Mostrar la tabla de Impares
        System.out.println("\n\nTabla de Impares:");
        if (contadorImpares == 0) {
            System.out.println("No hay números impares.");
        } else {
            for (int i = 0; i < contadorImpares; i++) {
                System.out.print(tablaImpares[i]);
                if (i < contadorImpares - 1) {
                    System.out.print(" - ");
                }
            }
        }
    }
}
