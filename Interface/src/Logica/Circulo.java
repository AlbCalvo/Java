package Logica;

public class Circulo implements Figura, Rotable, Dibujable {
    // Atributo
    private double radio;
    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    //Getter and setter
    public double getRadio() {
        return radio;
    }

    public static double getPi() {
        return pi;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    // Método abstracto
    @Override
    public double calcularArea() {
        double rdo = pi * radio * radio;
        return rdo;
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un círculo");
        }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un círculo");
        }

    
    
    
    
}
