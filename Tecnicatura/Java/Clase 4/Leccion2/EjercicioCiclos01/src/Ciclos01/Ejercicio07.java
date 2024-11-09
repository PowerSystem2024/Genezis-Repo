/*
Ejercicio 7: pedir números hasta que se introduzca uno negativo y calcular el promedio
*/
package Ciclos01;

import java.util.Scanner;

 class Ejercicio07 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int numero, conteo = 0, suma = 0;
         float promedio = 0;
         
         System.out.println("Ingrese un número: ");
         numero = Integer.parseInt(sc.nextLine());
         
         while(numero >= 0){
             suma += numero;
             conteo += 1;
             System.out.println("Ingrese otro número: ");
             numero = Integer.parseInt(sc.nextLine());

         }
         
         if(conteo == 0){
             System.out.println("\nError, la división entre cero no existe");
         }else{
            promedio = (float)suma/conteo; 
         }
         
         
         System.out.println("El promedio de los números ingresados es : "+promedio);
     }
}
