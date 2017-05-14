package info.myTraining.hibernateExperiments;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    // Вся работа с Hibernate происходит через SessionFactory
    private static SessionFactory sessionFactory;

    static {
        // Создаем конфигурацию
        Configuration cfg = new Configuration().configure();

        // Создаем билдер
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(cfg.getProperties());

        sessionFactory = cfg.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
