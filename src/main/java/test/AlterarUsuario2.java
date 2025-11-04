package test;

import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("curso-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin(); // Começa transação
        Usuario u = em.find(Usuario.class, 1L); // Busca usuario de ID = 1
        em.detach(u); // Torna Imutavel

        u.setNome("Juan");
        u.setEmail("Juan.carlos@email.com");

        em.merge(u); // Busca e salva no banco

        em.getTransaction().commit(); // Commita a alteração

        // Fecha a transação
        em.close();
        emf.close();
    }
}
