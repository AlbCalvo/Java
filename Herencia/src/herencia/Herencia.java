package herencia;
/* La clase Herencia contendrá el main de ejecución.
La clase Persona: Será la Clase madre con dos atributos, dni y nombre.
La clase Empleado: Contendrá los atributos heredados de su clase madre, más el suyo 'Cargo'.
La clase Consultor: Contendrá los atributos heredados de su clase madre, más el suyo 'CargoConsultor'.
*/
public class Herencia {
  
    public static void main(String[] args) {
       
        Empleado emple = new Empleado();
        
        emple.setDni(1000001);
        emple.setNombre("Empleado1_Nombre");
        emple.setCargo("Es un empleado");
        
        Consultor consultor = new Consultor();
        
        consultor.setDni(900009);
        consultor.setNombre("Consultor1_nombre");
        consultor.setCargoConsultor("cargo de consultor");
                
        System.out.println(" Datos del empleado; Dni " + emple.getDni() + " Nombre " + 
                emple.getNombre() + " Cargo " + emple.getCargo() );
        
        System.out.println(" Datos del Consultor; Dni " + consultor.getDni() + " Nombre " + 
                consultor.getNombre() + " Cargo " + consultor.getCargoConsultor());
            
    }
    
}
