
package Clases;

// se define como publica la clase para poder acceder desde otros archivos a la clase
public class Persona {
    //Atributos de la clase (características)
    String nombre;
    String apellido;

    // Métodos de la clase (acciones)
    public void obtenerInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);


    }
}
