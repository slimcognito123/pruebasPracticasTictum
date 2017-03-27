/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pnaca
 * @param <T>
 */
@Repository
public abstract class CrudDAOImplementation<T> implements GenericDAO<T> {

    @Autowired
    private SessionFactory sessionFactory;
        protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Override
    public abstract void save(T object) ;

    @Override
    public void delete(T object) {
        object = (T) getSession().merge(object);
        this.getSession().remove(object);
    }

    @Override
    public abstract T getById(Long id) throws Exception ;

    @Override
    public abstract List<T> getAll();

}
