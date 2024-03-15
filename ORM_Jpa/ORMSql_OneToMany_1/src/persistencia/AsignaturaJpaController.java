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
import logica.UF;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import logica.Asignatura;
import persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author acmmi
 */
public class AsignaturaJpaController implements Serializable {

    public AsignaturaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
     public AsignaturaJpaController () {
          emf = Persistence.createEntityManagerFactory("ORMSqlPU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Asignatura asignatura) {
        if (asignatura.getListaUFS() == null) {
            asignatura.setListaUFS(new LinkedList<UF>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            LinkedList<UF> attachedListaUFS = new LinkedList<UF>();
            for (UF listaUFSUFToAttach : asignatura.getListaUFS()) {
                listaUFSUFToAttach = em.getReference(listaUFSUFToAttach.getClass(), listaUFSUFToAttach.getI());
                attachedListaUFS.add(listaUFSUFToAttach);
            }
            asignatura.setListaUFS(attachedListaUFS);
            em.persist(asignatura);
            for (UF listaUFSUF : asignatura.getListaUFS()) {
                Asignatura oldAsigClaveForaneaOfListaUFSUF = listaUFSUF.getAsigClaveForanea();
                listaUFSUF.setAsigClaveForanea(asignatura);
                listaUFSUF = em.merge(listaUFSUF);
                if (oldAsigClaveForaneaOfListaUFSUF != null) {
                    oldAsigClaveForaneaOfListaUFSUF.getListaUFS().remove(listaUFSUF);
                    oldAsigClaveForaneaOfListaUFSUF = em.merge(oldAsigClaveForaneaOfListaUFSUF);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Asignatura asignatura) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Asignatura persistentAsignatura = em.find(Asignatura.class, asignatura.getId());
            LinkedList<UF> listaUFSOld = persistentAsignatura.getListaUFS();
            LinkedList<UF> listaUFSNew = asignatura.getListaUFS();
            LinkedList<UF> attachedListaUFSNew = new LinkedList<UF>();
            for (UF listaUFSNewUFToAttach : listaUFSNew) {
                listaUFSNewUFToAttach = em.getReference(listaUFSNewUFToAttach.getClass(), listaUFSNewUFToAttach.getI());
                attachedListaUFSNew.add(listaUFSNewUFToAttach);
            }
            listaUFSNew = attachedListaUFSNew;
            asignatura.setListaUFS(listaUFSNew);
            asignatura = em.merge(asignatura);
            for (UF listaUFSOldUF : listaUFSOld) {
                if (!listaUFSNew.contains(listaUFSOldUF)) {
                    listaUFSOldUF.setAsigClaveForanea(null);
                    listaUFSOldUF = em.merge(listaUFSOldUF);
                }
            }
            for (UF listaUFSNewUF : listaUFSNew) {
                if (!listaUFSOld.contains(listaUFSNewUF)) {
                    Asignatura oldAsigClaveForaneaOfListaUFSNewUF = listaUFSNewUF.getAsigClaveForanea();
                    listaUFSNewUF.setAsigClaveForanea(asignatura);
                    listaUFSNewUF = em.merge(listaUFSNewUF);
                    if (oldAsigClaveForaneaOfListaUFSNewUF != null && !oldAsigClaveForaneaOfListaUFSNewUF.equals(asignatura)) {
                        oldAsigClaveForaneaOfListaUFSNewUF.getListaUFS().remove(listaUFSNewUF);
                        oldAsigClaveForaneaOfListaUFSNewUF = em.merge(oldAsigClaveForaneaOfListaUFSNewUF);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = asignatura.getId();
                if (findAsignatura(id) == null) {
                    throw new NonexistentEntityException("The asignatura with id " + id + " no longer exists.");
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
            Asignatura asignatura;
            try {
                asignatura = em.getReference(Asignatura.class, id);
                asignatura.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The asignatura with id " + id + " no longer exists.", enfe);
            }
            LinkedList<UF> listaUFS = asignatura.getListaUFS();
            for (UF listaUFSUF : listaUFS) {
                listaUFSUF.setAsigClaveForanea(null);
                listaUFSUF = em.merge(listaUFSUF);
            }
            em.remove(asignatura);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Asignatura> findAsignaturaEntities() {
        return findAsignaturaEntities(true, -1, -1);
    }

    public List<Asignatura> findAsignaturaEntities(int maxResults, int firstResult) {
        return findAsignaturaEntities(false, maxResults, firstResult);
    }

    private List<Asignatura> findAsignaturaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Asignatura.class));
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

    public Asignatura findAsignatura(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Asignatura.class, id);
        } finally {
            em.close();
        }
    }

    public int getAsignaturaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Asignatura> rt = cq.from(Asignatura.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
