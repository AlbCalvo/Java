/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import logica.Alumno;
import logica.Examen;
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
        emf = Persistence.createEntityManagerFactory("ExamenOnlinePU");
    }
     
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Examen examen) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno alumnExamen = examen.getAlumnExamen();
            if (alumnExamen != null) {
                alumnExamen = em.getReference(alumnExamen.getClass(), alumnExamen.getId_alumno());
                examen.setAlumnExamen(alumnExamen);
            }
            em.persist(examen);
            if (alumnExamen != null) {
                alumnExamen.getListaExamenes().add(examen);
                alumnExamen = em.merge(alumnExamen);
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
            Examen persistentExamen = em.find(Examen.class, examen.getId_Examen());
            Alumno alumnExamenOld = persistentExamen.getAlumnExamen();
            Alumno alumnExamenNew = examen.getAlumnExamen();
            if (alumnExamenNew != null) {
                alumnExamenNew = em.getReference(alumnExamenNew.getClass(), alumnExamenNew.getId_alumno());
                examen.setAlumnExamen(alumnExamenNew);
            }
            examen = em.merge(examen);
            if (alumnExamenOld != null && !alumnExamenOld.equals(alumnExamenNew)) {
                alumnExamenOld.getListaExamenes().remove(examen);
                alumnExamenOld = em.merge(alumnExamenOld);
            }
            if (alumnExamenNew != null && !alumnExamenNew.equals(alumnExamenOld)) {
                alumnExamenNew.getListaExamenes().add(examen);
                alumnExamenNew = em.merge(alumnExamenNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = examen.getId_Examen();
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
                examen.getId_Examen();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The examen with id " + id + " no longer exists.", enfe);
            }
            Alumno alumnExamen = examen.getAlumnExamen();
            if (alumnExamen != null) {
                alumnExamen.getListaExamenes().remove(examen);
                alumnExamen = em.merge(alumnExamen);
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
