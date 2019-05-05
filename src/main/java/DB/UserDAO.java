package DB;

import java.util.List;

public interface UserDAO {

    void addUser(String username, String address);
    void updateUser (int id, User user);
    User getUser (int id);
    List<User> getAllUsers();
}
