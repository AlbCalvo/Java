
package logica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    //---------------- Alumno -------------------
    public void crearAlumno (Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    public void eliminarAlumno (int id){
        controlPersis.eliminarAlumno(id);
    }
    public void editarAlumno (Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    public Alumno traerAlumno (int id){
       return controlPersis.traerAlumno(id);
    }
    public ArrayList<Alumno> traerListaAlumnos (){
       return controlPersis.traerListaAlumnos();
    }
    //---------------- Examen -------------------
    public void crearExamen (Examen exa){
        controlPersis.crearExamen(exa);
    }
    public void eliminarExamen (int id){
        controlPersis.eliminarExamen(id);
    }
    public void editarExamen (Examen exa){
        controlPersis.editarExamen(exa);
    }
    public Examen traerExamen (int id){
       return controlPersis.traerExamen(id);
    }
    public List<Examen> traerExamenes (){
       return controlPersis.traerExamenes();
    }

    public void borrarExamen(int vid_examen) {
        controlPersis.borrarExamen(vid_examen);
    }

    public void mostrarAviso(String titulo, String msg, String tipoAviso) {
        JOptionPane optionPane = new JOptionPane(titulo);
        if (tipoAviso.equals ("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipoAviso.equals ("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(msg);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public void modificarExayAlu(Examen exa, String nombre, String apellido1, String apellido2, 
            String curso, String email, String observaciones, String primeraParticipacion) {
        // En mi ejemplo los datos del examen no aparecen por pantalla, por lo que vamos a 
        // modificar los datos de bdd del alumno, k sí son los k aparecen en pantalla.
        controlPersis.modificarAlumno(exa);
        
     }


}

