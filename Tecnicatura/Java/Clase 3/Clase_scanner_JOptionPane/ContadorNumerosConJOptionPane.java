package Clase_scanner_JOptionPane;


import javax.swing.JOptionPane;

public class ContadorNumerosConJOptionPane {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        String input;

        // Pedir números hasta que se teclee uno negativo
        input = JOptionPane.showInputDialog("Introduce un número (número negativo para salir):");
        numero = Integer.parseInt(input);

        while (numero >= 0) {
            contador++;  // Incrementar el contador por cada número válido ingresado
            input = JOptionPane.showInputDialog("Introduce otro número (número negativo para salir):");
            numero = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números.");
    }
}
