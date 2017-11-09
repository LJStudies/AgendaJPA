package br.com.agenda.dao;

import br.com.agenda.domain.Telefone;

/**
 * Classe padrão DAO(Data Access Object) que herda de JPARepository e
 * implementa os métodos de persistência da entidade Telefone.
 *
 * @author LeonardoJasmim
 * @since Maio/2016
 * @version 1.0
 */
public class TelefoneDAO extends JPARepository<Telefone, Long> {

    public TelefoneDAO() {
        super(Telefone.class);               
    }
}