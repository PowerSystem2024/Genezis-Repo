package Clase_scanner_JOptionPane;

import java.util.Scanner;
import java.util.Random;

public class AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generamos un número aleatorio entre 0 y 100
        int numeroAleatorio = random.nextInt(101);  // Genera un número entre 0 y 100
        int intento;
        int contadorIntentos = 0;

        System.out.println("¡Bienvenido al juego de la adivinanza!");
        System.out.println("Genere un número entre 0 y 100. ¿Podes adivinarlo?");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();
            contadorIntentos++;  // Incrementamos el contador de intentos

            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                System.out.println("Número de intentos: " + contadorIntentos);
            }
        } while (intento != numeroAleatorio);

        scanner.close();  // Cerramos el scanner
    }
}
