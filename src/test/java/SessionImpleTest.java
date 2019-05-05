import DB.Session;
import DB.SessionImple;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SessionImpleTest {
    private Session ss;

    @Before
    public void setUp() throws Exception {
        this.ss = SessionImple.getInstance();
    }
    @After
    public void tearDown(){
        this.ss.clear();
    }

    @Test
    public void queryUpdate (){

    }
}
