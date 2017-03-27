/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.user.Admin;
import javax.persistence.Query;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pnaca
 */
@Repository("AdminDAO")
public class AdminDAO extends BasicUserDAOInterface<Admin> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Admin getUserMail(String mail) throws Exception {
              String sql = "Select user from Admin user where user.mail = :mail";
        Query query = getSession().createQuery(sql);
        query.setParameter("mail", mail);
        return (Admin) query.getSingleResult();
    }

    @Override
    public void modify(Admin object) throws Exception {
        getSession().merge(object);
    }

    @Override
    public Admin getById(Long id) throws Exception {
         return getSession().find(Admin.class,id);
    }

    @Override

    public void save(Admin object) {
        System.out.println("Se supone que voy a guardar---nueva forma");
        System.out.println(object.toString());
//        em.createQuery("INSERT INTO `tt`.`admin` (`id`, `password`, `username`) VALUES ('33', 'bojack', 'h')");

//        em.merge(object);
        getSession().save(object);
        System.out.println("He guardado");
    }

}
