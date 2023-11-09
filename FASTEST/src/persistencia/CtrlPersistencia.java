package persistencia;

import static igu.ScrPpal.idAlumnoFastest;
import java.util.List;
import logic.Alumno;
import logic.Config;
import logic.Config;
import logic.Cuestionario;
import logic.Examen;
import persistencia.AlumnoJpaController;
import persistencia.ConfigJpaController;
import persistencia.CuestionarioJpaController;
import persistencia.ExamenJpaController;

public class CtrlPersistencia {
    ConfigJpaController conJpa       = new ConfigJpaController();
    AlumnoJpaController aluJpa       = new AlumnoJpaController();
    CuestionarioJpaController cueJpa = new CuestionarioJpaController();
    ExamenJpaController exaJpa       = new ExamenJpaController();
    
    
    // Tabla CONFIG *********************************************
    
    public Config buscaBddConfig() {
        //Buscar el registro con la info del examen que vamos a hacer,
        // en la tabla solo existirá un registro.
        return conJpa.findConfig(100);
    }

    public List<Cuestionario> buscaListaPreguntasBdd() {
        return cueJpa.findCuestionarioEntities();
   }
    // CUESTIONARIO ***************************************************
    public List<Cuestionario> volcadoCuestionarioAMemoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // ALUMNO ***************************************************

    public void crearAlumnoBdd(Alumno aluAGrabar) {
        aluJpa.create(aluAGrabar);
    }

    public void crearCuestionarios(Cuestionario cueAGrabar) throws Exception {
        cueJpa.create(cueAGrabar);
    }

    public void crearExamen(Examen exaAGrabar) {
        exaJpa.create(exaAGrabar);
    }

    public void buscarEnBddAlumno() {
        aluJpa.findAlumno(idAlumnoFastest);
    }
    
    
}
