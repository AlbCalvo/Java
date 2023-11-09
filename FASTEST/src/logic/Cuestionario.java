/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 *Class Alumno vs Clas Examen (1-N)
 *Class Examen vs Cuestionario(1-N)
 */
@Entity
public class Cuestionario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id_cue;         
    private int cueIdeExaCue;   //Nº de examen k toca hacer.
    private int numOrden;
    private String enunciadoPregunta;
    private String enunciadoRespuestaA;
    private String enunciadoRespuestaB;
    private String enunciadoRespuestaC;
    private String enunciadoRespuestaD;
    private String respuestaDlAlumno;  
    private char respuestaCorrecta; 
    private int id_Alu; //Dni sin letra
    @ManyToOne
    private Examen examCuestionario;

    public Cuestionario() {
    }

    public Cuestionario(int id_cue, int cueIdeExaCue, int numOrden, String enunciadoPregunta, String enunciadoRespuestaA, String enunciadoRespuestaB, String enunciadoRespuestaC, String enunciadoRespuestaD, String respuestaDlAlumno, char respuestaCorrecta, int id_Alu, Examen examCuestionario) {
        this.id_cue = id_cue;
        this.cueIdeExaCue = cueIdeExaCue;
        this.numOrden = numOrden;
        this.enunciadoPregunta = enunciadoPregunta;
        this.enunciadoRespuestaA = enunciadoRespuestaA;
        this.enunciadoRespuestaB = enunciadoRespuestaB;
        this.enunciadoRespuestaC = enunciadoRespuestaC;
        this.enunciadoRespuestaD = enunciadoRespuestaD;
        this.respuestaDlAlumno = respuestaDlAlumno;
        this.respuestaCorrecta = respuestaCorrecta;
        this.id_Alu = id_Alu;
        this.examCuestionario = examCuestionario;
    }

    public int getId_cue() {
        return id_cue;
    }

    public void setId_cue(int id_cue) {
        this.id_cue = id_cue;
    }

    public int getCueIdeExaCue() {
        return cueIdeExaCue;
    }

    public void setCueIdeExaCue(int cueIdeExaCue) {
        this.cueIdeExaCue = cueIdeExaCue;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getEnunciadoPregunta() {
        return enunciadoPregunta;
    }

    public void setEnunciadoPregunta(String enunciadoPregunta) {
        this.enunciadoPregunta = enunciadoPregunta;
    }

    public String getEnunciadoRespuestaA() {
        return enunciadoRespuestaA;
    }

    public void setEnunciadoRespuestaA(String enunciadoRespuestaA) {
        this.enunciadoRespuestaA = enunciadoRespuestaA;
    }

    public String getEnunciadoRespuestaB() {
        return enunciadoRespuestaB;
    }

    public void setEnunciadoRespuestaB(String enunciadoRespuestaB) {
        this.enunciadoRespuestaB = enunciadoRespuestaB;
    }

    public String getEnunciadoRespuestaC() {
        return enunciadoRespuestaC;
    }

    public void setEnunciadoRespuestaC(String enunciadoRespuestaC) {
        this.enunciadoRespuestaC = enunciadoRespuestaC;
    }

    public String getEnunciadoRespuestaD() {
        return enunciadoRespuestaD;
    }

    public void setEnunciadoRespuestaD(String enunciadoRespuestaD) {
        this.enunciadoRespuestaD = enunciadoRespuestaD;
    }

    public String getRespuestaDlAlumno() {
        return respuestaDlAlumno;
    }

    public void setRespuestaDlAlumno(String respuestaDlAlumno) {
        this.respuestaDlAlumno = respuestaDlAlumno;
    }

    public char getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(char respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getId_Alu() {
        return id_Alu;
    }

    public void setId_Alu(int id_Alu) {
        this.id_Alu = id_Alu;
    }

    public Examen getExamCuestionario() {
        return examCuestionario;
    }

    public void setExamCuestionario(Examen examCuestionario) {
        this.examCuestionario = examCuestionario;
    }

    @Override
    public String toString() {
        return "Cuestionario{" + "id_cue=" + id_cue + ", cueIdeExaCue=" + cueIdeExaCue + ", numOrden=" + numOrden + ", enunciadoPregunta=" + enunciadoPregunta + ", enunciadoRespuestaA=" + enunciadoRespuestaA + ", enunciadoRespuestaB=" + enunciadoRespuestaB + ", enunciadoRespuestaC=" + enunciadoRespuestaC + ", enunciadoRespuestaD=" + enunciadoRespuestaD + ", respuestaDlAlumno=" + respuestaDlAlumno + ", respuestaCorrecta=" + respuestaCorrecta + ", id_Alu=" + id_Alu + ", examCuestionario=" + examCuestionario + '}';
    }

    
    
}
