package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.user.Interviewer;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */

@Repository("InterviewerDAO")
public class InterviewerDAO  implements BasicUserDAO<Interviewer>{

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

    public List<Interviewer> getManagers(){
        return null;
    }

    public List<Interviewer> getInterviewers(){
        return null;
    }

    @Override
    public Interviewer getUserMail(String mail) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Interviewer object) {
        BasicUserDAO.super.save(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Interviewer object) {
        BasicUserDAO.super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }
}
