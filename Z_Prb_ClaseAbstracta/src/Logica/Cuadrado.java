package Logica;

public class Cuadrado extends PrbClaseAbstracta{
    // Atributos    
    private double lado = 0;
    
    
    // Constructores
    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    // Getter and setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getKk() {
        return kk;
    }
    
    
    
    // Método abstracto
    @Override
    public String calcularArea() {
        lado = 99;
         System.out.println("calcularArea del cuadrado " + lado);
         return "Función calcularArea del CUADRADO 99 sí ejecutada";
        }
}
