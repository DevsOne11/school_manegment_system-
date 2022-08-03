package uz.marvel.myschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import uz.marvel.myschool.config.HibernateConfigurer;

import java.util.List;
import java.util.Objects;

public abstract class Dao<T, ID> {
    private Class<T> clazz;

    public T create(T entity) {
        SessionFactory sessionFactory = HibernateConfigurer.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return entity;
    }

    public void delete(Long id) {
        SessionFactory sessionFactory = HibernateConfigurer.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        T item = session.find(clazz, id);
        if (Objects.nonNull(item))
            session.remove(item);
        session.getTransaction().commit();
    }

    public List<T> findAll() {
        SessionFactory sessionFactory = HibernateConfigurer.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        return session.createQuery("select a from " + clazz + " a order by a.id desc ", clazz).getResultList();
    }

    public T findOne(Long id){
        return null;
    }
}
