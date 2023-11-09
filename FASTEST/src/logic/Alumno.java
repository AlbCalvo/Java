/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *Class Alumno vs Clas Examen (1-N)
 *Class Examen vs Cuestionario(1-N)
 */
@Entity
public class Alumno implements Serializable {
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_Alu; //Dni sin letra
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    @OneToMany (mappedBy="examenAlumno")
    private LinkedList<Examen> listaExamenesAlumno;

    public Alumno() {
    }

    public Alumno(int id_Alu, String nombre, String apellido1, String apellido2, String email, LinkedList<Examen> listaExamenesAlumno) {
        this.id_Alu = id_Alu;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.listaExamenesAlumno = listaExamenesAlumno;
    }

    public int getId_Alu() {
        return id_Alu;
    }

    public void setId_Alu(int id_Alu) {
        this.id_Alu = id_Alu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkedList<Examen> getListaExamenesAlumno() {
        return listaExamenesAlumno;
    }

    public void setListaExamenesAlumno(LinkedList<Examen> listaExamenesAlumno) {
        this.listaExamenesAlumno = listaExamenesAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_Alu=" + id_Alu + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email=" + email + ", listaExamenesAlumno=" + listaExamenesAlumno + '}';
    }
    
    
}
