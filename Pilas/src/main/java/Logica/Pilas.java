/*  COLLECTIONS; Arraylist, Linkdlist y Stacks.  Las dos primeras son FIFO y la última LIFO. 
 */

package Logica;
import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<Integer>();
                
        System.out.println("Lista vacía" + pila);
        System.out.println(" ¿Está vacía? " + pila.isEmpty());
        
        //Añadimis elementos.
        pila.push(10);
        pila.push(9);
        pila.push(8);
        pila.push(7);
        pila.push(6);
        pila.push(5);
        
        //Visualizamos la pila con un for 
        for (Integer x:pila) {
            System.out.println(x);
        }
        
        System.out.println("Lista vacía " + pila);
        System.out.println(" ¿Está vacía? " + pila.isEmpty());
        
        /* MÉTODO Search
            .- Retorna -1 si no lo encuentra.
            .- NO FUNCIONA con objetos, sí con Strings, Integer...
            .- Si lo encuentra retorna la posición en la pila, comenzando por 1.
        */
        
        System.out.println(" ¿En qué posición está el nº 7 está en la pila?  " + pila.search(7)); 
        System.out.println(" ¿Cuál es el primer elemento de la pila y último dado de alta ? " + pila.peek());
        
         //Visualizamos la pila con un for 
        for (Integer x:pila) {
            System.out.println(x);
        }
        pila.pop();                 // Eliminar el último elemento que dimos de alta en la pila.
        
        //Visualizamos la pila con un for 
        for (Integer x:pila) {
            System.out.println(x);
        }
    }
}
