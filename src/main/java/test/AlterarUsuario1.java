package test;

import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Usuario u = em.find(Usuario.class, 1L);

        u.setNome("Juan");
        u.setEmail("Juan.carlos@email.com");

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
