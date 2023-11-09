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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
/**
 *Class Alumno vs Clas Examen (1-N)
 *Class Examen vs Cuestionario(1-N)
 */
@Entity
public class Examen implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_Exa;
    private int exaIdeExaCue;
    private String fechaExamen;
    private String fp1Fp2;
    private String asignatura;
    private String descripExamen;
    private String criterioCorreccion;
    private int numPreguntas;
    private String primeraVezSPresenta;
    private String observaciones;
    private double notaObtenida;
    @ManyToOne
    private Alumno examenAlumno;
    @OneToMany (mappedBy="examCuestionario")
    private LinkedList<Cuestionario> listaCuestionarioRdo;

    public Examen() {
    }

    public Examen(int id_Exa, int exaIdeExaCue, String fechaExamen, String fp1Fp2, String asignatura, String descripExamen, String criterioCorreccion, int numPreguntas, String primeraVezSPresenta, String observaciones, double notaObtenida, Alumno examenAlumno, LinkedList<Cuestionario> listaCuestionarioRdo) {
        this.id_Exa = id_Exa;
        this.exaIdeExaCue = exaIdeExaCue;
        this.fechaExamen = fechaExamen;
        this.fp1Fp2 = fp1Fp2;
        this.asignatura = asignatura;
        this.descripExamen = descripExamen;
        this.criterioCorreccion = criterioCorreccion;
        this.numPreguntas = numPreguntas;
        this.primeraVezSPresenta = primeraVezSPresenta;
        this.observaciones = observaciones;
        this.notaObtenida = notaObtenida;
        this.examenAlumno = examenAlumno;
        this.listaCuestionarioRdo = listaCuestionarioRdo;
    }

    public int getId_Exa() {
        return id_Exa;
    }

    public void setId_Exa(int id_Exa) {
        this.id_Exa = id_Exa;
    }

    public int getExaIdeExaCue() {
        return exaIdeExaCue;
    }

    public void setExaIdeExaCue(int exaIdeExaCue) {
        this.exaIdeExaCue = exaIdeExaCue;
    }

    public String getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(String fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getFp1Fp2() {
        return fp1Fp2;
    }

    public void setFp1Fp2(String fp1Fp2) {
        this.fp1Fp2 = fp1Fp2;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getDescripExamen() {
        return descripExamen;
    }

    public void setDescripExamen(String descripExamen) {
        this.descripExamen = descripExamen;
    }

    public String getCriterioCorreccion() {
        return criterioCorreccion;
    }

    public void setCriterioCorreccion(String criterioCorreccion) {
        this.criterioCorreccion = criterioCorreccion;
    }

    public int getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    public String getPrimeraVezSPresenta() {
        return primeraVezSPresenta;
    }

    public void setPrimeraVezSPresenta(String primeraVezSPresenta) {
        this.primeraVezSPresenta = primeraVezSPresenta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getNotaObtenida() {
        return notaObtenida;
    }

    public void setNotaObtenida(double notaObtenida) {
        this.notaObtenida = notaObtenida;
    }

    public Alumno getExamenAlumno() {
        return examenAlumno;
    }

    public void setExamenAlumno(Alumno examenAlumno) {
        this.examenAlumno = examenAlumno;
    }

    public LinkedList<Cuestionario> getListaCuestionarioRdo() {
        return listaCuestionarioRdo;
    }

    public void setListaCuestionarioRdo(LinkedList<Cuestionario> listaCuestionarioRdo) {
        this.listaCuestionarioRdo = listaCuestionarioRdo;
    }

    @Override
    public String toString() {
        return "Examen{" + "id_Exa=" + id_Exa + ", exaIdeExaCue=" + exaIdeExaCue + ", fechaExamen=" + fechaExamen + ", fp1Fp2=" + fp1Fp2 + ", asignatura=" + asignatura + ", descripExamen=" + descripExamen + ", criterioCorreccion=" + criterioCorreccion + ", numPreguntas=" + numPreguntas + ", primeraVezSPresenta=" + primeraVezSPresenta + ", observaciones=" + observaciones + ", notaObtenida=" + notaObtenida + ", examenAlumno=" + examenAlumno + ", listaCuestionarioRdo=" + listaCuestionarioRdo + '}';
    }

    
 

    
}
