/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un 
arreglo. Debemos mostrarlos en el siguiente orden: el primero.
el último, el segundo, el penúltimo, el tercero, etc.
*/

package arreglos_ejercicio_4;

import java.util.Scanner;

public class Arreglos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leer 10 números y guardarlos en el arreglo
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números en el orden solicitado
        System.out.println("\nNúmeros en el orden solicitado:");
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }

        // Si el número de elementos es impar, muestra el del medio al final
        if (numeros.length % 2 != 0) {
            System.out.print(numeros[numeros.length / 2]);
        }
    }
}

