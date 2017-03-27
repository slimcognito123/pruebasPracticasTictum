/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author pnaca
 * @param <T>
 */
@Repository
public abstract class BasicUserDAOInterface<T> extends CrudDAOImplementation<T> {

    @Autowired
    private SessionFactory sessionFactory;

    private Class<T> type;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    public BasicUserDAOInterface() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    public abstract T getUserMail(String mail) throws Exception;

    public abstract void modify(T object) throws Exception;

    public abstract T getById(Long id) throws Exception;

    public List<T> getAll() {
        String prepareQuery = "select something from " + type.getSimpleName() + " something";
        Query query = getSession().createQuery(prepareQuery);
        return query.getResultList();
    }
}
