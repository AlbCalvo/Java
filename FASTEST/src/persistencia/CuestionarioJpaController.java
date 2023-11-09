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
import logic.Cuestionario;
import logic.Examen;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author acmmi
 */
public class CuestionarioJpaController implements Serializable {

    public CuestionarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
     public CuestionarioJpaController() {
        emf = Persistence.createEntityManagerFactory("FASTESTPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cuestionario cuestionario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Examen examCuestionario = cuestionario.getExamCuestionario();
            if (examCuestionario != null) {
                examCuestionario = em.getReference(examCuestionario.getClass(), examCuestionario.getId_Exa());
                cuestionario.setExamCuestionario(examCuestionario);
            }
            em.persist(cuestionario);
            if (examCuestionario != null) {
                examCuestionario.getListaCuestionarioRdo().add(cuestionario);
                examCuestionario = em.merge(examCuestionario);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findCuestionario(cuestionario.getId_cue()) != null) {
                throw new PreexistingEntityException("Cuestionario " + cuestionario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cuestionario cuestionario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cuestionario persistentCuestionario = em.find(Cuestionario.class, cuestionario.getId_cue());
            Examen examCuestionarioOld = persistentCuestionario.getExamCuestionario();
            Examen examCuestionarioNew = cuestionario.getExamCuestionario();
            if (examCuestionarioNew != null) {
                examCuestionarioNew = em.getReference(examCuestionarioNew.getClass(), examCuestionarioNew.getId_Exa());
                cuestionario.setExamCuestionario(examCuestionarioNew);
            }
            cuestionario = em.merge(cuestionario);
            if (examCuestionarioOld != null && !examCuestionarioOld.equals(examCuestionarioNew)) {
                examCuestionarioOld.getListaCuestionarioRdo().remove(cuestionario);
                examCuestionarioOld = em.merge(examCuestionarioOld);
            }
            if (examCuestionarioNew != null && !examCuestionarioNew.equals(examCuestionarioOld)) {
                examCuestionarioNew.getListaCuestionarioRdo().add(cuestionario);
                examCuestionarioNew = em.merge(examCuestionarioNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cuestionario.getId_cue();
                if (findCuestionario(id) == null) {
                    throw new NonexistentEntityException("The cuestionario with id " + id + " no longer exists.");
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
            Cuestionario cuestionario;
            try {
                cuestionario = em.getReference(Cuestionario.class, id);
                cuestionario.getId_cue();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cuestionario with id " + id + " no longer exists.", enfe);
            }
            Examen examCuestionario = cuestionario.getExamCuestionario();
            if (examCuestionario != null) {
                examCuestionario.getListaCuestionarioRdo().remove(cuestionario);
                examCuestionario = em.merge(examCuestionario);
            }
            em.remove(cuestionario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cuestionario> findCuestionarioEntities() {
        return findCuestionarioEntities(true, -1, -1);
    }

    public List<Cuestionario> findCuestionarioEntities(int maxResults, int firstResult) {
        return findCuestionarioEntities(false, maxResults, firstResult);
    }

    private List<Cuestionario> findCuestionarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cuestionario.class));
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

    public Cuestionario findCuestionario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cuestionario.class, id);
        } finally {
            em.close();
        }
    }

    public int getCuestionarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cuestionario> rt = cq.from(Cuestionario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

   
    
    
}
