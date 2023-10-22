package logica.mutante;
/* Creamos la clase de Aquaman, luego podremos crear tantos objetos=Aquamanes como queramos.
 */
public class Aquaman extends Superheroes implements IAgua {
    // CONSTRUCTOR
    public Aquaman(String nombre, String sexo, int peso, Boolean villano) {
        super(nombre, sexo, peso, villano);
    }

    
    //MÉTODOS e INTERFACES abstractos
    @Override
    protected void moverseSH() {
          System.out.println("Aquaman nada en el agua.");    
    }

    @Override
    public void atacarConAgua() {
        System.out.println("Aquaman ataca con agua.");
    }

    

   
    
}
