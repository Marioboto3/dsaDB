package DB;

import java.util.List;

public class UserDAOImple implements UserDAO {


    public void addUser(String username, String address) {

        Session session = null;
        try {
            session = Factory.getSession();
            User user = new User(username, address);
            session.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void updateUser(int id, User user) {

    }

    public User getUser(int id) {
        Session session = null;
        try {
            session = Factory.getSession();
           /* User user = session.get(,id);*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }

    public List<User> getAllUsers() {
        return null;
    }
}
