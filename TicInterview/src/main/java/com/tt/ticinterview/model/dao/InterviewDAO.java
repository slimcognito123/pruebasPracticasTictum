/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Interview;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 *
 * @author tictumTarde
 */
@Repository
public class InterviewDAO implements CrudDAO<Interview> {
    public Interview getById(Long id){
        return entityManager.find(Interview.class,id);
    }

    public List<Interview> getAll(){
        String prepareQuery = "select something from Interview something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }


    public List<Interview> searchByInterviewName(String name) {
        String prepareQuery = "select something from Interview something where something.name like :name";
        Query query = entityManager.createQuery(prepareQuery);
        query.setParameter("name","%"+name+"%");
        return query.getResultList();
    }

    public List<Interview> getPublicInterview() {
        String prepareQuery = "select something from Interview something where something.isPrivate = 0";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }

    public List<Interview> searchByCreator(long id) {
        String prepareQuery = "select something from Interview something where something.id = :idInterview";
        Query query = entityManager.createQuery(prepareQuery);
        query.setParameter("idInterview",id);
        return query.getResultList();
    }
}
