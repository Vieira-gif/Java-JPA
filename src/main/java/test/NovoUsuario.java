package test;

import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("Fulano", "fulano.daSilva@email.com");

        em.persist(usuario);
        em.close();
        emf.close();

    }
}
