package Main;

import Model.User;
import Service.UserService;
import Service.UserServiceImpl;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Aleksandr", "Kurma");
        userService.saveUser("James", "Gosling");
        userService.saveUser("Sergei", "Nikonov");
        userService.removeUserById(17);

        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user.toString());
        }
    }

}
