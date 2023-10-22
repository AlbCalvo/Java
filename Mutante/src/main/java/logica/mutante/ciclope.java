package logica.mutante;
/* Creamos la clase de Cíclope, luego podremos crear tantos objetos=Cíclopes como queramos.
 */
public class ciclope extends Superheroes implements IFuego {
    
    //CONSTRUCTOR
    public ciclope(String nombre, String sexo, int peso, Boolean villano) {
        super(nombre, sexo, peso, villano);
    }

    
    //MÉTODOS e INTERFACES abstractos
    @Override
    protected void moverseSH() {
        System.out.println("Cíclope corre por la tierra.");   
    }

    @Override
    public void atacarConFuego() {
        System.out.println("Cíclope ataca sacando ratyos por los ojos.");   
    }
    
}
