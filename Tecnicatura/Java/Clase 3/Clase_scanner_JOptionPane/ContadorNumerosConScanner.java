package Clase_scanner_JOptionPane;

import java.util.Scanner;
public class ContadorNumerosConScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        // Pedir números hasta que se teclee uno negativo
        System.out.println("Introduce un número (número negativo para salir):");
        numero = scanner.nextInt();

        while (numero >= 0) {
            contador++;  // Incrementar el contador por cada número válido ingresado
            System.out.println("Introduce otro número (número negativo para salir):");
            numero = scanner.nextInt();
        }

        System.out.println("Se han introducido " + contador + " números.");
        scanner.close();
    }
}
