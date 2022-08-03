package uz.marvel.myschool.service;

public abstract class Service<R> {
    protected final R dao;

    public Service(R dao) {
        this.dao = dao;
    }
}
