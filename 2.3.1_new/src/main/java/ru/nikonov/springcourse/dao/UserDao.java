package ru.nikonov.springcourse.dao;

import org.springframework.stereotype.Repository;
import ru.nikonov.springcourse.entity.User;

import java.util.List;

@Repository
public interface UserDao {
    void saveUser(User user);
    void editUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    List<User> getAll();
}