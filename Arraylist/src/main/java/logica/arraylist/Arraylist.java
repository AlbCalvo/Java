/* Creación de un arraylist al que le añadiremos elementos, para luego recorrer sus elementos utilizando for y foreach */

package logica.arraylist;
import java.util.ArrayList; // Interface ArrayList.
import java.util.List;      // Interface list.

public class Arraylist {

    public static void main(String[] args) {
        // Declaración de variables.
        ArrayList<Futbolista> equipoDFutbol = new ArrayList<Futbolista>();
        // Añadimos futbolistas al arraylist.
        equipoDFutbol.add(new Futbolista("Messi", 10, "Falso 9"));
        equipoDFutbol.add(new Futbolista("Sergio Ramos", 8, "Defensa"));
        equipoDFutbol.add(new Futbolista("Busquets", 5, "Medio"));
        // Recorrer por índice sus elementos.
        System.out.println("---- Recorrer equipo de futbol por índice, (For)");
        for (int i=0; i<equipoDFutbol.size(); i++) {
            System.out.println("Equipo por índice: " + equipoDFutbol.get(i).getNombre());
             }
        // Recorrer por TODOS sus elementos.
        System.out.println("---- Recorrer equipo todo el equipo (For each)");
        for (Futbolista x:equipoDFutbol) {
            System.out.println("Recorrer todo el equipo: " + x.getNombre());
          }  
        // Consultamos la información del segundo elemento.
        System.out.println("El segundo futbolista: " +  equipoDFutbol.get(1).getNombre());
             
        equipoDFutbol.remove(1); // Borramos el segundo elemento.
        // Recorrer por TODOS sus elementos.
        System.out.println("---- Volvemos a recorrer todo el arraylist (For each)");
        for (Futbolista x:equipoDFutbol) {
            System.out.println("Recorrer todo el equipo: " + x.getNombre());
          }  
        // Creamos arraylist de números.
        ArrayList <Integer> listaDNumeros = new ArrayList<Integer>();
        listaDNumeros.add(1);
        listaDNumeros.add(2);
        listaDNumeros.add(3);
        for (Integer x:listaDNumeros) {
            System.out.println("Recorrer todos los números: " + x);
          } 
        
        }
    }

