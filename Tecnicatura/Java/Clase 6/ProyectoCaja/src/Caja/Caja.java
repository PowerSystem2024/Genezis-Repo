package Caja;

public class Caja {
    int ancho;
    int alto;
    int profundo;


    public Caja() { // Constructor 1 (vacío)
    }


    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Para calcular el volumen
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }
}

