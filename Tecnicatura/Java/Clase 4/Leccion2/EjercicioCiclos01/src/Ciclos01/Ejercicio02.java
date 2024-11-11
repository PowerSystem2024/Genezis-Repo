/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo.
El proceso se repetirá hasta que se introduzca el 0.
 */
package Ciclos01;

import javax.swing.JOptionPane;


public class Ejercicio02 {
    public static void main(String[] args) {
        int numero;
        do {            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número, positivo o negativo: "));
            
            if (numero > 0) {
                System.out.println("El número ingresado "+numero+" es positivo.");
            }else{System.out.println("El número ingresado "+numero+" es negativo.");}
        } while (numero != 0);
        
        
       
    }
}
