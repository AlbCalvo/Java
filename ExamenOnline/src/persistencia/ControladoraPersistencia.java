package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;
import logica.Examen;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa          = new   AlumnoJpaController();
    ExamenJpaController exaJpa          = new   ExamenJpaController();
    /*
    public void guardar(Alumno alu, Examen exa) {
        aluJpa.create(alu);
        
        exaJpa.create(exa);
        }
    */
    //******************** Alumno ********************
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) { //Buscar alumno de la bdd
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
       List<Alumno> listita = aluJpa.findAlumnoEntities();
       ArrayList<Alumno> listaAlumnos = new ArrayList(listita);
       return listaAlumnos;
    }
    //******************** Examen ********************
    public void crearExamen(Examen exa) {
        exaJpa.create(exa);
    }

    public void eliminarExamen(int id) {
        try {
            exaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarExamen(Examen exa) {
        try {
            exaJpa.edit(exa);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Examen traerExamen(int id) { //Buscar en la Bdd el Id del examen seleccionado.
        return exaJpa.findExamen(id);
    }

    public List<Examen> traerExamenes() {
        //Todo lo encontrado en la bdd lo retorna a la controladora y de esta a VerDatos
        return exaJpa.findExamenEntities();
    }

    public void borrarExamen(int vid_examen) {
        try {
            exaJpa.destroy(vid_examen);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }

       public void modificarExamenBdd(Examen exa) {
        try {
            exaJpa.edit(exa);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarAlumnoBdd(Alumno alumnaModificar) {
        try {
            aluJpa.edit(alumnaModificar);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
