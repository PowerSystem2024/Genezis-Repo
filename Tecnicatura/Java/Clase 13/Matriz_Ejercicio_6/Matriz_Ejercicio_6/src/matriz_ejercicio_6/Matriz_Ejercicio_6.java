/*
Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera
y transponerla en la segunda.
*/
package matriz_ejercicio_6;

import java.util.Scanner;

public class Matriz_Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[5][9];
        int[][] matrizB = new int[9][5];

        // Cargar los elementos de la primera matriz (5x9)
        System.out.println("Ingrese los elementos de la matriz 5x9:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Transponer matrizA en matrizB (9x5)
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }

        // Mostrar matrizA (5x9)
        System.out.println("\nMatriz 5x9 ingresada:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar matrizB (9x5) que es la transpuesta de matrizA
        System.out.println("\nMatriz 9x5 transpuesta:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j] + " ");
            }
            System.out.println();
        }
    }
}
