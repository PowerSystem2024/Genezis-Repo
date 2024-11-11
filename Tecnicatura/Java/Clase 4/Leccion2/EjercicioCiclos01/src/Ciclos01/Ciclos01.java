// Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
//el proceso hasta que se introduzca un número negativo
package Ciclos01;

import java.util.Scanner;


public class Ciclos01 {
    public static void main(String[] args) {
        int i = 0;
        int num, cuadrado;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("Ingrese un número entero");
            num = sc.nextInt();
        
        } while (num < 0);
        
        cuadrado = (int)Math.pow(num, 2);
        
        System.out.println("El cuadrado del número " +num+ " es: "+cuadrado);
        
        
        
    }
}
