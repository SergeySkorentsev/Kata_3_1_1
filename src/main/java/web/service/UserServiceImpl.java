package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    @Override
    public void addUser(User user) {
        userDAO.save(user);
    }
    @Override
    public void updateUser(User user) {
        userDAO.update(user);
    }
    @Override
    public void deleteUser(User user) {
        userDAO.delete(user);
    }
    @Override
    public User getUser(int id) {
        return userDAO.getUserById(id);
    }
    @Override
    public List<User> getAllUsers() {
        return userDAO.listAllUsers();
    }
}
