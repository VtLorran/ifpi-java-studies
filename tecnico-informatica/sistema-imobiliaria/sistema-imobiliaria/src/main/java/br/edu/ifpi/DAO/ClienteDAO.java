package br.edu.ifpi.DAO;

import br.edu.ifpi.Model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class ClienteDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public ClienteDAO() {
        this.emf = Persistence.createEntityManagerFactory("sistema-imobiliaria-pu");
        this.em = emf.createEntityManager();
    }

    public void salvar(Cliente cliente) {
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            System.out.println("Cliente salvo com sucesso! ID: " + cliente.getId());
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Erro ao salvar cliente:");
            e.printStackTrace();
        }
    }

    public Cliente buscarPorCpf(String cpf) {
        try {
            String jpql = "SELECT c FROM Cliente c WHERE c.cpf = :cpf";
            TypedQuery<Cliente> query = em.createQuery(jpql, Cliente.class);
            query.setParameter("cpf", cpf);
            return query.getSingleResult();
        } catch (NoResultException e) {
            System.out.println("Nenhum cliente encontrado com CPF: " + cpf);
            return null;
        }
    }

    public void fechar() {
        if (em != null && em.isOpen()) {
            em.close();
        }
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
