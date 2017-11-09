package br.com.agenda.dao.test;

import br.com.agenda.dao.EmailDAO;
import br.com.agenda.domain.Email;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 *
 * @author rodri
 */
public class EmailDAOTest {
    
    private Email email;
    private EmailDAO emailDAO;

    //public EmailDAOTest(Email email, EmailDAO emailDAO) {
     //   this.email = email;
     //   this.emailDAO = emailDAO;
   // }

    public EmailDAOTest() {
    }
    
    
    @Before
    public void setUp() {
        emailDAO = new EmailDAO();
    }
    
    @Test
    public void testSave() {
    
        email = new Email();
        email.setEndereco("teste@teste.com");
        email = emailDAO.save(email);
        assertTrue(email.getId() != 0);
    }
    
    
}