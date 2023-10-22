package Logica;

public abstract class PrbClaseAbstracta {

protected double x;
protected double y;
protected final int kk = 88;

// Constructores
    public PrbClaseAbstracta(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public PrbClaseAbstracta() {
    }
 // Método abstracto       
    public abstract String calcularArea(); 
}
