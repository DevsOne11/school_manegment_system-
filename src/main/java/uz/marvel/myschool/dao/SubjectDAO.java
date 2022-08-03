package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.Subject;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:51   02/08/22
 * @Project :  school_manegment_system-
 */
public class SubjectDAO extends Dao<Subject,Long> {
    @Override
    public Subject create(Subject entity) {
        return super.create(entity);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public List<Subject> findAll() {
        return super.findAll();
    }

    @Override
    public Subject findOne(Long id) {
        return super.findOne(id);
    }
}
