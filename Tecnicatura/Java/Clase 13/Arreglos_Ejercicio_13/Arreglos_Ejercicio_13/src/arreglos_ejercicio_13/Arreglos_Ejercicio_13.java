/*
Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los
elementos pares de la primera, y a continuación los elementos impares.
*/
package arreglos_ejercicio_13;

import java.util.Scanner;

public class Arreglos_Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablaOriginal = new int[10];
        int[] tablaOrdenada = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;

        // Leer los 10 números enteros
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < tablaOriginal.length; i++) {
            System.out.print("Digite un número: ");
            tablaOriginal[i] = scanner.nextInt();
        }

        // Guardar los elementos pares en la tablaOrdenada primero
        for (int i = 0; i < tablaOriginal.length; i++) {
            if (tablaOriginal[i] % 2 == 0) {
                tablaOrdenada[contadorPares] = tablaOriginal[i];
                contadorPares++;
            }
        }

        // Guardar los elementos impares en la tablaOrdenada a continuación de los pares
        contadorImpares = contadorPares; 
        for (int i = 0; i < tablaOriginal.length; i++) {
            if (tablaOriginal[i] % 2 != 0) {
                tablaOrdenada[contadorImpares] = tablaOriginal[i];
                contadorImpares++;
            }
        }

        // Mostrar la tabla ordenada 
        System.out.println("\nLa tabla ordenada con pares e impares es:");
        for (int i = 0; i < tablaOrdenada.length; i++) {
            System.out.print(tablaOrdenada[i]);
            if (i < tablaOrdenada.length - 1) {
                System.out.print(" - ");
            }
        }
    }
}
