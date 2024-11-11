
package Ciclos01;

import java.util.Scanner;

/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100 y luego ir
pidiendo números indicando "es mayor" o "es menor" segun sea mayor 
o menor con respecto a N. El proceso termina cuando el usuario acierta y mostramos
el número de intentos hechos.
*/
public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = (int) (Math.random() * 100);
        int contador = 0;
        int numero;

        do {  
            System.out.println("Ingrese un número entre 1 y 100.");
            numero = sc.nextInt();
            
            if(numero > n ){
                System.out.println("El número ingresado "+numero+" es mayor a N");
            }else{System.out.println("El número ingresado "+numero+" es menor a N");}
            
            contador++;
            
        } while (n != numero);

        System.out.println("GANASTE EL JUEGO!! . EL NUMERO N ES "+n);
        System.out.println("Los intentos realizados fueron: "+contador);
        
    
    }
     
    
}
