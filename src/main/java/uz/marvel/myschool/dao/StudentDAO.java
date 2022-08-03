package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.Student;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:50   02/08/22
 * @Project :  school_manegment_system-
 */
public class StudentDAO extends Dao<Student,Long> {
    @Override
    public Student create(Student entity) {
        return super.create(entity);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public List<Student> findAll() {
        return super.findAll();
    }

    @Override
    public Student findOne(Long id) {
        return super.findOne(id);
    }
}
