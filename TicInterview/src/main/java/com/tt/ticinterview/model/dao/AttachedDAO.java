package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Attached;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 10/03/2017.
 */
@Repository(value = "AttachedDAO")
public class AttachedDAO implements CrudDAO<Attached> {

    public Attached getById(Long id){

        return entityManager.find(Attached.class,id);
    }

    public List<Attached> getAll(){

        List<Attached> lista;
        Class<Attached> object = null;

        String prepareQuery = "select something from Attached something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
