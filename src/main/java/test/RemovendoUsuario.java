package test;

import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemovendoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario u = em.find(Usuario.class, 1L);

        if (u != null) {
            em.getTransaction().begin();
            em.remove(u);
            em.getTransaction().commit();
        }

        em.close();
        emf.close();
    }
}
