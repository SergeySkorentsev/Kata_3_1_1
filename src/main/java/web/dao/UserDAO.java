package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }
    public void update(User user) {
        entityManager.merge(user);
    }
    public void delete(User user) {
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
    }
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }
    public List<User> listAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }
}
