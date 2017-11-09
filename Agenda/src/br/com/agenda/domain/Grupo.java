/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author rodrigo
 */
public class Grupo {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
    @Column(nullable = false)
    private String descricao;
    
    private List<Contato> contatos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Grupo() {
    }

    public Grupo(long id, String descricao, List<Contato> contatos) {
        this.id = id;
        this.descricao = descricao;
        this.contatos = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Grupo{" + "descricao=" + descricao + ", contatos=" + contatos + '}';
    }
    
    
    
    
}
