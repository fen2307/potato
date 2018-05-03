package com.seriousStuffHibernate.Interfaces;


import java.io.Serializable;
import java.util.List;

public interface SaleRecordDao <T, Id extends Serializable>{

    void persist(List<T> entity);

    void update(T entity);

    T findById(Integer id);

    void delete(T entity);

    List<T> findAll();

    void deleteAll();
}
