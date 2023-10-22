/*
 Prueba de cómo introducir texto en una celda de una pantalla y que este se copie en una segunda celda de la misma pantalla.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;
import igu.Pantalla; // Paquete que contiene nuestra interface gráfica


public class PruebaCapas {

  
    public static void main(String[] args) {
        // Confección visual de la pantalla con la que interactuaremos. 
        Pantalla panta = new Pantalla (); // Pantalla en la clase, pana es la var de tipo Pantalla.
        panta.setVisible(true);
        panta.setLocationRelativeTo(null); // Forzamos que la pantalla se muestre en el medio (K no tome nada como referencia para mostrarla)
        
    }
    
}
