/*
Ejercicio 9: Pedir el dia, mes y año de una fecha e
indicar si la fecha es correcta. Suponiendo que
todos los meses son de 30 dias.
*/
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if ((dia != 0) &&( anio <= 2022)){
            if ((mes != 0) &&(mes <= 12)){
                if((anio != 0) &&(anio <= 2022)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada es: "+dia+"/"+mes+"/"+anio);
                }
                else{
                     JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }
            }
            else{1
                    
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showInternalInputDialog(null,"Fecha incorrecta, dia incorrecto");
        }
    }
}
