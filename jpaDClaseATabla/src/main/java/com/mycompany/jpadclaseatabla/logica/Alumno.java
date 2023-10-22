/* Creación de la clase que se transformará en una tabla.
   @xxxx: Identifica las Entiy's.
*/ 
package com.mycompany.jpadclaseatabla.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity; // Librería Persistence.
import javax.persistence.GeneratedValue;// Librería Persistence.
import javax.persistence.GenerationType;
import javax.persistence.Id; // Librería Persistence.
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity   // Identifica la clase k se transformará en tabla. (i.e. Alumno)

public class Alumno implements Serializable {
    /*
    @Id        
    @GeneratedValue(strategy=GenerationType.AUTO)
     Indica qué campo es clave primaria, añadiendo que el valor se genere
    incrementalmente cada vez que se añade un elemento.   
    */
    // Inicio: Estos tres valores deben ir sobre el campo que será Id y en este orden.
    @Id        
    @GeneratedValue(strategy=GenerationType.AUTO)     
    private int id;
    // Final: Estos tres valores deben ir sobre el campo que será Id y en este orden.
    @Basic  // Se indica k los siguientes campos no tienen nada en particular,  
            // de no poner nada JPA ya los toma como tal.
    private String nombre;
    private String apellido;
    
    @Temporal(TemporalType.DATE) // Mapeamos la fecha para indicar cómo es.
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

