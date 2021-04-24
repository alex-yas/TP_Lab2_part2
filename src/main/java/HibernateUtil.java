<<<<<<< Updated upstream
import org.hibernate.Session;
=======
>>>>>>> Stashed changes
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

<<<<<<< Updated upstream
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

class HibernateUtil {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration().addResource("hibernate.cfg.xml");
=======
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private static SessionFactory buildSessionFactory() {
        Configuration configuration = new Configuration();
>>>>>>> Stashed changes
        configuration.configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().configure();
        sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

<<<<<<< Updated upstream
    public static SessionFactory getCurrentSessionFromJPA() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("hibernate");
        EntityManager entityManager = emf.createEntityManager();
        Session session = entityManager.unwrap(org.hibernate.Session.class);
        return session.getSessionFactory();
    }

=======
>>>>>>> Stashed changes
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null)
            sessionFactory = buildSessionFactory();
        return sessionFactory;
    }
<<<<<<< Updated upstream
}
=======

}
>>>>>>> Stashed changes
