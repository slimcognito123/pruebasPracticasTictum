package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.user.Interviewer;

import javax.persistence.Query;
import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */


public class InterviewerDAO  implements BasicUserDAO<Interviewer>{
    @Override
    public Interviewer GetUserMail(String mail) throws Exception {
        String sql = "Select user from Interviewer user where user.mail = :mail";
        Query query = entityManager.createQuery(sql);
        query.setParameter("mail", mail);
        return (Interviewer) query.getSingleResult();
    }

    @Override
    public void modify(Interviewer user) throws Exception {
        entityManager.merge(user);
    }

    public Interviewer getById(Long id){
        return entityManager.find(Interviewer.class,id);
    }

    public List<Interviewer> getAll(){
        String prepareQuery = "select something from Interviewer something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
