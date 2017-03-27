package com.tt.ticinterview.model.dao;


import com.tt.ticinterview.beans.Interview.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Tictum on 14/03/2017.
 */
@Repository("AnswerDAO")
public class AnswerDAO extends CrudDAOImplementation<Answer>{
    
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Override
    public void save(Answer object) {
       getSession().save(object);
    }

    @Override
    public Answer getById(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Answer> getAll() {
        String sql ="Select * from Answer";
        return getSession().createQuery(sql).getResultList();
    }
 
}
