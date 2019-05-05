package DB;


import org.apache.log4j.Logger;

import java.sql.*;
import java.sql.DriverManager;

public class LoadDriver {

    final static Logger log = Logger.getLogger(LoadDriver.class.getName());

    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost/dsa?user=root&password=divisiondehonor8&useJDBCCompliantTimezoneShift=true?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void getUsers(Connection conn) throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while (rs.next()) {

                log.info("ID: " + rs.getInt(1) + " Username: " + rs.getString(2) + " Address: " + rs.getString(3));
        }
        stmt.close();
    }
    public static void getUsername(Connection conn) throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT Username FROM users");
        while (rs.next()) {
            log.info("ID: " + rs.getString(1));
        }
        stmt.close();
    }
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try {
            conn = getConnection();
            getUsers(conn);
            getUsername(conn);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (conn!=null) conn.close();
        }
    }

}
