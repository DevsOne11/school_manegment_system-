package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.auth.Grade;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:47   02/08/22
 * @Project :  school_manegment_system-
 */
public class GradeDAO extends Dao<Grade,Long> {
    @Override
    Grade create(Grade entity) {
        return super.create(entity);
    }

    @Override
    void delete(Long id) {
        super.delete(id);
    }

    @Override
    List<Grade> findAll() {
        return super.findAll();
    }

    @Override
    Grade findOne(Long id) {
        return super.findOne(id);
    }
}
