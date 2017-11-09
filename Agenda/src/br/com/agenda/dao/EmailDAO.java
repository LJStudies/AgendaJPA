/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.domain.Email;

/**
 *
 * @author rodri
 */
public class EmailDAO extends JPARepository<Email, Long> {
    
    public EmailDAO() {
        super(Email.class);
    }
    
}
