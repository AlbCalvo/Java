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
import logica.Asignatura;
import logica.UF;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author acmmi
 */
public class UFJpaController implements Serializable {

    public UFJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
     public UFJpaController () {
          emf = Persistence.createEntityManagerFactory("ORMSqlPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(UF UF) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Asignatura asigClaveForanea = UF.getAsigClaveForanea();
            if (asigClaveForanea != null) {
                asigClaveForanea = em.getReference(asigClaveForanea.getClass(), asigClaveForanea.getId());
                UF.setAsigClaveForanea(asigClaveForanea);
            }
            em.persist(UF);
            if (asigClaveForanea != null) {
                asigClaveForanea.getListaUFS().add(UF);
                asigClaveForanea = em.merge(asigClaveForanea);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(UF UF) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            UF persistentUF = em.find(UF.class, UF.getI());
            Asignatura asigClaveForaneaOld = persistentUF.getAsigClaveForanea();
            Asignatura asigClaveForaneaNew = UF.getAsigClaveForanea();
            if (asigClaveForaneaNew != null) {
                asigClaveForaneaNew = em.getReference(asigClaveForaneaNew.getClass(), asigClaveForaneaNew.getId());
                UF.setAsigClaveForanea(asigClaveForaneaNew);
            }
            UF = em.merge(UF);
            if (asigClaveForaneaOld != null && !asigClaveForaneaOld.equals(asigClaveForaneaNew)) {
                asigClaveForaneaOld.getListaUFS().remove(UF);
                asigClaveForaneaOld = em.merge(asigClaveForaneaOld);
            }
            if (asigClaveForaneaNew != null && !asigClaveForaneaNew.equals(asigClaveForaneaOld)) {
                asigClaveForaneaNew.getListaUFS().add(UF);
                asigClaveForaneaNew = em.merge(asigClaveForaneaNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = UF.getI();
                if (findUF(id) == null) {
                    throw new NonexistentEntityException("The uF with id " + id + " no longer exists.");
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
            UF UF;
            try {
                UF = em.getReference(UF.class, id);
                UF.getI();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The UF with id " + id + " no longer exists.", enfe);
            }
            Asignatura asigClaveForanea = UF.getAsigClaveForanea();
            if (asigClaveForanea != null) {
                asigClaveForanea.getListaUFS().remove(UF);
                asigClaveForanea = em.merge(asigClaveForanea);
            }
            em.remove(UF);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<UF> findUFEntities() {
        return findUFEntities(true, -1, -1);
    }

    public List<UF> findUFEntities(int maxResults, int firstResult) {
        return findUFEntities(false, maxResults, firstResult);
    }

    private List<UF> findUFEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(UF.class));
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

    public UF findUF(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(UF.class, id);
        } finally {
            em.close();
        }
    }

    public int getUFCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<UF> rt = cq.from(UF.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
