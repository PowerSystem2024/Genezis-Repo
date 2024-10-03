
package Ciclo08;

import javax.swing.JOptionPane;


public class Ejercicio08 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int i = 1;
        while ( i <= numero){
            JOptionPane.showConfirmDialog(null, i);
            i++;
        }
    }
}
