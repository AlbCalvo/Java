package Logica;

public class Triangulo extends PrbClaseAbstracta{
    private double lado = 0;

    public Triangulo(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public String calcularArea() {
        lado = 999;
         System.out.println("calcularArea del Triangulo " + lado);
         return "Exe calcularArea del TRIANGULO 999";
        }

    public double getLado() {
        return lado;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}


