package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.auth.Teacher;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:51   02/08/22
 * @Project :  school_manegment_system-
 */
public class TeacherDAO extends Dao<Teacher,Long> {
    @Override
    Teacher create(Teacher entity) {
        return super.create(entity);
    }

    @Override
    void delete(Long id) {
        super.delete(id);
    }

    @Override
    List<Teacher> findAll() {
        return super.findAll();
    }

    @Override
    Teacher findOne(Long id) {
        return super.findOne(id);
    }
}
