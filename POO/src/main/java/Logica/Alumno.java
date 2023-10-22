package Logica;

/* Creación de la clase ALUMNO. */

public class Alumno {
    /* ATRIBUTROS; Características de la clase Alumno   */
    int id;
    String nombre;
    String apellido;
    
    /* Método CONSTRUCTOR: Métodos que crean objetos */
    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
        
    /* Getter & Setter (Considerados métodos): 
       -I/O por cada uno de los atributos. 
       -Se colocan antes de los métodos, o detrás pero siempre tras
       los constructores */
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /* MÉTODOS; Acciones que podrá hacer el objeto Alumno.
   - public: Modificador de acceso
   - Void:   Tipo de dato, void no retorna valor    */
    public void mostrarNombre() {
        System.out.println ("Hola soy un alumno y sé decir mi nombre");
    }
    public void saberAprobado (double calificacion) {
        if (calificacion >=6 ) {
            System.out.println("Aprobé la materia");
        } else {
            System.out.println("Uy no aprobé");
        }
    }
    
    
    
    
    

}
