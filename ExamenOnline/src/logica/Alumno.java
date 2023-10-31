/* Un Alumno puede tener asignados n Exámenes */
package logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_alumno;
    private int id_Examen;
    private String nombreAlumno;
    private String primerApellido;
    private String segundoApellido;
    private String cursoAlumno;
    private String emailAlumno;
    private String observacionesAlumno;
    private String primeraConvocatoriaAlumno;
    @OneToMany (mappedBy="alumnExamen") //Marcamos k es una relación bidireccional.
    private LinkedList<Examen> listaExamenes;

    public Alumno() {
    }

    public Alumno(int id_alumno, int id_Examen, String nombreAlumno, String primerApellido, String segundoApellido, String cursoAlumno, String emailAlumno, String observacionesAlumno, String primeraConvocatoriaAlumno, LinkedList<Examen> listaExamenes) {
        this.id_alumno = id_alumno;
        this.id_Examen = id_Examen;
        this.nombreAlumno = nombreAlumno;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cursoAlumno = cursoAlumno;
        this.emailAlumno = emailAlumno;
        this.observacionesAlumno = observacionesAlumno;
        this.primeraConvocatoriaAlumno = primeraConvocatoriaAlumno;
        this.listaExamenes = listaExamenes;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_Examen() {
        return id_Examen;
    }

    public void setId_Examen(int id_Examen) {
        this.id_Examen = id_Examen;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCursoAlumno() {
        return cursoAlumno;
    }

    public void setCursoAlumno(String cursoAlumno) {
        this.cursoAlumno = cursoAlumno;
    }

    public String getEmailAlumno() {
        return emailAlumno;
    }

    public void setEmailAlumno(String emailAlumno) {
        this.emailAlumno = emailAlumno;
    }

    public String getObservacionesAlumno() {
        return observacionesAlumno;
    }

    public void setObservacionesAlumno(String observacionesAlumno) {
        this.observacionesAlumno = observacionesAlumno;
    }

    public String getPrimeraConvocatoriaAlumno() {
        return primeraConvocatoriaAlumno;
    }

    public void setPrimeraConvocatoriaAlumno(String primeraConvocatoriaAlumno) {
        this.primeraConvocatoriaAlumno = primeraConvocatoriaAlumno;
    }

    public LinkedList<Examen> getListaExamenes() {
        return listaExamenes;
    }

    public void setListaExamenes(LinkedList<Examen> listaExamenes) {
        this.listaExamenes = listaExamenes;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id_alumno=" + id_alumno + ", id_Examen=" + id_Examen + ", nombreAlumno=" + nombreAlumno + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", cursoAlumno=" + cursoAlumno + ", emailAlumno=" + emailAlumno + ", observacionesAlumno=" + observacionesAlumno + ", primeraConvocatoriaAlumno=" + primeraConvocatoriaAlumno + ", listaExamenes=" + listaExamenes + '}';
    }
    
   
    
    }
