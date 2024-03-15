package ormsql;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Asignatura;
import logica.Controladora;
import logica.UF;

public class ORMSql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controladora control  = new Controladora ();
        LinkedList<UF> listaUFS = new LinkedList<UF>();
        LinkedList<UF> listaUFS2 = new LinkedList<UF>();
        Asignatura asigPont= null;
        
        // /*-----------------------------
        Alumno al = new Alumno (12, "María", "de Villota", new Date(), asigPont);
        control.crearAlumno(al);
                      
        Asignatura asig = new Asignatura (10, "Literatura", listaUFS);
        control.crearAsignatura(asig);
        
        UF uf1 = new UF (1, "Primera UF de 1er alumno", 15, asig);
        UF uf2 = new UF (2, "Segunda UF  de 1er alumno", 16, asig);
        control.crearUF(uf1);
        control.crearUF(uf2);
        
        // Actualizar los valores UFs en la asignatura
        listaUFS.add (uf1);
        listaUFS.add (uf2);
        asig.setListaUFS(listaUFS);
        control.editarAsignatura(asig);
        // Actualizar los valores de asinatura en alumno
        al.setAsig(asig);
        control.editarAlumno(al);
        
        // Leer Alumno, Asignatura y Ufs en la Bdd
        Alumno aluBuscado = control.leerAlumno(12);
        // Mostrar datos del alumno y la asignatura.
        System.out.println("*** Alumno UNO dado de alta: ***");
        System.out.println("Alumno Id: " + aluBuscado.getId());
        System.out.println("Alumno Nombre: " + aluBuscado.getNombre());
        System.out.println("Alumno Apellido: " + aluBuscado.getApellido());
        System.out.println("Alumno Fecha: " + aluBuscado.getFechaNac());
        System.out.println("Asignatura ID: " + aluBuscado.getAsig().getId());
        System.out.println("Asignatura nombre: " + aluBuscado.getAsig().getNombre());
        LinkedList<UF> listaUfVisualizar = aluBuscado.getAsig().getListaUFS();
        for ( UF x : listaUfVisualizar ){
            System.out.println("UF nombre" + x.getNombre());
            System.out.println("UF NºHoras" + x.getNumeroHoras());
            System.out.println("UF Identificador" + x.getI());
        }
        
        // Dar de alta alumno 2
        
        al = new Alumno (22, "Lope", "de Vega", new Date(), asigPont);
        control.crearAlumno(al);
               
        asig = new Asignatura (20, "Matemáticas", listaUFS2);
        control.crearAsignatura(asig);
        
        uf1 = new UF (3, "Primera UF del 2o alumno", 25, asig);
        uf2 = new UF (4, "Segunda UF del 2o alumno", 26, asig);
        UF uf3 = new UF (5, "Tercera UF del 2o alumno", 27, asig);
        UF uf4 = new UF (6, "Cuarta UF del 2o alumno", 28, asig);
        control.crearUF(uf1);
        control.crearUF(uf2);
        control.crearUF(uf3);
        control.crearUF(uf4);
        // Actualizar los valores UFs en la asignatura
        listaUFS2.add (uf1);
        listaUFS2.add (uf2);
        listaUFS2.add (uf3);
        listaUFS2.add (uf4);
        asig.setListaUFS(listaUFS2);
        control.editarAsignatura(asig);
        // Actualizar los valores de asinatura en alumno
        al.setAsig(asig);
        control.editarAlumno(al);
        
        // Leer Alumno, Asignatura y Ufs en la Bdd
        aluBuscado = control.leerAlumno(22);
        // Mostrar datos del alumno y la asignatura.
        System.out.println("*** Alumno DOS dado de alta: ***");
        System.out.println("Alumno Id: " + aluBuscado.getId());
        System.out.println("Alumno Nombre: " + aluBuscado.getNombre());
        System.out.println("Alumno Apellido: " + aluBuscado.getApellido());
        System.out.println("Alumno Fecha: " + aluBuscado.getFechaNac());
        System.out.println("Asignatura ID: " + aluBuscado.getAsig().getId());
        System.out.println("Asignatura nombre: " + aluBuscado.getAsig().getNombre());
        listaUfVisualizar = aluBuscado.getAsig().getListaUFS();
        for ( UF x : listaUfVisualizar ){
            System.out.println("UF nombre" + x.getNombre());
            System.out.println("UF NºHoras" + x.getNumeroHoras());
            System.out.println("UF Identificador" + x.getI());
        }
        
        // ------------------------------- */
       
        /* ----------------------------
        /* Obtener TODOS los alumnos  
         ----------------------------*/
        
        //Alumno aluBuscado = control.leerAlumno(22);
        //System.out.println("El alumno es; " + aluBuscado.toString());
        
        // Volcado en pantalla de todos los elementos
       /* ArrayList<Alumno> todosLosAlumnos = control.leerAlumnos();
        
        ArrayList<Alumno> listaAlVisualizar = control.leerAlumnos();
        for ( Alumno x : listaAlVisualizar ){
            System.out.println("El alumno es; " + x.toString());
        }
        */
        
        /* ----------------------------
        /* Borrado del alumno 2 
         ----------------------------*/
        
        //control.borrarAlumno(22);
    }
    }