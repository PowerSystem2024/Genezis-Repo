
package Ciclos01;

import java.util.Scanner;

/*
Ejercicio 8: pedir un número N y mostrar todos los números del 1 al N
*/


public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = Integer.parseInt(sc.nextLine());
        int i = 1;
        while(i <= numero){
            System.out.println(i);
            i++;
        }
    }
}
