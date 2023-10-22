/* Creación de un LinkedList al que le añadiremos elementos, para luego recorrer sus elementos utilizando for y foreach */

package logica.linkedlists;
import java.util.ArrayList;
import java.util.LinkedList; // Interface LinkedList
import java.util.List;      // Interface list.

public class Linkedlists {

    public static void main(String[] args) {
        
        // ARRAYLIST *********************
        // Declaración de variables.
        ArrayList<Futbolista> equipoDFutbolArray = new ArrayList<Futbolista>();
            
        equipoDFutbolArray.add(new Futbolista("Array1", 10, "Falso 9"));
        equipoDFutbolArray.add(new Futbolista("Array2", 8, "Defensa"));
        equipoDFutbolArray.add(new Futbolista("Array3", 5, "Medio"));
        System.out.println("---- Recorrer ArrayList");
        for (Futbolista x:equipoDFutbolArray) {
            System.out.println("Recorrer ArrayList todo el equipo: " + x.getNombre());
          }
                // Borramos el 1º elemento = Array2
        System.out.println("Array2 borrado");
        equipoDFutbolArray.remove(1);
        System.out.println("---- Recorrer ArrayList tras borrado");
        for (Futbolista x:equipoDFutbolArray) {
            System.out.println("Recorrer ArrayList todo el equipo: " + x.getNombre());
          }
                
        // LINKEDLIST *************************************
        List<Futbolista> equipoDFutbol = new LinkedList<Futbolista>();
        // Añadimos futbolistas al LinkedList.
        equipoDFutbol.add(new Futbolista("Messi", 10, "Falso 9"));
        equipoDFutbol.add(new Futbolista("Sergio Ramos", 8, "Defensa"));
        equipoDFutbol.add(new Futbolista("Busquets", 5, "Medio"));
         
        // Insertar elementos.
        equipoDFutbol.add(0, new Futbolista("Marta Cardona", 10, "Delantera"));
        equipoDFutbol.add(2, new Futbolista("Marta II Cardona", 10, "Delantera"));
             
        // Recorrer TODOS sus elementos, LinkedList.
        System.out.println("---- Recorrer LinkedKist");
        for (Futbolista x:equipoDFutbol) {
            System.out.println("Recorrer todo el equipo: " + x.getNombre());
          }
       // Borramos 
       System.out.println("----> Borrar Messi");
       String nombreBorrar = "Messi";
       for (Futbolista y : equipoDFutbol) {
           if (y.getNombre().equals(nombreBorrar) ){
               equipoDFutbol.remove(y);
               //System.out.println("----> get nombre " + y.getNombre() );
               break;
        }
       }
        // Recorrer TODOS sus elementos, LinkedList.
        System.out.println("---- Recorrer LinkedKist");
        for (Futbolista x:equipoDFutbol) {
            System.out.println("Recorrer todo el equipo: " + x.getNombre());
          }
     
    }
    }

   
