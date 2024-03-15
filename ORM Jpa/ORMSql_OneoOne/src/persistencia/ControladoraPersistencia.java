/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;
import logica.Asignatura;
import logica.UF;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author acmmi
 */
public class ControladoraPersistencia {
    AlumnoJpaController alujpa = new AlumnoJpaController();
    AsignaturaJpaController asijpa = new AsignaturaJpaController();
    UFJpaController ufjpa = new UFJpaController();
    
    public void crearAlumno(Alumno alu) {
        alujpa.create(alu);
      }

    public void borrarAlumno(int i) {
        try {
            alujpa.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alujpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno leerAlumno(int i) {
       return alujpa.findAlumno(i);
    }

    public ArrayList<Alumno> leerAlumnos() {
        List<Alumno> pontLista =  alujpa.findAlumnoEntities();
        ArrayList<Alumno> arrayLista = new ArrayList<Alumno> (pontLista);
        return arrayLista;  
       
    }
    //-- Métodos de Asignatura
    public void crearAsignatura(Asignatura asig) {
        asijpa.create(asig);
    }

    public void borrarAsignatura(int i) {
        try {
            asijpa.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAsignatura(Asignatura asig) {
        try {
            asijpa.edit(asig);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Asignatura leerAsignatura(int i) {
       return  asijpa.findAsignatura(i);
    }

    public ArrayList<Asignatura> leerAsignaturas() {
        List<Asignatura> pontLista =  asijpa.findAsignaturaEntities();
        ArrayList<Asignatura> arrayLista = new ArrayList<Asignatura> (pontLista);
        return arrayLista;    
    }

    //-- Métodos de UF
    
    public void crearUF(UF uf) {
       ufjpa.create(uf);
    }

    public void borrarUF(int i) {
        try {
            ufjpa.destroy(i);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   }

    public void editarUF(UF uf) {
        try {
            ufjpa.edit(uf);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UF leerUF(int i) {
      return ufjpa.findUF(i);
    }

    public ArrayList<UF> leerUFS() {
        List<UF> pontLista =  ufjpa.findUFEntities();
        ArrayList<UF> arrayLista = new ArrayList<UF> (pontLista);
        return arrayLista;  
        }
    
    
}
