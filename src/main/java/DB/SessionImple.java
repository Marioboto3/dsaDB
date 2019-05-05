package DB;


import com.mysql.cj.xdevapi.SessionImpl;
import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class SessionImple implements Session {

    private Logger log = Logger.getLogger(SessionImpl.class.getName());
    private Connection connection;

    public SessionImple() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            this.connection =  DriverManager.getConnection("jdbc:mysql://localhost/dsa?user=root&password=divisiondehonor8&useJDBCCompliantTimezoneShift=true?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Object entity) {

    }

    public Object get(Class myClass, int id) {
        String query = "SELECT * FROM" + myClass.getName() + "Where id =" + id;
        System.out.println("Query: " + query);
        return null;
    }

    public void update(Object entity, int id) {
        Field[] fields = entity.getClass().getDeclaredFields();
        StringBuilder sb = new StringBuilder();

        String query = "UPDATE" + entity.getClass().getSimpleName() + "SET (";
         for (Field f: fields) {
             sb.append(f.getName()).append("=?,");
         }
         query += sb.deleteCharAt(sb.length()-1).toString();
         query += ") Where id =" + id;
         System.out.println("Query: " + query);
    }

    public void delete(Object entity, int id) {

    }

    public List<Object> findAll(Class myClass) {
        return null;
    }

    public void close() {
    }
}
