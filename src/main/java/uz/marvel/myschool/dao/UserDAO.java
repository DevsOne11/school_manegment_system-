package uz.marvel.myschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import uz.marvel.myschool.config.HibernateConfigurer;
import uz.marvel.myschool.domains.auth.User;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:53   02/08/22
 * @Project :  school_manegment_system-
 */
public class UserDAO extends Dao<User,Long> {
    @Override
    User create(User entity) {
        return super.create(entity);
    }

    @Override
    void delete(Long id) {
        super.delete(id);
    }

    @Override
    List<User> findAll() {
        SessionFactory sessionFactory = HibernateConfigurer.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        return session.createQuery("select a from  auth_user a order by a.id desc ", User.class).getResultList();
    }

    @Override
    User findOne(Long id) {
        return super.findOne(id);
    }
}
