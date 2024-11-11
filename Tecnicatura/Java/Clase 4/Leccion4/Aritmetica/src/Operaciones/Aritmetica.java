/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

public class Aritmetica {

    // Creación de métodos: para nombrar los métodos se usa pascalCase

    int a;
    int b;


    // Método

    public void sumar(){
        int suma; // se define una variable local dentro del metodo. solo puede ser utilizada dentro del metodo
        suma = a + b;
        System.out.println("suma = " + suma);
    }

    public int sumarConRetorno(){

        return a+b;
    }

    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; // el argumento a se asigna al atributo this.a
        this.b = arg2;
        //return a+b;
        return sumarConRetorno();
    }

}
