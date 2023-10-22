package herencia;

public class Consultor extends Persona{
    String CargoConsultor;

    public Consultor() {
    }

    public Consultor(String CargoConsultor, int dni, String nombre) {
        super(dni, nombre);
        this.CargoConsultor = CargoConsultor;
    }

    public String getCargoConsultor() {
        return CargoConsultor;
    }

    public void setCargoConsultor(String CargoConsultor) {
        this.CargoConsultor = CargoConsultor;
    }

 
    
    
}
