package logica.mutante;
/* Creamos la clase de hombre de hielo, luego podremos crear tantos objetos=hombres de hielo como queramos.
 */
public class hombreDHielo extends Superheroes implements IAgua {

    // CONSTRUCTOR
    public hombreDHielo(String nombre, String sexo, int peso, Boolean villano) {
        super(nombre, sexo, peso, villano);
    }

    //MÉTODOS e INTERFACES abstractos
    @Override
    protected void moverseSH() {
     System.out.println("El hombre de hielo se desliza sobre agua congelada.");    
    }

    @Override
    public void atacarConAgua() {
           System.out.println("El hombre de hielo ataca con agua");    
    }

    
}
