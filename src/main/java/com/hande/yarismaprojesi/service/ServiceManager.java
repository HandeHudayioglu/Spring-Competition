package com.hande.yarismaprojesi.service;

import java.util.List;

public class ServiceManager<T,ID> implements IService<T,ID> {
    @Override
    public T save(T entity) {
        return null;
    }

    @Override
    public Iterable<T> saveAll(Iterable<T> entities) {
        return null;
    }

    @Override
    public T update(T entity) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
