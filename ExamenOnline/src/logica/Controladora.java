
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
        // Modificar Examen - Solo el año -
        exa.setAnioExamen(2024);
        controlPersis.modificarExamenBdd(exa);
        
        // Modificar Alumno. Paso 1.-Localizarlo en la Bdd. Paso 2.- Modificar datos.
        //Paso 1.-Localizarlo en la Bdd. Creamos la búsqueda del Alumno en Bdd en la controladora por si otro método lo necesitara.
        Alumno alumnaModificar = this.buscarAlumnoEnBdd(exa.getAlumnExamen().getId_alumno());
        //Paso 2.- Modificar datos.
        alumnaModificar.setNombreAlumno(nombre);
        alumnaModificar.setPrimerApellido(apellido1);
        alumnaModificar.setSegundoApellido(apellido2);
        alumnaModificar.setCursoAlumno(curso);
        alumnaModificar.setEmailAlumno(email);
        alumnaModificar.setObservacionesAlumno(observaciones);
        this.modificarAlumno(alumnaModificar);
     }

    private Alumno buscarAlumnoEnBdd(int id_alumno) {
        return controlPersis.traerAlumno(id_alumno);
    }

    private void modificarAlumno(Alumno alumnaModificar) {
        controlPersis.modificarAlumnoBdd(alumnaModificar);
    }


}

