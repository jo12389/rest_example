package DAO;


import Model.User;

import java.util.List;

public interface UserDAO {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String secondName);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}
