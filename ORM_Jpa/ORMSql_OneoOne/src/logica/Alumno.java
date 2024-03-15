
package logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author acmmi
 */
@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    @Basic
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    @OneToOne
    private Asignatura asig;
    

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac, Asignatura asig) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.asig = asig;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Asignatura getAsig() {
        return asig;
    }

    public void setAsig(Asignatura asig) {
        this.asig = asig;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", asig=" + asig + '}';
    }

    
    
    
}
