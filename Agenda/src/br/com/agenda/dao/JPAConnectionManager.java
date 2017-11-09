package br.com.agenda.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Classe que cria um EntityManager que permite a interação com uma base de
 * dados através da Unidade de Persistência.
 *
 * @author Bruno Costa
 * @since Abril/2014
 */
public class JPAConnectionManager {

    private static final String UNIT_NAME = "AgendaPU";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    /**
     * Retorna um EntityManager criado a partir das configurações de uma Unidade
     * de persistência.
     *
     * @return EntityManager instanciado.
     */
    public EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
        }
        if (em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
}
