package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.form.Form;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 10/03/2017.
 */
@Repository
public class FormDAO implements CrudDAO<Form> {
    public Form getById(Long id){
        return entityManager.find(Form.class,id);
    }

    public List<Form> getAll(){

        String prepareQuery = "select something from Form something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
