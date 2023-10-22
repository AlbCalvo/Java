package logica.relacionesentreclases;

public class Propietario {
    //Atributos.
    private Long id;
    private String nombre;
    private String apellido;
    
    //Constructor.

     public Propietario() {
    }
    
    public Propietario(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Getter y Setter.

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

   
}
