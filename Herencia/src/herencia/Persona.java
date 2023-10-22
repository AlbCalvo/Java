package herencia;


public class Persona {
    int dni;
    String nombre;
       
     // Dos CONSTRUCTORES, uno vacío y otro con datos
     public Persona(){
    }
    
    public Persona(int dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;
    }
    // GETTER AND SETTER
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    }

