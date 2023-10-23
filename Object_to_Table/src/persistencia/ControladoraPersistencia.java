/* Recibe las peticiones desde la lógica delegándola dependiendo del JPAController que estemos usando */

package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;
import logica.Carrera;
import logica.Materia;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    // ********* INSTANCIA JPA para utilizar las Clases Alumno y Carrera.
    AlumnoJpaController alujpa = new AlumnoJpaController();
    CarreraJpaController carrejpa = new CarreraJpaController();
    MateriaJpaController materjpa = new MateriaJpaController();
    
    public void crearAlumno(Alumno alu) {
        // Enviar la acción de CREATE a la controladora específica de ALUMNO: AlumnoJpaController
        alujpa.create(alu);
     }

    public void eliminarAlumno(int id) {
         try {
             alujpa.destroy(id);
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

    public Alumno traerAlumno(int id) {
       return alujpa.findAlumno(id);
    
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> listita = alujpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno> (listita);
        return listaAlumnos;
    }
    // ********* INSTANCIA JPA para utilizar la Clase Carrera.
    
    public void crearCarrera(Carrera carre) {
        carrejpa.create(carre);
    }

    public void eliminarCarrera(int id) {
         try {
             carrejpa.destroy(id);
         } catch (NonexistentEntityException ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public void editarCarrera(Carrera carre) {
         try {
             carrejpa.edit(carre);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public Carrera traerCarrera(int id) {
        return carrejpa.findCarrera(id);
    
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> Carrerita = carrejpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList(Carrerita);
        return listaCarreras;
    }
    
    
    // ********* INSTANCIA JPA para utilizar la Clase MATERIA.
    

    public void crearMateria(Materia mater) {
         materjpa.create(mater);
    }

    public void eliminarMateria(int id) {
        try {
            materjpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mater) {
        try {
            materjpa.edit(mater);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return materjpa.findMateria(id);
    }

    public ArrayList<Materia> traerListaMateria() {List<Materia> Materialita = materjpa.findMateriaEntities();
        ArrayList<Materia> listaMaterias = new ArrayList(Materialita);
        return listaMaterias;
    }
 
     
}
