package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Component
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void addUser(User user) {
        userDAO.save(user);
    }
    public void updateUser(User user) {
        userDAO.update(user);
    }
    public void deleteUser(User user) {
        userDAO.delete(user);
    }
    public User getUser(int id) {
        return userDAO.getUserById(id);
    }
    public List<User> getAllUsers() {
        return userDAO.listAllUsers();
    }
}
