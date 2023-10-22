package logica.excepciones;


public class Excepciones {

    public static void main(String[] args) {
  /*
        // Excepción división por 0.
        try {
            // Si se realiza esta operación continuamos.
            int rdo = 4/0;
        }
        catch ( Exception x) {
            //De no haberse podido ejecutar correctamente las instrucciones del try
            System.out.println("Detectada excepción: División por cero");
        }
*/
        // Excepción sobrepasar índice de un vector.
        int numeros [] = {1,2,3,4};
        try {
           System.out.println(" Nos pasamos de índice " + numeros[5]);
        }
        catch (Exception e) {
            System.out.println("Detectada excepción: Sobrepasado índice del vector");
        }
        
                    
        }
    }
 
