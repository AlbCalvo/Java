package conversionddatos.logica;


public class ConversionDDatos {

    public static void main(String[] args) {
        
        // Double -> (Int y long)
        double numDoble = 1.5;
        int numInt = (int) numDoble; // Double -> int
        long numLong = (long) numDoble; // Double -> int long
        
        System.out.println("double " + numDoble);
        System.out.println("int " + numInt);  // Trunca
        System.out.println("long " + numLong); // Trunca
        
        // Operaciones con valores con tipo String. 
        String cantidad = "20";
        String precio = "150";
        // error si hacemos est: int sumaCantidadYPrecio = cantidad + precio;
        
        int cantidadInt = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor de la suma es: " + (cantidadInt + precioDouble) );
        
        // De int -> String
        int edad = 20;
        double altura = 1.90;
        
        String edadStr = String.valueOf(edad);
        String alturaStr = String.valueOf(altura);
        
        System.out.println("Edad " + edadStr + " Altura :" + alturaStr);
        
    }
}
