/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Interview;

import javax.persistence.Query;
import java.util.List;

/**
 *
 * @author tictumTarde
 */

public class InterviewDAO implements CrudDAO<Interview> {
    public Interview getById(Long id){
        return entityManager.find(Interview.class,id);
    }

    public List<Interview> getAll(){
        String prepareQuery = "select something from Interview something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
