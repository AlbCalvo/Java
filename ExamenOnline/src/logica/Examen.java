package logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Examen implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_Examen;
    private int id_Alumno;
    private int anioExamen;
    private int gradoExamen;
    private int cuatrimestreExamen;
    private String tituloCuestionario;
    private int notaDlExamen;
    @ManyToOne
    private Alumno alumnExamen;

    public Examen() {
    }

    public Examen(int id_Examen, int id_Alumno, int anioExamen, int gradoExamen, int cuatrimestreExamen, String tituloCuestionario, int notaDlExamen, Alumno alumnExamen) {
        this.id_Examen = id_Examen;
        this.id_Alumno = id_Alumno;
        this.anioExamen = anioExamen;
        this.gradoExamen = gradoExamen;
        this.cuatrimestreExamen = cuatrimestreExamen;
        this.tituloCuestionario = tituloCuestionario;
        this.notaDlExamen = notaDlExamen;
        this.alumnExamen = alumnExamen;
    }

    public int getId_Examen() {
        return id_Examen;
    }

    public void setId_Examen(int id_Examen) {
        this.id_Examen = id_Examen;
    }

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public int getAnioExamen() {
        return anioExamen;
    }

    public void setAnioExamen(int anioExamen) {
        this.anioExamen = anioExamen;
    }

    public int getGradoExamen() {
        return gradoExamen;
    }

    public void setGradoExamen(int gradoExamen) {
        this.gradoExamen = gradoExamen;
    }

    public int getCuatrimestreExamen() {
        return cuatrimestreExamen;
    }

    public void setCuatrimestreExamen(int cuatrimestreExamen) {
        this.cuatrimestreExamen = cuatrimestreExamen;
    }

    public String getTituloCuestionario() {
        return tituloCuestionario;
    }

    public void setTituloCuestionario(String tituloCuestionario) {
        this.tituloCuestionario = tituloCuestionario;
    }

    public int getNotaDlExamen() {
        return notaDlExamen;
    }

    public void setNotaDlExamen(int notaDlExamen) {
        this.notaDlExamen = notaDlExamen;
    }

    public Alumno getAlumnExamen() {
        return alumnExamen;
    }

    public void setAlumnExamen(Alumno alumnExamen) {
        this.alumnExamen = alumnExamen;
    }

    @Override
    public String toString() {
        return "Examen{" + "id_Examen=" + id_Examen + ", id_Alumno=" + id_Alumno + ", anioExamen=" + anioExamen + ", gradoExamen=" + gradoExamen + ", cuatrimestreExamen=" + cuatrimestreExamen + ", tituloCuestionario=" + tituloCuestionario + ", notaDlExamen=" + notaDlExamen + ", alumnExamen=" + alumnExamen + '}';
    }

    
}
