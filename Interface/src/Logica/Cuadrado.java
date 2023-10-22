package Logica;

public class Cuadrado implements Figura, Dibujable{
    // Atributos    
    private double lado;
    //Constructor

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //Getter and setter

    public double getLado() {
        return lado;
    }

    public static double getPi() {
        return pi;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    //Método abstracto.
    @Override
    public double calcularArea() {
        double rdo = lado * lado;
        return rdo;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un cuadrado");
    }
    
    
}
    

    
    
    
    