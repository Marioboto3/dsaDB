package DB;

import com.mysql.cj.xdevapi.SessionImpl;

public class Factory {
    static Session getSession() throws Exception {
        return new SessionImple();
    }
}
