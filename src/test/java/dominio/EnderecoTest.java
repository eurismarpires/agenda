package dominio;

import com.eurismar.agenda.dominio.Contato;
import com.eurismar.agenda.dominio.Endereco;
import com.eurismar.agenda.dominio.MeioContato;
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
public class EnderecoTest {
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static EntityTransaction tx;    
    public EnderecoTest() {
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
    public void TestPersistEndereco() {
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
        MeioContato meioContato = new MeioContato();
        meioContato.setContato(contato);
        meioContato.setConteudo("meu conteúdo");
        meioContato.setTipoContato("publicação");
        tx.begin();
        em.persist(meioContato);
        tx.commit();
        
        Endereco endereco = new Endereco();
        endereco.setContato(contato);
        endereco.setBairro("Central");
        endereco.setBairro("Goiania");
        tx.begin();
        em.persist(endereco);
        tx.commit();     
    }
}
