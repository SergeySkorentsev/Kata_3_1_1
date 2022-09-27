package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(User user);
    User getUserById(int id);
    List<User> listAllUsers();
}
