
package CicloWhile;


public class EjercicioWhile01 {
    public static void main(String[] args) {
        
    int conteo = 0;
    while(conteo < 7){
           System.out.println("conteo = " + conteo);
           conteo++; //Se aumenta en 1 la variable
        }
    
    var contador = 0;
    
        do {            
            System.out.println("contador = " + contador);
            contador++;
        } while (contador < 7);
        
        //Uso de las palabras break y continue junto a las etiquetas (labels)
        inicio:
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                System.out.println("i = " + i);
                break inicio;
            }
          
        }
        
           for (int i = 0; i < 10; i++) {
            if(i % 2 != 0){
                
                continue; //
            }
          System.out.println("i = " + i);
        }
           
     
    }

}
