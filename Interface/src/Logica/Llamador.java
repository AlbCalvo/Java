package Logica;

public class Llamador{
        public static void main(String[] args) {
            Cuadrado figCuadrado;
            Circulo figCirculo;
            
            figCirculo = new Circulo(2); // Pasamos por parámetro el radio del círculo.
            System.out.println(" El área del círculo es: " + figCirculo.calcularArea());
            
            
            
            System.out.println("---------------------- Tratamiento del cuadrado");
            figCuadrado = new Cuadrado(2);
            System.out.println("-- Valor de la constante Pi: " + figCuadrado.getPi() );
            System.out.println("tamaño del área " + figCuadrado.calcularArea());
            figCuadrado.setLado(4);
            System.out.println(figCuadrado.getLado()+" tamaño del área " + figCuadrado.calcularArea());
            
            
            
            
            
        }
}
