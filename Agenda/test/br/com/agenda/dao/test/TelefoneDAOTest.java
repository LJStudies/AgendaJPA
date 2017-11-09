package br.com.agenda.dao.test;

import br.com.agenda.dao.TelefoneDAO;
import br.com.agenda.domain.Telefone;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Teste de Unidade JUnit dos métodos de persistência da Classe TelefoneDAO
 *
 * @author LeonardoJasmim
 * @since Maio/2016
 * @version 1.0
 *
 */
public class TelefoneDAOTest {

    private Telefone telefone;
    private TelefoneDAO telefoneDAO;
    private List<Telefone> telefones;

    public TelefoneDAOTest() {
    }

    @Before
    public void setUp() {
        telefoneDAO = new TelefoneDAO();
    }

    @Test
    public void testSave() {
        telefone = new Telefone();
        telefone.setDdd("021");
        telefone.setNumero("1111-1111");
        telefone = telefoneDAO.save(telefone);
        assertTrue(telefone.getId() != 0);

        telefone = new Telefone();
        telefone.setDdd("011");
        telefone.setNumero("2222-2222");
        telefone = telefoneDAO.save(telefone);
        assertTrue(telefone.getId() != 0);

        telefone = new Telefone();
        telefone.setDdd("031");
        telefone.setNumero("3333-3333");
        telefone = telefoneDAO.save(telefone);
        assertTrue(telefone.getId() != 0);

        telefone = new Telefone();
        telefone.setDdd("031");
        telefone = telefoneDAO.save(telefone);
        assertTrue(telefone == null);

        telefone = new Telefone();
        telefone.setNumero("3333-3333");
        telefone = telefoneDAO.save(telefone);
        assertTrue(telefone == null);
    }

    @Test
    public void testRemove() {
        telefone = telefoneDAO.getByID(3L);
        if (telefone != null) {
            telefoneDAO.remove(telefone);
        }
        telefone = telefoneDAO.getByID(3L);
        assertTrue(telefone == null);
    }

    @Test
    public void testGetAll() {
        telefones = telefoneDAO.getAll();
        assertTrue(telefones.size() == 2);
    }
}
