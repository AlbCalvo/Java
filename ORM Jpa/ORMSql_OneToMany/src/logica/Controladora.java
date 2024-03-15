
package logica;

import java.util.ArrayList;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author acmmi
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); 
    //- Métodos Alumno
    public void crearAlumno(Alumno alu) {
        controlPersis.crearAlumno(alu);
    }

    public void borrarAlumno(int i) {
        controlPersis.borrarAlumno(i);
    }

    public void editarAlumno(Alumno alu) {
        controlPersis.editarAlumno(alu);
    
    }

    public Alumno leerAlumno(int i) {
        return controlPersis.leerAlumno(i);
     }
    
    public ArrayList<Alumno> leerAlumnos(){
        return controlPersis.leerAlumnos();
    }
    // //- Métodos Asignatura
    public void crearAsignatura(Asignatura asig) {
        controlPersis.crearAsignatura(asig);
    }

    public void borrarAsignatura(int i) {
        controlPersis.borrarAsignatura(i);
    }

    public void editarAsignatura(Asignatura asig) {
        controlPersis.editarAsignatura(asig);
    
    }

    public Asignatura leerAsignatura(int i) {
        return controlPersis.leerAsignatura(i);
     }
    
    public ArrayList<Asignatura> leerAsignaturas(){
        return controlPersis.leerAsignaturas();
    }
    //- Métodos UF
    public void crearUF(UF uf) {
        controlPersis.crearUF(uf);
    }

    public void borrarUF(int i) {
        controlPersis.borrarUF(i);
    }

    public void editarUF (UF uf) {
        controlPersis.editarUF(uf);
    
    }

    public UF leerUF(int i) {
        return controlPersis.leerUF(i);
     }
    
    public ArrayList<UF> leerUFS(){
        return controlPersis.leerUFS();
    }
}