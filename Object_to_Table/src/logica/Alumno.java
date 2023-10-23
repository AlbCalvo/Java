/* Creación de la clase que se transformará en una tabla.
   @xxxx: Identifica las Entiy's.
*/ 

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

@Entity   // Identifica la clase k se transformará en tabla. (i.e. Alumno)

public class Alumno implements Serializable  {
    /*
    @Id        
    @GeneratedValue(strategy=GenerationType.AUTO)
     Indica qué campo es clave primaria, añadiendo que el valor se genere
    incrementalmente cada vez que se añade un elemento.   
    
       Inicio: Estas dos annotations deben ir sobre el campo que será Id y en este orden.
    */
    @Id        
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private int id;
    // Final: Estas dos annotations valores deben ir sobre el campo que será Id y en este orden.
    
    @Basic  // Se indica k los siguientes campos no tienen nada en particular,  
            // de no poner nada JPA ya los toma como tal.
    private String nombre;
    private String apellido;
    
    @Temporal(TemporalType.DATE) // Mapeamos la fecha para indicar cómo es.
    private Date fechaNac;
    
    /* Paso 1.- 
        RELACIÓN (1 a 1) ENTRE Alumno y Carrera.
        Supuesto: Un Alumno SOLO puede hacer una carrera.
       Paso 2.-
        Informar a JPA de la existencia de esta relación.
        utilizando la entity @OneToOne
       Paso 3.- Borrar el constructor y volver a crearlo. 
        Se a ++ un nuevo atributo, carrera.
       Paso 4.- ++ Setter y Getter de carrera.
       Paso 5.- Volver a crear AlumnoJpaController para
        que tenga en cuenta a carrera, así como también crear el
        Jpa de carrera.
    */
    @OneToOne
    private Carrera carre;
    
    
    
    //CONSTRUCTORES.

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac, Carrera carre) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.carre = carre;
    }

    //GETTER Y SETTER.

    public Carrera getCarre() {
        return carre;
    }

    public void setCarre(Carrera carre) {
        this.carre = carre;
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

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
    
}

