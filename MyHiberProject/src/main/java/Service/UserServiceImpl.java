package Service;

import DAO.UserDAO;
import DAO.UserDAOHiber;
import Model.User;

import java.util.List;

public class UserServiceImpl implements UserService  {
    UserDAO userDAO = new UserDAOHiber();

    @Override
    public void createUsersTable() {
userDAO.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        userDAO.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String secondName) {
        userDAO.saveUser(name, secondName);
    }

    @Override
    public void removeUserById(long id) {
        userDAO.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> userList = userDAO.getAllUsers();
        return userList;
    }

    @Override
    public void cleanUsersTable() {

    }
}
