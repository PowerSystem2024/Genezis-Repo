/*
Proyecto caja:
Ejercicio 1: Crear un proyecto según las especioficaciones
mostradas a continuacion.
La formuila es: volumen= ancho *alto * profundidad
 */
package Caja;

public class PruebaCaja {
    public static void main(String args[]) {
        //Variables locales
        int medidaAncho = 2; //Valores ingresados en código duro
        int medidaAlto = 2;
        int medidaProf = 6;

        Caja caja1 = new Caja(); //Instanciamos el objeto, constructor vacio
        caja1.ancho = medidaAncho; //Le pasamos los valores al objeto
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;

        int resultado = caja1.calcularVolumen(); //Llamamos al método

        //Primer resultado
        System.out.println("resultado volumen de caja 1: " + resultado);

        Caja caja2 = new Caja(2, 3, 3); //Llamamos al constructor 2 con nuevos argumentos
        //Llamamos con el nuevo objeto al método para un nuevo calculo
        System.out.println("resultado volumen de caja 2: " + caja2.calcularVolumen());
    }
}
