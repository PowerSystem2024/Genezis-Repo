/*
Ejercicio : Leer 5 números, guardarlos en un arregloy
mostrarlos en el mismo orden intoducidos.
 */
package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] arreglos = new float[5];

        System.out.println("Guardando los datos en el arreglo:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglos[i] = entrada.nextFloat();
        }

        System.out.println("\nImprimir los elementos del arreglo");
        for (float i : arreglos) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
