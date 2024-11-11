package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        Aritmetica aritmetica1 = new Aritmetica(); // se llama al constructor de la clase Aritmetica

        aritmetica1.a = 3;
        aritmetica1.b = 5;

        // Método suma
        aritmetica1.sumar();

        // Método suma con retorno
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("La suma con retorno es:"+resultado);

        //Método suma con argumentos
        resultado = aritmetica1.sumarConArgumentos(12,29);
        System.out.println("La suma con argumentos es:"+resultado);



    }
}
