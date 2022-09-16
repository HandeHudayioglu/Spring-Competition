package com.hande.yarismaprojesi.service;

import java.util.List;

public interface IService<T,ID> {

    T save(T entity);
    Iterable<T> saveAll (Iterable<T>entities); //çoklu kayıt
    T update(T entity);
    void delete (T entity);
    void deleteById(ID id);
    T findById(ID id);
    List<T> findAll();
}
