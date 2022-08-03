package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.Grade;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:47   02/08/22
 * @Project :  school_manegment_system-
 */
public class GradeDAO extends Dao<Grade,Long> {
    @Override
    public Grade create(Grade entity) {
        return super.create(entity);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public List<Grade> findAll() {
        return super.findAll();
    }

    @Override
    public Grade findOne(Long id) {
        return super.findOne(id);
    }
}
