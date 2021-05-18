package Util;

import org.hibernate.cfg.Configuration;
import com.mysql.cj.Session;
import org.hibernate.SessionFactory;
import java.util.Properties;
import org.hibernate.cfg.Environment;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import Model.User;
import org.hibernate.service.*;

public class UtilHibernate {


    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {

        if(sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                settings.put(Environment.URL, "jdbc:mysql://localhost:3306/mydbtest?serverTimezone=Europe/Moscow");
                settings.put(Environment.USER, "root");
                settings.put(Environment.PASS, "root");
                settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                settings.put(Environment.HBM2DDL_AUTO, "update");  // changed from "create-drop"

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(User.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().
                        applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
                if (sessionFactory != null) {
                    System.out.println("Session is open: " + sessionFactory.isOpen());
                }

            } catch (Exception e) {
                System.out.println("Something went wrong");
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }


    public static void sessionClose() {
        getSessionFactory().close();
    }

}
