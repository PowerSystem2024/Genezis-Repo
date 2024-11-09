package Ciclos01;

import java.util.Scanner;

// Ejercicio 6: pedir números hasta que se teclee un 0, mostrar
// la suma de todos los números introducidos.
public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero,suma = 0;

        do {
            System.out.printf("\nIngrese un número: ");
            numero = Integer.parseInt(sc.nextLine());
            suma+=numero;

        }while (numero !=0);

        System.out.println("La suma de todos los números ingresados es: "+suma);

    }



}
