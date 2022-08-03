package uz.marvel.myschool.dao;

import uz.marvel.myschool.domains.Parents;

import java.util.List;

/**
 * @Author :  Asliddin Ziyodullaev
 * @Date :  17:47   02/08/22
 * @Project :  school_manegment_system-
 */
public class ParentsDAO extends Dao<Parents,Long> {
    @Override
    public Parents create(Parents entity) {
        return super.create(entity);
    }

    @Override
    public void delete(Long id) {
        super.delete(id);
    }

    @Override
    public List<Parents> findAll() {
        return super.findAll();
    }

    @Override
    public Parents findOne(Long id) {
        return super.findOne(id);
    }
}
