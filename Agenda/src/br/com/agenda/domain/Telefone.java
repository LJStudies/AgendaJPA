package br.com.agenda.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe JavaBeans com anotações ORM que representa um número de telefone 
 *
 * @author LeonardoJasmim
 * @since Maio/2016
 * @version 1.0
 */
@Entity
public class Telefone implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String ddd;

    @Column(nullable = false)
    private String numero;

    public Telefone() {
    }

    public Telefone(long id, String ddd, String numero) {
        super();
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "(" + ddd + ") " + numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Telefone) {
            Telefone telefone = (Telefone) obj;
            return telefone.getId() == this.getId();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 37 * result + (int)(this.id ^(this.id >>> 32));
        return result;
    }
}
