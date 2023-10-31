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
import logica.Examen;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Alumno;
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
        emf = Persistence.createEntityManagerFactory("ExamenOnlinePU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Alumno alumno) {
        if (alumno.getListaExamenes() == null) {
            alumno.setListaExamenes(new LinkedList<Examen>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkedList<Examen> attachedListaExamenes = new LinkedList<Examen>();
            for (Examen listaExamenesExamenToAttach : alumno.getListaExamenes()) {
                listaExamenesExamenToAttach = em.getReference(listaExamenesExamenToAttach.getClass(), listaExamenesExamenToAttach.getId_Examen());
                attachedListaExamenes.add(listaExamenesExamenToAttach);
            }
            alumno.setListaExamenes(attachedListaExamenes);
            em.persist(alumno);
            for (Examen listaExamenesExamen : alumno.getListaExamenes()) {
                Alumno oldAlumnExamenOfListaExamenesExamen = listaExamenesExamen.getAlumnExamen();
                listaExamenesExamen.setAlumnExamen(alumno);
                listaExamenesExamen = em.merge(listaExamenesExamen);
                if (oldAlumnExamenOfListaExamenesExamen != null) {
                    oldAlumnExamenOfListaExamenesExamen.getListaExamenes().remove(listaExamenesExamen);
                    oldAlumnExamenOfListaExamenesExamen = em.merge(oldAlumnExamenOfListaExamenesExamen);
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
            Alumno persistentAlumno = em.find(Alumno.class, alumno.getId_alumno());
            LinkedList<Examen> listaExamenesOld = persistentAlumno.getListaExamenes();
            LinkedList<Examen> listaExamenesNew = alumno.getListaExamenes();
            LinkedList<Examen> attachedListaExamenesNew = new LinkedList<Examen>();
            for (Examen listaExamenesNewExamenToAttach : listaExamenesNew) {
                listaExamenesNewExamenToAttach = em.getReference(listaExamenesNewExamenToAttach.getClass(), listaExamenesNewExamenToAttach.getId_Examen());
                attachedListaExamenesNew.add(listaExamenesNewExamenToAttach);
            }
            listaExamenesNew = attachedListaExamenesNew;
            alumno.setListaExamenes(listaExamenesNew);
            alumno = em.merge(alumno);
            for (Examen listaExamenesOldExamen : listaExamenesOld) {
                if (!listaExamenesNew.contains(listaExamenesOldExamen)) {
                    listaExamenesOldExamen.setAlumnExamen(null);
                    listaExamenesOldExamen = em.merge(listaExamenesOldExamen);
                }
            }
            for (Examen listaExamenesNewExamen : listaExamenesNew) {
                if (!listaExamenesOld.contains(listaExamenesNewExamen)) {
                    Alumno oldAlumnExamenOfListaExamenesNewExamen = listaExamenesNewExamen.getAlumnExamen();
                    listaExamenesNewExamen.setAlumnExamen(alumno);
                    listaExamenesNewExamen = em.merge(listaExamenesNewExamen);
                    if (oldAlumnExamenOfListaExamenesNewExamen != null && !oldAlumnExamenOfListaExamenesNewExamen.equals(alumno)) {
                        oldAlumnExamenOfListaExamenesNewExamen.getListaExamenes().remove(listaExamenesNewExamen);
                        oldAlumnExamenOfListaExamenesNewExamen = em.merge(oldAlumnExamenOfListaExamenesNewExamen);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alumno.getId_alumno();
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
                alumno.getId_alumno();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.", enfe);
            }
            LinkedList<Examen> listaExamenes = alumno.getListaExamenes();
            for (Examen listaExamenesExamen : listaExamenes) {
                listaExamenesExamen.setAlumnExamen(null);
                listaExamenesExamen = em.merge(listaExamenesExamen);
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
