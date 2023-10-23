package object_to_table;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.Alumno;
import logica.Carrera;
import logica.Controladora;
import logica.Materia;



public class Object_to_Table {

    public static void main(String[] args) {
     
        Controladora control = new Controladora();
        
        /* Líneas de código utilizadas para altas, bajas, modificicaciones y consultas cuando solo existía la clase Alumno 
         ++ var control. Contienen Vs los métodos de; Controladora > ControladoraPersistencia > AlumnoJpaController > Alumno 
        Alumno alu = new Alumno(31, "María", "Perez", new Date());
        control.crearAlumno(alu); 
        
         DESTROY elemento de Bdd
        control.eliminarAlumno(15); 
        
        EDIT Alumno 
        alu.setApellido("de Paula");
        control.editarAlumno(alu); 
        
         Buscar un solo elemento 
        Alumno alu = control.traerAlumno(18);
        System.out.println("Busca individual ************");
        System.out.println("El alumno es " + alu.toString());
        
         BUSCAR TODOS los elementos de la tabla 
        System.out.println("Busca completa ************");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for (Alumno x : listaAlumnos){
            System.out.println("El alumno es; " + x.toString()  );
        }
        System.out.print
        ln("************************"); */
        
        /* ------------- Pasos en una relación a a 1 ------------- 
        
        // Crear Carrera 
        Carrera carre = new Carrera(26, "Master profesorado II");
               
        //Guardar carrera en Bdd
        control.crearCarrera(carre);
                
        //Creación alumno (Con Carrera)
        Alumno alu = new Alumno(24, "Javier", "The yorkie", new Date(), carre);
                       
        // Guardar Alumno en Bdd
        control.crearAlumno(alu);
                
        System.out.println("visualizar rdo");
        //Visualizar rdo.
        System.out.println("Datos alumno ----- ");
        Alumno alu2 = control.traerAlumno(23);
        System.out.println("Alumno " + alu2.toString());
        System.out.println("Nombre alumno " + alu2.getNombre());
        
        System.out.println("--------------- Carrera ");
        System.out.println("Cursa la carrera "+ alu2.getCarre().getNombre() + " Id " + alu2.getCarre().getId());
        */
        
        /* ------------- Pasos en una relación a a n ------------- 
        1.- Crear varias materias.
        2.- Crear una Carrera. 1 a n
        3.- Crear un Alumno. 1 a 1
        */
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creación de una carrera (1)
        Carrera carre = new Carrera(25, "Master profesorado II", listaMaterias);
        control.crearCarrera(carre);
        
        //Creación materias (3)
        Materia mater1  = new Materia (1, "Lenguaje", "Letras", carre );
        Materia mater2  = new Materia (2, "Literatura", "Letras", carre );
        Materia mater3  = new Materia (3, "Mates", "Ciencias", carre );
        //Guardado Materias en Bd
        control.crearMateria(mater1);
        control.crearMateria(mater2);
        control.crearMateria(mater3);
        //Agregar Lista de Materias
        listaMaterias.add(mater1);
        listaMaterias.add(mater2);
        listaMaterias.add(mater3);
        
        carre.setListaMateria(listaMaterias);
        control.editarCarrera(carre);
        
        //Crear Alumno (1)
        Alumno alu = new Alumno(24, "Javier", "The yorkie", new Date(), carre);
        control.crearAlumno(alu);
        //Visualizar rdo.
        Alumno alu2 = control.traerAlumno(24);
        System.out.println("Alumno " + alu2.toString());
        System.out.println("Nombre alumno " + alu2.getNombre());
        System.out.println("--------------- Carrera ");
        System.out.println("Cursa la carrera "+ alu2.getCarre().getNombre() + " Id " + alu2.getCarre().getId());
        
    }
    
}
