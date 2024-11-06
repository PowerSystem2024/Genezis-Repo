package test;

import domain.persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        persona personas[] = new persona[2];
        personas[0] = new persona("Ariel");
        personas[1] = new persona("Osvaldo");
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);
        }

        // trabajamos con arreglos en la sintaxis resumida
        String frutas[] = {"Banana", "Pera", "Durazno"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
        }

    }
}
