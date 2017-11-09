package br.com.agenda.dao;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * Interface de métodos CRUD para transações com banco de dados
 *
 * @author LeonardoJasmim
 * @since Maio/2016
 * @version 1.0
 *
 * @param <T> Classe genérica que representa uma entidade da base de dados.
 * @param <PK> Chave primária da entidade.
 */
public interface Repository<T, PK extends Serializable> {

    /**
     * Método abstrato que provê a API EntityManager conectada ao banco para as
     * operações CRUD.
     *
     * @return Objeto entityManager conectado.
     */
    public EntityManager getEntityManager();

    /**
     * Método abstrato para persistir um objeto na base de dados.
     *
     * @param entity Objeto instanciado.
     * @return Instância do objeto da classe T que foi persistido.
     */
    public T save(T entity);

    /**
     * Método abstrato para remover um objeto da base de dados.
     *
     * @param entity Objeto instanciado.
     */
    public void remove(T entity);

    /**
     * Método abstrato que retorna uma tupla de uma entidade referente ao ID
     * fornecido.
     *
     * @param pk ID que representa a chave primária.
     * @return Objeto instanciado.
     */
    public T getByID(PK pk);

    /**
     * Método abstrato que retorna todas as tuplas de uma entidade.
     *
     * @return Lista de objetos instanciados
     */
    public List<T> getAll();

}
