/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 *  @since 09/03/2017
 * @author tictumTarde
 * @version 0.1
 * 
 */
@Repository(value = "BasicUserDAO")
public interface BasicUserDAO<T> extends CrudDAO<T>{

    T getUserMail(String mail) throws Exception;
    void modify(T object) throws Exception;

    T getById(Long id) throws Exception;


    default List<T> getAll(){
        String prepareQuery = "select something from "+this.getClass()+" something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
