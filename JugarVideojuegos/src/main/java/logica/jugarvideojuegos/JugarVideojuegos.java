/* Ejercicio: Videojuegos
Crear una clase llamada Videojuego, que tenga como atributos:  nombre, codigo, titulo, consola,
cantidadJugadores. Añadir categoría y constructores, métodos getters y setters.
- Crear una collection ArrayList de tipo Videojuego que contenga cuatro videojuegos.
- Recorrer la ArrayList mostrando por pantalla: nombre, título, consola y cantidad de jugadores.
- Cambiar el nombre y la cantidad de jugadores de dos de los videojuegos Nintento, mostrando por pantalla todos sus datos tras el cambio.
- Recorrer la ArrayList mostrando por pantalla solo los videojuegos de la consola Nintendo.
 */

package logica.jugarvideojuegos;

import java.util.ArrayList;
import java.util.List;

public class JugarVideojuegos {

    public static void main(String[] args) {
        
            // Declaración de variables.
            List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
            Videojuego video1;
            
            //- Crear una collection ArrayList de tipo Videojuego que contenga cuatro videojuegos.
            //OPción A
            video1 = new Videojuego ("Supero Mario Bros 1", "Nintendo", "Dum 1", 101  ) ;
            listaVideojuegos.add ( video1);
            //Opción B
            listaVideojuegos.add (new Videojuego ("Supero Mario Bros 2", "WII", "Dum 2", 102  )  );
            listaVideojuegos.add (new Videojuego ("Supero Mario Bros 3", "Nintendo", "Dum 3", 103  )  );
            listaVideojuegos.add (new Videojuego ("Supero Mario Bros 4", "WII", "Dum 4", 104  )  );
        
            //- Recorrer la ArrayList mostrando por pantalla: nombre, título, consola y cantidad de jugadores.
            for ( Videojuego x:listaVideojuegos) {
                System.out.println( "Título: "  + x.getTitulo() + " - " +
                                    "Consola: " + x.getConsola() + " - " +
                                    "Nombre: "  + x.getNombre() + " - " +
                                    "Cantidad de Jugadores " +  x.getCantidadJugadores());
            }
            //- Cambiamos nombre y cantidad de jugadores de los videojuegos WII, mostrando por pantalla todos sus datos tras el cambio.
           System.out.println("** Se van a cambiar datos de los videojuegos de la WII.");
            for ( Videojuego x:listaVideojuegos) {
                if (x.getConsola()== "WII")
                {
                    x.setNombre("Monkey");
                    x.setCantidadJugadores(900);
                }
                System.out.println( "Título: "  + x.getTitulo() + " - " +
                                    "Consola: " + x.getConsola() + " - " +
                                    "Nombre: "  + x.getNombre() + " - " +
                                    "Cantidad de Jugadores " +  x.getCantidadJugadores());
            }
            //  Recorrer la ArrayList mostrando por pantalla solo los videojuegos de la consola Nintendo.
            System.out.println("**  Mostrar por pantalla solo los videojuegos de la consola Nintendo;");
            for ( Videojuego x:listaVideojuegos) {
                if (x.getConsola()== "Nintendo") // También es correcto: x.getConsoila().equals ("Nintendo")
                {               
                // OPción A.
                /* System.out.println( "Título: "  + x.getTitulo() + " - " +
                                    "Consola: " + x.getConsola() + " - " +
                                    "Nombre: "  + x.getNombre() + " - " +
                                    "Cantidad de Jugadores " +  x.getCantidadJugadores()); */
                // Opción B: toString.
                    System.out.println(x.toString());
                    
                }
            }
    }
}
