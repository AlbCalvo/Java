package Logica;

public class POO {

    public static void main(String[] args) {
          int id = 99;
          Alumno alumnoUno = new Alumno (9, "pepe", "García");
          
                    
        Alumno alumnoTres = new Alumno (0, null, null);
        Alumno alumnoDos = new Alumno (12, "Javier", "Rodriguez");
        
        System.out.println("La ide de memoria es: " + id);
        
        System.out.println("Alumno 1");
        System.out.println("Su id es " + alumnoUno.getId());
        System.out.println("Su nombre es " + alumnoUno.getNombre());
        
        System.out.println("Alumno 2");
        System.out.println("Su id es " + alumnoDos.getId());
        System.out.println("Su nombre es " + alumnoDos.getNombre());
        
        System.out.println("Alumno 3");
        System.out.println("Su id es " + alumnoTres.getId());
        System.out.println("Su nombre es " + alumnoTres.getNombre());
        
        alumnoTres.setId(100);
        alumnoTres.setNombre("Alberto");
        
        System.out.println("Cambiados valores a 100 y Alberto");
        System.out.println("Su id es " + alumnoTres.getId());
        System.out.println("Su nombre es " + alumnoTres.getNombre());
            
        
    }
}
