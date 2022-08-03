package uz.marvel.myschool.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import uz.marvel.myschool.config.HibernateConfigurer;
import uz.marvel.myschool.domains.AuthUser;

import java.util.List;
import java.util.Optional;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:53   02/08/22
 * @Project :  school_manegment_system-
 */
public class UserDAO extends Dao<AuthUser,Long> {
    @Override
    public AuthUser create(AuthUser entity) {
        return super.create(entity);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public List<AuthUser> findAll() {
        SessionFactory sessionFactory = HibernateConfigurer.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        return session.createQuery("select a from  auth_user a order by a.id desc ", AuthUser.class).getResultList();
    }

    @Override
   public AuthUser findOne(Long id) {
        return super.findOne(id);
    }

    public Optional<AuthUser> findByUsername(String username) {
        Session session = HibernateConfigurer.getSession();
        return Optional.ofNullable(
                session.createQuery("select  t from auth_user t where t.username = :username", AuthUser.class)
                        .setParameter("username", username)
                        .getSingleResult());
    }
}
