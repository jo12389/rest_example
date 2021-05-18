package ru.nikonov.springcourse.service;

import org.springframework.stereotype.Service;
import ru.nikonov.springcourse.entity.User;

import java.util.List;


@Service
public interface UserService {
    void saveUser(User user);
    void editUser(User user);
    void deleteUser(long id);
    User getUser(long id);
    List<User> getAll();
}