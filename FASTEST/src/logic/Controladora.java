package logic;
import java.util.LinkedList;
import java.util.List;
import persistencia.CtrlPersistencia;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Controladora {
    CtrlPersistencia ctrlPersis = new CtrlPersistencia();
    // **************** Bdd Config
       
    public Config buscaBddConfig() {
       return ctrlPersis.buscaBddConfig();
    }
    
    //***************** Procedimientos compartidos
    
     public void mostrarAviso(String titulo, String msg, String tipoAviso) {
        JOptionPane optionPane = new JOptionPane(titulo);
        if (tipoAviso.equals ("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (tipoAviso.equals ("Error")){
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
            }
        JDialog dialog = optionPane.createDialog(msg);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    public List<Cuestionario> buscaListaPreguntasBdd() {
        return ctrlPersis.buscaListaPreguntasBdd();
    } 
    // ******************* CUESTIONARIO
    
    public List<Cuestionario> volcadoCuestionarioAMemoria(Config configBddPont, List<Cuestionario> listaCuePont) {
       List<Cuestionario> listaCueRdo = new LinkedList<Cuestionario>();           //Contendrá SOLO los que coincidan con el filtro del file CONFIG.
        int i = 1; // ntx
                 
        for ( Cuestionario y : listaCuePont) {
            if (configBddPont.getConfigIdeExaCue() == y.getCueIdeExaCue()){
                 listaCueRdo.add (0, y);
            }
        }
        return listaCueRdo;
    }

    public void crearAlumnoBdd(Alumno aluAGrabar)  {
        ctrlPersis.crearAlumnoBdd(aluAGrabar);
    }

    public void crearCuestionarios(Cuestionario cueAGrabar) throws Exception {
        ctrlPersis.crearCuestionarios(cueAGrabar);
    }

    public void crearExamen(Examen exaAGrabar) {
        ctrlPersis.crearExamen(exaAGrabar);
    }

    public void buscarEnBddAlumno() {
        ctrlPersis.buscarEnBddAlumno();
    }

    
    

}

   
