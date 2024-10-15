/*  
 * Ejercicio 1: Leer un numero y mostrar su cuadrado, repetir
   el proceso hasta que se introduzca un número negativo
 */
package Ciclos01;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int numero, cuadrado;
            System.out.println("Digite un numero");
            numero = Integer.parseInt(entrada.nextLine());
            while(numero >= 0){
                cuadrado = (int)Math.pow(numero, 2);
                System.out.println("El numero "+numero+" elevado al cuadrado es: "+cuadrado);
                System.out.println("Digite otro numero: ");
                numero = Integer.parseInt(entrada.nextLine());
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("El progama a finalizado por numero negativo");
    }

}
