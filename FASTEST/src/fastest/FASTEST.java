/*  El alumno pueda hacer exámenes en un dispositivo móvil y, de forma automática,  
    en el menor tiempo posible disponer de los resultados.
*/
package fastest;

import igu.ScrPpal;
import igu.ScrTest;
import static java.awt.Frame.MAXIMIZED_BOTH;
import logic.Alumno;

/** 
 *
 * @author acmmi
 */
public class FASTEST {

    public static void main(String[] args) {
        
        //Abrir pantalla ppal, centrada en medio
        
        ScrPpal PantallaPpal = new ScrPpal();
        PantallaPpal.setExtendedState(MAXIMIZED_BOTH);
        PantallaPpal.setVisible(true);
        /*
        ScrTest PantallaPpal = new ScrTest();
        PantallaPpal.setExtendedState(MAXIMIZED_BOTH);
        PantallaPpal.setVisible(true); 
        */
        //PantallaPpal.setLocationRelativeTo(null);
        
        
    }
    
}
