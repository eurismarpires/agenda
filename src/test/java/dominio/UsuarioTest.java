package dominio;

import com.eurismar.agenda.dominio.Usuario;
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
public class UsuarioTest {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;    
    public UsuarioTest() {
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

    @Test
    public void TestPersistUsuario() {
       Usuario usuario = new Usuario();
        usuario.setLogin("eurismarpires");
        usuario.setNome("Eurismar Pires Borges");
        usuario.setSenha("123");        
        tx.begin();
        em.persist(usuario);
        tx.commit();
    }
}
