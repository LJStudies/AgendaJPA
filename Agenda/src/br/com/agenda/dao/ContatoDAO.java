/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.domain.Contato;

/**
 *
 * @author rodri
 */
public class ContatoDAO extends JPARepository<Contato, Long> {
    
    public ContatoDAO() {
        super(Contato.class);
    }
}
