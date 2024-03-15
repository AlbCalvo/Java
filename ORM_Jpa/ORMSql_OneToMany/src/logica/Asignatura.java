package logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author acmmi
 */
@Entity
public class Asignatura implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    @Basic
    private String nombre;
    @OneToMany(mappedBy = "asigClaveForanea")
    private LinkedList<UF> listaUFS;
    @ManyToOne
    private Alumno aluClaveForanea;

    public Asignatura() {
    }

    public Asignatura(int id, String nombre, LinkedList<UF> listaUFS, Alumno aluClaveForanea) {
        this.id = id;
        this.nombre = nombre;
        this.listaUFS = listaUFS;
        this.aluClaveForanea = aluClaveForanea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<UF> getListaUFS() {
        return listaUFS;
    }

    public void setListaUFS(LinkedList<UF> listaUFS) {
        this.listaUFS = listaUFS;
    }

    public Alumno getAluClaveForanea() {
        return aluClaveForanea;
    }

    public void setAluClaveForanea(Alumno aluClaveForanea) {
        this.aluClaveForanea = aluClaveForanea;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + ", listaUFS=" + listaUFS + ", aluClaveForanea=" + aluClaveForanea + '}';
    }

    

    
}
