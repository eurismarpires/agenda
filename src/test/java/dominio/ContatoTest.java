package dominio;

import com.eurismar.agenda.dominio.Contato;
import com.eurismar.agenda.dominio.Usuario;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Eurismar
 */
public class ContatoTest {
        
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;    

    public ContatoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        emf = Persistence.createEntityManagerFactory("pu");
        em = emf.createEntityManager();        
    }
    
    @AfterClass
    public static void tearDownClass() {
        em.close();
        emf.close();        
    }
    
    @Before
    public void setUp() {
        tx = em.getTransaction();
    }
    
    @After
    public void tearDown() {
    }
   // @Test
    public void TestPersisContato() {        
        Usuario usuario = new Usuario();                
        usuario.setLogin("eurismarpires");
        usuario.setNome("Eurismar Pires Borges");
        usuario.setSenha("123");        
        tx.begin();
        em.persist(usuario);
        tx.commit();        
        Contato contato = new Contato();
        contato.setCargo("Programador"); 
        Calendar calendar = Calendar.getInstance();
        calendar.set(1980, 5, 5);
        contato.setDataAniversario(calendar);
        contato.setUsuario(usuario);        
        tx.begin();
        em.persist(contato);
        tx.commit();
    }
}
