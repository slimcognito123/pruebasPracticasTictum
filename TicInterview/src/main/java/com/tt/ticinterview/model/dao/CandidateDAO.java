package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.user.Candidate;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 13/03/2017.
 */
public class CandidateDAO implements BasicUserDAO<Candidate> {
    @Override
    public Candidate GetUserMail(String mail) throws Exception {
        String sql = "Select user from Candidate user where user.mail = :mail";
        Query query = entityManager.createQuery(sql);
        query.setParameter("mail", mail);
        return (Candidate) query.getSingleResult();
    }

    @Override
    public void modify(Candidate user) throws Exception {
        entityManager.merge(user);
    }

    @Override
    public Candidate getById(Long id) throws Exception {
        return entityManager.find(Candidate.class,id);
    }

    @Override
    public List<Candidate> getAll() {
        String prepareQuery = "select something from Candidate something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
