/*
Ejercicio 7: Crear una matriz "marco" de tamaño 5x5: todos sus elementos
deben ser 0 salvo los de los bordes que deben ser 1. Mostrarla.
*/
package matriz_ejercicio_7;

public class Matriz_Ejercicio_7 {
    
        public static void main(String[] args) {
            int matriz[][] = new int[5][5];

            // Creamos la matriz de 5x5
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    // Asigna 1 a los bordes y 0 a los elementos internos
                    if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1) {
                        matriz[i][j] = 1;
                    } else {
                        matriz[i][j] = 0;
                    }
                }   
            }
    
        // Muestra la matriz "5x5"
            System.out.println("Rellenando la matriz: ");
        System.out.println("La matriz es: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
