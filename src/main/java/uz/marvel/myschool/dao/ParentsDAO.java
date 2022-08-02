package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.auth.Parents;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:47   02/08/22
 * @Project :  school_manegment_system-
 */
public class ParentsDAO extends Dao<Parents,Long> {
    @Override
    Parents create(Parents entity) {
        return super.create(entity);
    }

    @Override
    void delete(Long id) {
        super.delete(id);
    }

    @Override
    List<Parents> findAll() {
        return super.findAll();
    }

    @Override
    Parents findOne(Long id) {
        return super.findOne(id);
    }
}
