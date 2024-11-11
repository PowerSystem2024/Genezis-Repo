/*
Ejercicio 9: pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Suponiendo que todos los meses son de 30 días.
 */
package Ciclos01;

import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el día:");
        int dia = Integer.parseInt(sc.nextLine());
        
         System.out.println("Ingrese el mes:");
        int mes = Integer.parseInt(sc.nextLine());
        
         System.out.println("Ingrese el anio:");
        int anio = Integer.parseInt(sc.nextLine());
        
        if (dia != 0 && dia<=30) {
            if (mes!=0 && mes<=12) {
                if (anio != 0 && anio <= 2024) {
                    System.out.println("La ingresada es: "+dia+"/"+mes+"/"+anio);
                }
                else{System.out.println("Fecha incorrecta, año incorrecto");}
            }else{System.out.println("Fecha incorrecta, mes incorrecto");}
        }else{System.out.println("Fecha incorrecta, día incorrecto");}
 
        
        
    }
}
