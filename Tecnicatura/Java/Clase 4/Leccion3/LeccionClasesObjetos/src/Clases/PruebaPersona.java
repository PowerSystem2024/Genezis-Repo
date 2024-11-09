package Clases;

public class PruebaPersona {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona();// new Persona() llama al constructor de la clase Persona
        persona1.nombre = "Marcos";
        persona1.apellido = "Rodriguez";

        persona1.obtenerInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);

        persona2.obtenerInformacion();

        persona2.nombre = "Pirito";
        persona2.apellido = "Gordo";
        persona2.obtenerInformacion();

    }

}
