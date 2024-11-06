package test;

import domain.Persona;

public class PruebaPersona {
    private int contador;

    public static void main(String[] args) {
        Persona personal = new Persona("Ariel");
        System.out.println("persona1 = " + personal);
        Persona persona2 = new Persona("Naty");
        System.out.println("persona2 = " + persona2);
        imprimir(personal);
        imprimir(persona2);
        //this.contador = 10; //No se puede referenciar desde un contexto estatico


    }

    static public void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    public int getPersona() {
        imprimir(new Persona("Josefina"));
        return this.contador;
    }
}
