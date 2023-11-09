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
import logic.Examen;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logic.Alumno;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author acmmi
 */
public class AlumnoJpaController implements Serializable {

    public AlumnoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public AlumnoJpaController() {
        emf = Persistence.createEntityManagerFactory("FASTESTPU");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Alumno alumno) {
        if (alumno.getListaExamenesAlumno() == null) {
            alumno.setListaExamenesAlumno(new LinkedList<Examen>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkedList<Examen> attachedListaExamenesAlumno = new LinkedList<Examen>();
            for (Examen listaExamenesAlumnoExamenToAttach : alumno.getListaExamenesAlumno()) {
                listaExamenesAlumnoExamenToAttach = em.getReference(listaExamenesAlumnoExamenToAttach.getClass(), listaExamenesAlumnoExamenToAttach.getId_Exa());
                attachedListaExamenesAlumno.add(listaExamenesAlumnoExamenToAttach);
            }
            alumno.setListaExamenesAlumno(attachedListaExamenesAlumno);
            em.persist(alumno);
            for (Examen listaExamenesAlumnoExamen : alumno.getListaExamenesAlumno()) {
                Alumno oldExamenAlumnoOfListaExamenesAlumnoExamen = listaExamenesAlumnoExamen.getExamenAlumno();
                listaExamenesAlumnoExamen.setExamenAlumno(alumno);
                listaExamenesAlumnoExamen = em.merge(listaExamenesAlumnoExamen);
                if (oldExamenAlumnoOfListaExamenesAlumnoExamen != null) {
                    oldExamenAlumnoOfListaExamenesAlumnoExamen.getListaExamenesAlumno().remove(listaExamenesAlumnoExamen);
                    oldExamenAlumnoOfListaExamenesAlumnoExamen = em.merge(oldExamenAlumnoOfListaExamenesAlumnoExamen);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Alumno alumno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno persistentAlumno = em.find(Alumno.class, alumno.getId_Alu());
            LinkedList<Examen> listaExamenesAlumnoOld = persistentAlumno.getListaExamenesAlumno();
            LinkedList<Examen> listaExamenesAlumnoNew = alumno.getListaExamenesAlumno();
            LinkedList<Examen> attachedListaExamenesAlumnoNew = new LinkedList<Examen>();
            for (Examen listaExamenesAlumnoNewExamenToAttach : listaExamenesAlumnoNew) {
                listaExamenesAlumnoNewExamenToAttach = em.getReference(listaExamenesAlumnoNewExamenToAttach.getClass(), listaExamenesAlumnoNewExamenToAttach.getId_Exa());
                attachedListaExamenesAlumnoNew.add(listaExamenesAlumnoNewExamenToAttach);
            }
            listaExamenesAlumnoNew = attachedListaExamenesAlumnoNew;
            alumno.setListaExamenesAlumno(listaExamenesAlumnoNew);
            alumno = em.merge(alumno);
            for (Examen listaExamenesAlumnoOldExamen : listaExamenesAlumnoOld) {
                if (!listaExamenesAlumnoNew.contains(listaExamenesAlumnoOldExamen)) {
                    listaExamenesAlumnoOldExamen.setExamenAlumno(null);
                    listaExamenesAlumnoOldExamen = em.merge(listaExamenesAlumnoOldExamen);
                }
            }
            for (Examen listaExamenesAlumnoNewExamen : listaExamenesAlumnoNew) {
                if (!listaExamenesAlumnoOld.contains(listaExamenesAlumnoNewExamen)) {
                    Alumno oldExamenAlumnoOfListaExamenesAlumnoNewExamen = listaExamenesAlumnoNewExamen.getExamenAlumno();
                    listaExamenesAlumnoNewExamen.setExamenAlumno(alumno);
                    listaExamenesAlumnoNewExamen = em.merge(listaExamenesAlumnoNewExamen);
                    if (oldExamenAlumnoOfListaExamenesAlumnoNewExamen != null && !oldExamenAlumnoOfListaExamenesAlumnoNewExamen.equals(alumno)) {
                        oldExamenAlumnoOfListaExamenesAlumnoNewExamen.getListaExamenesAlumno().remove(listaExamenesAlumnoNewExamen);
                        oldExamenAlumnoOfListaExamenesAlumnoNewExamen = em.merge(oldExamenAlumnoOfListaExamenesAlumnoNewExamen);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alumno.getId_Alu();
                if (findAlumno(id) == null) {
                    throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.");
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
            Alumno alumno;
            try {
                alumno = em.getReference(Alumno.class, id);
                alumno.getId_Alu();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.", enfe);
            }
            LinkedList<Examen> listaExamenesAlumno = alumno.getListaExamenesAlumno();
            for (Examen listaExamenesAlumnoExamen : listaExamenesAlumno) {
                listaExamenesAlumnoExamen.setExamenAlumno(null);
                listaExamenesAlumnoExamen = em.merge(listaExamenesAlumnoExamen);
            }
            em.remove(alumno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Alumno> findAlumnoEntities() {
        return findAlumnoEntities(true, -1, -1);
    }

    public List<Alumno> findAlumnoEntities(int maxResults, int firstResult) {
        return findAlumnoEntities(false, maxResults, firstResult);
    }

    private List<Alumno> findAlumnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Alumno.class));
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

    public Alumno findAlumno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Alumno.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlumnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Alumno> rt = cq.from(Alumno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
