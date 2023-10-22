package logica.relacionesentreclases;

import java.util.List;

public class Auto {
    //Atributos.
    private Long id;
    private String marca;
    private String modelo;
 //   private Propietario prop; // Declarado para relación 1a1.
    private List<Propietario> variosPropietarios;
    
    //Constructor.
    public Auto() {
      }

    public Auto(Long id, String marca, String modelo, List<Propietario> variosPropietarios) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.variosPropietarios = variosPropietarios;
    }
   
    //Getter y Setter.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public List<Propietario> getListaPropietarios() {
        return variosPropietarios;
    }

    public void setListaPropietarios(List<Propietario> variosPropietarios) {
        this.variosPropietarios = variosPropietarios;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", variosPropietarios=" + variosPropietarios + '}';
    }

}
