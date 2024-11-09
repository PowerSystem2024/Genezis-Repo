/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la
tabla. Se debe mostrar la posicion en que se encuentra. Si no esta, indicarlo
con un mensaje
 */

package arreglos_ejercicio_15;

import java.util.Scanner;

public class Arreglo_ejercicio_15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero;

        System.out.println("Llenar el arreglo: ");
        // Llenar el arreglo
        do {
            // Llenar los 10 números
            for (int i = 0; i < 10; i++) {
                System.out.print(i + ". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }

            // Comprobar si el arreglo está ordenado
            creciente = true;
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] > arreglo[i + 1]) {  // Si el arreglo está desordenado
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo esta desordenado. Vuelva a intentarlo.");
            }
        } while (creciente == false);  // Continuar pidiendo el arreglo si está desordenado

        // Buscar el número en el arreglo
        System.out.print("\nDigite un numero para buscar en el arreglo: ");
        numero = entrada.nextInt();

        int i = 0;
        while (i < 10 && arreglo[i] < numero) {
            i++;
        }

        if (i == 10 || arreglo[i] != numero) {
            System.out.println("\nNumero no encontrado");
        } else {
            System.out.println("\nNumero encontrado en la posición: " + (i + 1));  // Mostrar la posición
        }

        System.out.println();
    }
}
