package logica.mutante;
/* Creamos la clase de Tormenta, luego podremos crear tantos objetos=Tormenta como queramos.
 */
public class tormenta extends Superheroes implements IAire {
    //CONSTRUCTOR
    public tormenta(String nombre, String sexo, int peso, Boolean villano) {
        super(nombre, sexo, peso, villano);
    }

    //MÉTODOS e INTERFACES abstractos
    @Override
    protected void moverseSH() {
        System.out.println("Tormenta vuela por el aire."); 
    }

    @Override
    public void atacarConAire() {
        System.out.println("Tormenta ataca con el aire."); 
    }
    
}
