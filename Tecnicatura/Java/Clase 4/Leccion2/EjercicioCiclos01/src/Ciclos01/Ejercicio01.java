// Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
//el proceso hasta que se introduzca un número negativo
package Ciclos01;

import javax.swing.JOptionPane;


public class Ejercicio01 {
    public static void main(String[] args) {
        
        int num, cuadrado;
        
        do {            
            System.out.println("Ingrese un número entero");
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        } while (num < 0);
        
        cuadrado = (int)Math.pow(num, 2);
        
        System.out.println("El cuadrado del número " +num+ " es: "+cuadrado);
        
    }
}
