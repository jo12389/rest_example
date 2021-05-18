package DAO;

import Model.User;
import Util.UtilHibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;



public class UserDAOHiber implements UserDAO {
    public UserDAOHiber(){}

    @Override
    public void createUsersTable() {
        Session session = UtilHibernate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "CREATE TABLE IF NOT EXISTS `mydbtest`.`usertable` (\n" +
                "  `id` INT NOT NULL AUTO_INCREMENT,\n" +
                "  `name` VARCHAR(45) NOT NULL,\n" +
                "  `lastname` VARCHAR(45) NOT NULL,\n" +
                "  `age` INT NOT NULL,\n" +
                "  PRIMARY KEY (`id`))\n" +
                "ENGINE = InnoDB\n" +
                "DEFAULT CHARACTER SET = utf8;\n";
        Query query = session.createSQLQuery(sql).addEntity(User.class);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void dropUsersTable() {
        Session session = UtilHibernate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String sql ="DROP TABLE if exists mydbtest.usertable";
        Query query = session.createSQLQuery(sql).addEntity(User.class);
        query.executeUpdate();
        transaction.commit();
        session.close();
    }

    @Override
    public void saveUser(String name, String lastName) {
        Session session = UtilHibernate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User user = new User(name,lastName);
        session.save(user);
        transaction.commit();
        session.close();
    }

    @Override
    public void removeUserById(long id) {
        Session session = UtilHibernate.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String  sql = String.format("DELETE\n" +
                "FROM mydbtest.usertable\n" +
                "WHERE id = 17;", id);
        Query query = session.createNativeQuery(sql).addEntity(User.class);
        try {
            query.executeUpdate();
            transaction.commit();
            System.out.printf("The user with id %d has been successfully deleted\n", id);
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
            System.out.printf("Failed to remove user with id %d\n", id);
        }
        session.close();

    }

    @Override
    public List<User> getAllUsers() {
        Session session = UtilHibernate.getSessionFactory().openSession();
        String sql = "SELECT * FROM mydbtest.usertable";
        Query query = session.createSQLQuery(sql).addEntity(User.class);

        List <User> userList = query.list();
        session.close();

        return userList;
    }

    @Override
    public void cleanUsersTable() {

    }
}
