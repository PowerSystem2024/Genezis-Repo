/*
EJERCICIO 3: crear y cargar una matriz de tamaño 3x3 transponerla y mostrarla
 */
package matriz_ejercicio_3;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Rellenar la matriz:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Matriz original:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("Matrix ["+i+"]["+j+"]: "+matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("Matriz ["+j+"]["+i+"]: "+matriz[j][i]+" ");
            }
            System.out.println();
        }
    }

}
