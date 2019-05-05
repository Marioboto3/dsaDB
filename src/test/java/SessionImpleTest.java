import DB.Session;
import DB.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SessionImpleTest {
    public Session ss;

    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown(){
    }

    @Test
    public void UpdateUserTest(){
        User user = new User("Mario","1234", 1);
        ss.update(user,1);
    }


}
