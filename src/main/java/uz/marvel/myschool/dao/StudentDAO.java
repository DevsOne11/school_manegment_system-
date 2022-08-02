package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.auth.Student;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:50   02/08/22
 * @Project :  school_manegment_system-
 */
public class StudentDAO extends Dao<Student,Long> {
    @Override
    Student create(Student entity) {
        return super.create(entity);
    }

    @Override
    void delete(Long id) {
        super.delete(id);
    }

    @Override
    List<Student> findAll() {
        return super.findAll();
    }

    @Override
    Student findOne(Long id) {
        return super.findOne(id);
    }
}
