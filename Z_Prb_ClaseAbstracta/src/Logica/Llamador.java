package Logica;

public class Llamador{
        public static void main(String[] args) {
            final String nombre = "Javier";
            double importe = 10;
            
            System.out.println("nombre " + nombre + " " + importe);
            
            Cuadrado CuadradoB, CuadradoA;
            
            
            CuadradoA = new Cuadrado (2.1);
            System.out.println(" Constante K " + CuadradoA.getKk()  );
            System.out.println("--------Info de CuadradoA " );
            System.out.println(" Lado " + CuadradoA.getLado());
            CuadradoA.setLado(25);
            System.out.println(" Lado " + CuadradoA.getLado());
            System.out.println(CuadradoA.calcularArea() );
            
            CuadradoA.setLado(4);
            CuadradoA.setX(10);
            CuadradoA.setY(20);
            System.out.println("* Trabajamos con las X e Y de obj padre");
            System.out.println(" Lado " + CuadradoA.getLado());
            System.out.println(" X " + CuadradoA.getX());
            System.out.println(" Y " + CuadradoA.getY());
            
            CuadradoA.setLado(9);
            CuadradoA.setX(90);
            CuadradoA.setY(900);
            System.out.println("* Trabajamos con las X e Y de obj padre");
            System.out.println(" Lado " + CuadradoA.getLado());
            System.out.println(" X " + CuadradoA.getX());
            System.out.println(" Y " + CuadradoA.getY());
            
            /*
            CuadradoB = new Cuadrado (2, 3, 4);
            System.out.println("-------- Info de CuadradoB");
            System.out.println("lado " + CuadradoB.getLado() + " X: " + CuadradoB.getX());
            CuadradoB.setX(10);
            System.out.println("lado " + CuadradoB.getLado() + " X: " + CuadradoB.getX());
                      
            
            Ejercicio de la prueba, lo de arriba es de mi invención.
            Cuadrado  MiCuadrado  = new Cuadrado(1.1, 2.2, 3.3);
        
            System.out.println(MiCuadrado.calcularArea() );
                   
            Triangulo  MiTriangulo  = new Triangulo(0, 0.1, 0.2);
            System.out.println(MiTriangulo.calcularArea() );
            */
        }
}
