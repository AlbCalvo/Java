/*  Controladora lógica.
    Contendrá todos los métodos con los que llamar a la persistencia(Bdd).
    i.e. El método CREATE existente aquí, llamará al CREATE de la controladora de persistencia
 */
package logica;
import java.util.ArrayList;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    /********* MÉTODOS ALUMNO */
    
    /* PAso 1.- Conectar esta "controladora lógica" con la "controladora de persistencia".
        Mediante  podremos acceder a los métodos de la controladora de persistencia*/
        ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
        
        /*-------------- MÉTODOS ALUMNO -------------------*/
        
        public void crearAlumno (Alumno alu){
            controlPersis.crearAlumno (alu);
        }
        
        public void eliminarAlumno(int id){
            controlPersis.eliminarAlumno(id);
        } 
        
        public void editarAlumno(Alumno alu){
            controlPersis.editarAlumno(alu);
         } 
        
        public Alumno traerAlumno(int id){
            return controlPersis.traerAlumno(id);
        }
        
        public ArrayList<Alumno> traerListaAlumnos(){
            return controlPersis.traerListaAlumnos();
        }
                
        /*-------------- MÉTODOS CARRERA -------------------*/
        public void crearCarrera (Carrera carre){
            controlPersis.crearCarrera (carre);
        }
        
        public void eliminarCarrera(int id){
            controlPersis.eliminarCarrera(id);
        } 
        
        public void editarCarrera(Carrera carre){
            controlPersis.editarCarrera(carre);
            
        } 
        
        public Carrera traerCarrera(int id){
            return controlPersis.traerCarrera(id);
        }
        
        public ArrayList<Carrera> traerListaCarrera(){
            return controlPersis.traerListaCarreras();
        }
           
        /********* MÉTODOS MATERIA */
        public void crearMateria (Materia mater){
            controlPersis.crearMateria (mater);
        }
        
        public void eliminarMateria(int id){
            controlPersis.eliminarMateria(id);
        } 
        
        public void editarMateria(Materia mater){
            controlPersis.editarMateria(mater);
            
        } 
        
        public Materia traerMateria(int id){
            return controlPersis.traerMateria(id);
        }
        
        public ArrayList<Materia> traerListaMateria(){
            return controlPersis.traerListaMateria();
        }
}
