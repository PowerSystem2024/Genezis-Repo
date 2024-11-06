package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona personal = new Persona(); // Llamamos al constructor
        personal.nombre = "Javier"; // El valor hexadecimal normalmente comienza con 0x
        personal.apellido = "Quiroga";
        personal.obtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2); // Imprimirá algo como: persona2 = Persona@12345678
        System.out.println("personal = " + personal);

        persona2.obtenerInformacion();

        persona2.nombre = "Abel";
        persona2.apellido = "Pintos";
        persona2.obtenerInformacion();
    }
}
