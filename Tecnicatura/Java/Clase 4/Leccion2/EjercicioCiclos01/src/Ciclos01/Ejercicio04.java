/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner, luego con la clase JOptionPAne
*/
package Ciclos01;

import java.util.Scanner;


public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, contador;
        contador = 0;
        
        
        do {            
            System.out.println("Ingrese un número positivo: ");
            numero = sc.nextInt();
            
            if(numero < 0){
                System.out.println("Ingrese un valor positivo.");
                
            }
            contador++;
        } while(numero != 0);
        
        contador = contador-1;
        
        System.out.println("Se ha ingresado el número "+numero+". Ha finalizado el programa.");
        System.out.println("La cantidad de números ingresados es: "+contador);
        
    }
    
}
