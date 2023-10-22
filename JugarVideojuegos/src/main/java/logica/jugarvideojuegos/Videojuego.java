/* Ejercicio: Videojuegos
Crear una clase llamada Videojuego, que tenga como atributos:  nombre, codigo, titulo, consola,
cantidadJugadores, categoría y constructores, métodos getters y setters.
- Crear una collection ArrayList de tipo Videojuego que contenga cuatro videojuegos.
- Recorrer la ArrayList mostrando por pantalla: nombre, título, consola y cantidad de jugadores.
- Cambiar el nombre y la cantidad de jugadores de dos de los videojuegos, mostrando por pantalla todos sus datos tras el cambio.
- Recorrer la ArrayList mostrando por pantalla solo los videojuegos de la consola Nintendo.
  */
package logica.jugarvideojuegos;

public class Videojuego {
    //ATRIBUTOS..
    protected String titulo;
    protected String consola;
    protected String nombre;
    protected int cantidadJugadores;

    //CONSTRUCTORES.
    public Videojuego() {
            }
    public Videojuego(String titulo, String consola, String nombre, int cantidadJugadores) {
        this.titulo = titulo;
        this.consola = consola;
        this.nombre = nombre;
        this.cantidadJugadores = cantidadJugadores;
    }
    //GETTER Y SETTER.

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }

    public void setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "titulo=" + titulo + ", consola=" + consola + ", nombre=" + nombre + ", cantidadJugadores=" + cantidadJugadores + '}';
    }
    
    
}
