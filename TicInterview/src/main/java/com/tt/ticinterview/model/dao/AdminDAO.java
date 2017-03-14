package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.user.Admin;
import com.tt.ticinterview.beans.user.Interviewer;

import javax.persistence.Query;

/**
 * Created by Tictum on 13/03/2017.
 */
public class AdminDAO implements BasicUserDAO<Admin> {

    @Override
    public Admin GetUserMail(String mail) throws Exception {
        String sql = "Select user from Admin user where user.mail = :mail";
        Query query = entityManager.createQuery(sql);
        query.setParameter("mail", mail);
        return (Admin) query.getSingleResult();
    }

    @Override
    public void modify(Admin admin) throws Exception {
        entityManager.merge(admin);
    }

    @Override
    public Admin getById(Long id) throws Exception {
        return entityManager.find(Admin.class,id);
    }
}
