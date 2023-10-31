
package logica;
import java.util.ArrayList;
import java.util.LinkedList;
import persistencia.ControladoraPersistencia;


public class Controladora {
/*
    //Declaración de variables.
    LinkedList<Examen> listaExamenII = new LinkedList<Examen>();
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String SrcNombre, String SrcApellido1, String SrcApellido2, 
            String SrcCurso, String SrEmail, String SrcObservaciones, 
            String primeraParticipacion) {
        
            System.out.println("Parámetros recibidos");
            System.out.println("SrcNombre: " + SrcNombre);
            System.out.println("SrcApellido1: " + SrcApellido1);
            // Declaración de las dos variables.
            Alumno alu = new Alumno();
            Examen exa = new Examen();
            / ALUMNO ****
                id_alumno: Se crea automáticamente
                listaExamenes; No informado
            /
            alu.setId_Examen( exa.getId_Examen());
            alu.setNombreAlumno(SrcNombre);
            alu.setPrimerApellido(SrcApellido1);
            alu.setSegundoApellido(SrcApellido2);
            alu.setCursoAlumno(SrcCurso);
            alu.setEmailAlumno(SrEmail);
            alu.setObservacionesAlumno(SrcObservaciones);
            alu.setPrimeraConvocatoriaAlumno(primeraParticipacion);
            / EXAMEN ****
                 id_Examen: Creado automáticamente
            /
            alu.setId_Examen(exa.getId_Examen());
            exa.setId_Alumno(alu.getId_alumno());
            exa.setAnioExamen(2023);
            listaExamenII.add (exa);
            alu.setListaExamenes(listaExamenII);
            exa.setAlumnExamen(alu);

            System.out.println("02 Vamos a informar Alumno");
            System.out.println("NombreAlumno: " + alu.getNombreAlumno());
            System.out.println("ObservacionesAlumno: " + alu.getObservacionesAlumno());
            //System.out.println("Alumno: " + alu.toString() );
            
            System.out.println("03 Vamos a informar Examen");
            System.out.println("AnioExamen: " + exa.getAnioExamen());
            //System.out.println("Examen: " + exa.toString());
            controlPersis.guardar (alu, exa);

    
    }*/
            
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
    

}
