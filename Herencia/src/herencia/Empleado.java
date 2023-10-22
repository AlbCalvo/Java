package herencia;

public class Empleado extends Persona{
    String Cargo;

    public Empleado() {
    }

    public Empleado(String Cargo, int dni, String nombre) {
        super(dni, nombre);
        this.Cargo = Cargo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
    
}
