
package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author acmmi
 */
@Entity
public class UF implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int i;
    @Basic
    private String nombre;
    private int numeroHoras;
    @ManyToOne
    private Asignatura asigClaveForanea; 

    public UF() {
    }

    public UF(int i, String nombre, int numeroHoras, Asignatura asigClaveForanea) {
        this.i = i;
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.asigClaveForanea = asigClaveForanea;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public Asignatura getAsigClaveForanea() {
        return asigClaveForanea;
    }

    public void setAsigClaveForanea(Asignatura asigClaveForanea) {
        this.asigClaveForanea = asigClaveForanea;
    }

    @Override
    public String toString() {
        return "UF{" + "i=" + i + ", nombre=" + nombre + ", numeroHoras=" + numeroHoras + ", asigClaveForanea=" + asigClaveForanea + '}';
    }
    
    
    
}
