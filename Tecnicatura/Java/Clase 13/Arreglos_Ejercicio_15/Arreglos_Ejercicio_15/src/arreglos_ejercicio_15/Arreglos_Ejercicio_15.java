/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la 
tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
con un mensaje.
*/
package arreglos_ejercicio_15;

import java.util.Scanner;

public class Arreglos_Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];
        boolean ordenCorrecto;

        // Leer los 10 números ordenados crecientemente
        do {
            ordenCorrecto = true;
            System.out.println("Ingrese 10 números enteros ordenados crecientemente:");

            for (int i = 0; i < tabla.length; i++) {
                System.out.print("Digite un número: ");
                tabla[i] = scanner.nextInt();
            }

            // Verificar si los números están ordenados crecientemente
            for (int i = 0; i < tabla.length - 1; i++) {
                if (tabla[i] > tabla[i + 1]) {
                    ordenCorrecto = false;
                    System.out.println("Los números no están ordenados crecientemente. Por favor, ingréselos de nuevo.");
                    break;
                }
            }
        } while (!ordenCorrecto);

        // Mostrar la tabla ingresada
        System.out.println("\nTabla ingresada:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i]);
            if (i < tabla.length - 1) {
                System.out.print(" - ");
            }
        }

        // Leer el número N a buscar
        System.out.print("\n\nIngrese el número que desea buscar en la tabla: ");
        int N = scanner.nextInt();

        // Buscar N en la tabla
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == N) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("El número " + N + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + N + " no se encuentra en la tabla.");
        }
    }
}

