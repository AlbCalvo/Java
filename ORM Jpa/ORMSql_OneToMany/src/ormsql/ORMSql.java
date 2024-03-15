/*
    Pasos del ejercicio;
    Paso 1.- Transformar la relación Alumno vs Asignatura de 1-1 a 1-N. 
    Paso 2.- Crear dos alumnos con la siguiente información.
        El Alumno-1  estará relacionado con dos asignaturas, y cada asignatura con dos Uf's.
        El Alumno-1  estará relacionado con tres asignaturas, y cada asignatura con dos Uf's.
    Paso 3.- Recorrer toda la información de cada uno de los alumnos hasta mostrar por pantalla, 
        ordenadamente, todos los datos de cada alumno, su asignatura y las Uf's de las mismas.
    Paso 4.- Dar de baja la segunda UF de la segunda asignatura del primer alumno.
    Paso 5.- Mostrar el estado de las relaciones por pantalla.
*/
package ormsql;
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
        LinkedList<Asignatura> listaAsig = new LinkedList<Asignatura>();
        Alumno alu;
        
        
        
        Asignatura asig = new Asignatura (10, "Literatura", listaUFS, alu);
        control.crearAsignatura(asig);
        
        
        // Crear Asignatura con la lista de ufs vacías
        Asignatura asig = new Asignatura (10, "Literatura", listaUFS);
        control.crearAsignatura(asig);
        
        // Alta en Bdd de cuatro UFS  
        UF uf1 = new UF (1, "Primera UF", 5, asig);
        UF uf2 = new UF (2, "Segunda UF", 6, asig);
        UF uf3 = new UF (3, "Tercera UF", 7, asig);
        UF uf4 = new UF (4, "Cuarta UF", 8, asig);
        control.crearUF(uf1);
        control.crearUF(uf2);
        control.crearUF(uf3);
        control.crearUF(uf4);
        
        // Actualizar en Bdd la lista de UFs de Asignatura
        listaUFS.add (uf1);
        listaUFS.add (uf2);
        listaUFS.add (uf3);
        listaUFS.add (uf4);
        asig.setListaUFS(listaUFS);
        control.editarAsignatura(asig);
        
        // Crear Alumno
        Alumno al = new Alumno (22, "María", "de Villota", new Date(), asig);
        control.crearAlumno(al);
        
        // Leer Alumno, Asignatura y Ufs en la Bdd
        Alumno aluBuscado = control.leerAlumno(22);
        // Mostrar datos del alumno y la asignatura.
        System.out.println("*** Alumno dado de alta: ***");
        System.out.println("Alumno Id: " + aluBuscado.getId());
        System.out.println("Alumno Nombre: " + aluBuscado.getNombre());
        System.out.println("Alumno Apellido: " + aluBuscado.getApellido());
        System.out.println("Alumno Fecha: " + aluBuscado.getFechaNac());
        System.out.println("Asignatura ID: " + aluBuscado.getAsig().getId());
        System.out.println("Asignatura nombre: " + aluBuscado.getAsig().getNombre());
        
        LinkedList<UF> listaUfVisualizar = aluBuscado.getAsig().getListaUFS();
        for ( UF x : listaUfVisualizar ){
            System.out.println(x.getNombre());
            System.out.println(x.getNumeroHoras());
            System.out.println(x.getI());
        }
              
       
    }
    }