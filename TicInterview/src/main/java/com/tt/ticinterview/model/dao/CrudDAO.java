/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tictumTarde
 */

@Repository(value = "CrudDAO")
public abstract class CrudDAO<T> {

    @PersistenceContext
    EntityManager entityManager;

    void save(T object){
        entityManager.persist(object);
    }
    void delete (T object){
        object = this.entityManager.merge(object);
        this.entityManager.remove(object);
    }
    T getById(Long id){
        Class<T> object = null;
        return entityManager.find(object,id);
    }
    List<T> getAll(){
        List<T> lista;
        Class<T> object = null;
        String prepareQuery = "select something from "+object+" something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
