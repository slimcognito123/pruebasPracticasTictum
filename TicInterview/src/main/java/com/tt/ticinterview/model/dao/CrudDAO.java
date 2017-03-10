/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.basic.GenericBean;
import com.tt.ticinterview.beans.basic.InstanceEntityManager;
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
public interface CrudDAO<T extends GenericBean> {

    EntityManager entityManager= new InstanceEntityManager().getEm();

    default void save(T object){
        entityManager.persist(object);
    }
    default void delete(T object){
        object = this.entityManager.merge(object);
        this.entityManager.remove(object);
    }
    default T getById(Long id){
        Class<T> object = null;
        return entityManager.find(object,id);
    }
    default List<T> getAll(){
       /* try {
            this.getClass().getMethod("getAll").getTypeParameters();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }*/
        List<T> lista;
        Class<T> object = null;

        String prepareQuery = "select something from "+this.getClass()+" something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
