/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.dao;

import br.com.agenda.domain.Grupo;

/**
 *
 * @author rodri
 */
public class GrupoDAO extends JPARepository<Grupo, Long> {
    
    public GrupoDAO() {
        super(Grupo.class);
    }
}
