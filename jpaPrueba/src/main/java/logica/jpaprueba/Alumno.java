/* La Clase Alumno, utilizando annotations, se va a transformar en una tabla 
   en MySQL.
   Lo que aparece tras la @ son Annotations.
*/ 
package logica.jpaprueba;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;    // ORM: Librería necesaria.
import javax.persistence.GeneratedValue; // ORM: Debe ir sobre la librería del campor que hace de Id.
import javax.persistence.GenerationType;
import javax.persistence.Id;        // ORM: Librería necesaria.
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity                 // ORM: Para iniciar el proceso declaramos la Annotation.

public class Alumno implements Serializable {
    @Id                 // ORM: Identificamos qué campo va a ser clave primaria.
    /* ORM: @GeneratedValue(Strategy=GenerationType.AUTO)  
       Debemos especificar cómo queremos que se genere el campo Id, en este caso
       de forma automática.
   */
    @GeneratedValue(strategy=GenerationType.AUTO)     
    private int id;
    @Basic  // ORM: Indicamos que los campos a continuación son normales, 
            // de no poner nada Java ya los toma como tal.
    private String nombre;
    private String apellido;
    @Temporal(TemporalType.DATE) // Decimos cómo debe ser la fecha.
    private Date fechaNac;
    
    //CONSTRUCTORES.
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }
   
    //GETTER Y SETTER.

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
    
    
    
    
}
