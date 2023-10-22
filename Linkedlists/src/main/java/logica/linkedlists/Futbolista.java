/* Atributos de un futbolista */
package logica.linkedlists;
import java.util.ArrayList;
import java.util.LinkedList;

public class Futbolista {
    // Atributos.
    protected String nombre;
    protected int dorsal;
    protected String posición;
    // Constructores.
    public Futbolista(String nombre, int dorsal, String posición) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.posición = posición;
    }
    // Getter.

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getPosición() {
        return posición;
    }
    //Setter.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }
    
    
}
