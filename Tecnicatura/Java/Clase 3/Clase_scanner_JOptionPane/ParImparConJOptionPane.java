package Clase_scanner_JOptionPane;

import javax.swing.JOptionPane;

public class ParImparConJOptionPane {
    public static void main(String[] args) {
        int numero;
        String input;

        // Leer números hasta que se introduzca un cero
        input = JOptionPane.showInputDialog("Introduce un número (0 para salir):");
        numero = Integer.parseInt(input);

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es par.");
            } else {
                JOptionPane.showMessageDialog(null, "El número " + numero + " es impar.");
            }
            
            input = JOptionPane.showInputDialog("Introduce otro número (0 para salir):");
            numero = Integer.parseInt(input);
        }
        
        JOptionPane.showMessageDialog(null, "Has introducido el número 0. Fin del programa.");
    }
}
