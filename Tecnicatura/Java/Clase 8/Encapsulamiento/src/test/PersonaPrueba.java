package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 420.000, false);

        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        //Modificar a través de los métodos
        persona1.setNombre("Maria Antonienta");
        //personal.nombre = "Juan Ignacio"; //Ya no se puede utilizar
        //System.out.println("Nombre es: " + persona1.nombre); //Error
        System.out.println("persona1 con su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: " + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());

        Persona persona2 = new Persona( "Carlos",  777.000, false);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        // Modificar a través de los métodos
        persona2.setNombre("Samuel Deluque");
        System.out.println("persona2 con su nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());
        System.out.println("persona1 = " + persona1);
    }

    //Tarea: Crear otro objeto tipo Persona, asignar valores de manera inicial
    //e imprimir, luego modificar sus calores y volver a imprimir


}
