/*
Ejercicio3 : Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
Luego con la clase JOptionPAne
*/
package Ciclos01;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
        // Ejercicio con la clase Scanner
//        Scanner sc = new Scanner(System.in);
//        int numero;
//        System.out.println("Ingrese un número");
//        numero = Integer.parseInt(sc.nextLine());
//        
//        while(numero != 0){
//            if(numero % 2 == 0){
//                System.out.println("El número ingresado "+numero+" es par.");
//            }else{
//                System.out.println("El número ingresado "+numero+" es impar.");
//            }
//            System.out.println("Ingrese otro número");
//            numero = Integer.parseInt(sc.nextLine());
//
//        }
//        System.out.println("El número ingreado es: "+numero+". Finaliza el programa");
//        
//        
        // Ejercicio con la clase JOptionPane
        int numero2;
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
         while(numero2 != 0){
            if(numero2 % 2 == 0){
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero2+" es PAR.");
            }else{
                JOptionPane.showMessageDialog(null, "El número ingresado "+numero2+" es IMPAR.");
            }
            System.out.println("Ingrese otro número");
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        }
         JOptionPane.showMessageDialog(null, "El número ingresado es: "+numero2+" Finaliza el programa.");
    }
    
}
