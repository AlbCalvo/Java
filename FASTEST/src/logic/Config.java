/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author acmmi
 */
@Entity
public class Config implements Serializable {
    @Id
    private int configIdeExaCue; //Si en la bdd=1 es el examen que toca hacer.
    private String configAsignatura;
    private String configCriterioCorreccion;
    private String configDescripcionExamen;
    private String configFP1FP2;
    private String configFecha; 
    private int configNumPreguntas;
    private String configObservaciones;
    
    public Config() {
    }

    public Config(int configIdeExaCue, String configAsignatura, String configCriterioCorreccion, String configDescripcionExamen, String configFP1FP2, String configFecha, int configNumPreguntas, String configObservaciones) {
        this.configIdeExaCue = configIdeExaCue;
        this.configAsignatura = configAsignatura;
        this.configCriterioCorreccion = configCriterioCorreccion;
        this.configDescripcionExamen = configDescripcionExamen;
        this.configFP1FP2 = configFP1FP2;
        this.configFecha = configFecha;
        this.configNumPreguntas = configNumPreguntas;
        this.configObservaciones = configObservaciones;
    }

    public int getConfigIdeExaCue() {
        return configIdeExaCue;
    }

    public void setConfigIdeExaCue(int configIdeExaCue) {
        this.configIdeExaCue = configIdeExaCue;
    }

    public String getConfigAsignatura() {
        return configAsignatura;
    }

    public void setConfigAsignatura(String configAsignatura) {
        this.configAsignatura = configAsignatura;
    }

    public String getConfigCriterioCorreccion() {
        return configCriterioCorreccion;
    }

    public void setConfigCriterioCorreccion(String configCriterioCorreccion) {
        this.configCriterioCorreccion = configCriterioCorreccion;
    }

    public String getConfigDescripcionExamen() {
        return configDescripcionExamen;
    }

    public void setConfigDescripcionExamen(String configDescripcionExamen) {
        this.configDescripcionExamen = configDescripcionExamen;
    }

    public String getConfigFP1FP2() {
        return configFP1FP2;
    }

    public void setConfigFP1FP2(String configFP1FP2) {
        this.configFP1FP2 = configFP1FP2;
    }

    public String getConfigFecha() {
        return configFecha;
    }

    public void setConfigFecha(String configFecha) {
        this.configFecha = configFecha;
    }

    public int getConfigNumPreguntas() {
        return configNumPreguntas;
    }

    public void setConfigNumPreguntas(int configNumPreguntas) {
        this.configNumPreguntas = configNumPreguntas;
    }

    public String getConfigObservaciones() {
        return configObservaciones;
    }

    public void setConfigObservaciones(String configObservaciones) {
        this.configObservaciones = configObservaciones;
    }

    @Override
    public String toString() {
        return "Config{" + "configIdeExaCue=" + configIdeExaCue + ", configAsignatura=" + configAsignatura + ", configCriterioCorreccion=" + configCriterioCorreccion + ", configDescripcionExamen=" + configDescripcionExamen + ", configFP1FP2=" + configFP1FP2 + ", configFecha=" + configFecha + ", configNumPreguntas=" + configNumPreguntas + ", configObservaciones=" + configObservaciones + '}';
    }

   


    
}
