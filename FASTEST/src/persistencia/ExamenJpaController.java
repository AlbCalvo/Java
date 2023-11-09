/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logic.Alumno;
import logic.Cuestionario;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Examen;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author acmmi
 */
public class ExamenJpaController implements Serializable {

    public ExamenJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

     public ExamenJpaController() {
        emf = Persistence.createEntityManagerFactory("FASTESTPU");
    }
     
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Examen examen) {
        if (examen.getListaCuestionarioRdo() == null) {
            examen.setListaCuestionarioRdo(new LinkedList<Cuestionario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno examenAlumno = examen.getExamenAlumno();
            if (examenAlumno != null) {
                examenAlumno = em.getReference(examenAlumno.getClass(), examenAlumno.getId_Alu());
                examen.setExamenAlumno(examenAlumno);
            }
            LinkedList<Cuestionario> attachedListaCuestionarioRdo = new LinkedList<Cuestionario>();
            for (Cuestionario listaCuestionarioRdoCuestionarioToAttach : examen.getListaCuestionarioRdo()) {
                listaCuestionarioRdoCuestionarioToAttach = em.getReference(listaCuestionarioRdoCuestionarioToAttach.getClass(), listaCuestionarioRdoCuestionarioToAttach.getId_cue());
                attachedListaCuestionarioRdo.add(listaCuestionarioRdoCuestionarioToAttach);
            }
            examen.setListaCuestionarioRdo(attachedListaCuestionarioRdo);
            em.persist(examen);
            if (examenAlumno != null) {
                examenAlumno.getListaExamenesAlumno().add(examen);
                examenAlumno = em.merge(examenAlumno);
            }
            for (Cuestionario listaCuestionarioRdoCuestionario : examen.getListaCuestionarioRdo()) {
                Examen oldExamCuestionarioOfListaCuestionarioRdoCuestionario = listaCuestionarioRdoCuestionario.getExamCuestionario();
                listaCuestionarioRdoCuestionario.setExamCuestionario(examen);
                listaCuestionarioRdoCuestionario = em.merge(listaCuestionarioRdoCuestionario);
                if (oldExamCuestionarioOfListaCuestionarioRdoCuestionario != null) {
                    oldExamCuestionarioOfListaCuestionarioRdoCuestionario.getListaCuestionarioRdo().remove(listaCuestionarioRdoCuestionario);
                    oldExamCuestionarioOfListaCuestionarioRdoCuestionario = em.merge(oldExamCuestionarioOfListaCuestionarioRdoCuestionario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Examen examen) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Examen persistentExamen = em.find(Examen.class, examen.getId_Exa());
            Alumno examenAlumnoOld = persistentExamen.getExamenAlumno();
            Alumno examenAlumnoNew = examen.getExamenAlumno();
            LinkedList<Cuestionario> listaCuestionarioRdoOld = persistentExamen.getListaCuestionarioRdo();
            LinkedList<Cuestionario> listaCuestionarioRdoNew = examen.getListaCuestionarioRdo();
            if (examenAlumnoNew != null) {
                examenAlumnoNew = em.getReference(examenAlumnoNew.getClass(), examenAlumnoNew.getId_Alu());
                examen.setExamenAlumno(examenAlumnoNew);
            }
            LinkedList<Cuestionario> attachedListaCuestionarioRdoNew = new LinkedList<Cuestionario>();
            for (Cuestionario listaCuestionarioRdoNewCuestionarioToAttach : listaCuestionarioRdoNew) {
                listaCuestionarioRdoNewCuestionarioToAttach = em.getReference(listaCuestionarioRdoNewCuestionarioToAttach.getClass(), listaCuestionarioRdoNewCuestionarioToAttach.getId_cue());
                attachedListaCuestionarioRdoNew.add(listaCuestionarioRdoNewCuestionarioToAttach);
            }
            listaCuestionarioRdoNew = attachedListaCuestionarioRdoNew;
            examen.setListaCuestionarioRdo(listaCuestionarioRdoNew);
            examen = em.merge(examen);
            if (examenAlumnoOld != null && !examenAlumnoOld.equals(examenAlumnoNew)) {
                examenAlumnoOld.getListaExamenesAlumno().remove(examen);
                examenAlumnoOld = em.merge(examenAlumnoOld);
            }
            if (examenAlumnoNew != null && !examenAlumnoNew.equals(examenAlumnoOld)) {
                examenAlumnoNew.getListaExamenesAlumno().add(examen);
                examenAlumnoNew = em.merge(examenAlumnoNew);
            }
            for (Cuestionario listaCuestionarioRdoOldCuestionario : listaCuestionarioRdoOld) {
                if (!listaCuestionarioRdoNew.contains(listaCuestionarioRdoOldCuestionario)) {
                    listaCuestionarioRdoOldCuestionario.setExamCuestionario(null);
                    listaCuestionarioRdoOldCuestionario = em.merge(listaCuestionarioRdoOldCuestionario);
                }
            }
            for (Cuestionario listaCuestionarioRdoNewCuestionario : listaCuestionarioRdoNew) {
                if (!listaCuestionarioRdoOld.contains(listaCuestionarioRdoNewCuestionario)) {
                    Examen oldExamCuestionarioOfListaCuestionarioRdoNewCuestionario = listaCuestionarioRdoNewCuestionario.getExamCuestionario();
                    listaCuestionarioRdoNewCuestionario.setExamCuestionario(examen);
                    listaCuestionarioRdoNewCuestionario = em.merge(listaCuestionarioRdoNewCuestionario);
                    if (oldExamCuestionarioOfListaCuestionarioRdoNewCuestionario != null && !oldExamCuestionarioOfListaCuestionarioRdoNewCuestionario.equals(examen)) {
                        oldExamCuestionarioOfListaCuestionarioRdoNewCuestionario.getListaCuestionarioRdo().remove(listaCuestionarioRdoNewCuestionario);
                        oldExamCuestionarioOfListaCuestionarioRdoNewCuestionario = em.merge(oldExamCuestionarioOfListaCuestionarioRdoNewCuestionario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = examen.getId_Exa();
                if (findExamen(id) == null) {
                    throw new NonexistentEntityException("The examen with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Examen examen;
            try {
                examen = em.getReference(Examen.class, id);
                examen.getId_Exa();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The examen with id " + id + " no longer exists.", enfe);
            }
            Alumno examenAlumno = examen.getExamenAlumno();
            if (examenAlumno != null) {
                examenAlumno.getListaExamenesAlumno().remove(examen);
                examenAlumno = em.merge(examenAlumno);
            }
            LinkedList<Cuestionario> listaCuestionarioRdo = examen.getListaCuestionarioRdo();
            for (Cuestionario listaCuestionarioRdoCuestionario : listaCuestionarioRdo) {
                listaCuestionarioRdoCuestionario.setExamCuestionario(null);
                listaCuestionarioRdoCuestionario = em.merge(listaCuestionarioRdoCuestionario);
            }
            em.remove(examen);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Examen> findExamenEntities() {
        return findExamenEntities(true, -1, -1);
    }

    public List<Examen> findExamenEntities(int maxResults, int firstResult) {
        return findExamenEntities(false, maxResults, firstResult);
    }

    private List<Examen> findExamenEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Examen.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Examen findExamen(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Examen.class, id);
        } finally {
            em.close();
        }
    }

    public int getExamenCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Examen> rt = cq.from(Examen.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
