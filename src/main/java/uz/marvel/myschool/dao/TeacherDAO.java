package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.Teacher;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:51   02/08/22
 * @Project :  school_manegment_system-
 */
public class TeacherDAO extends Dao<Teacher,Long> {
    @Override
    public Teacher create(Teacher entity) {
        return super.create(entity);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
   public List<Teacher> findAll() {
        return super.findAll();
    }

    @Override
   public Teacher findOne(Long id) {
        return super.findOne(id);
    }
}
