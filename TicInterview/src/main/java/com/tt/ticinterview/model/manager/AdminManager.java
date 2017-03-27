package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.user.Admin;
import com.tt.ticinterview.model.dao.AdminDAO;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */
@Service("AdminManager")
public class AdminManager implements UserManager<Admin> {

    @Autowired
    @Qualifier("AdminDAO")
    private AdminDAO adminDAO;

    @Transactional
    @Override
    public void register(Admin admin) {
        try {
            //Datos de prueba

            adminDAO.save(admin);
            System.out.println("usuario guradado");
            System.out.println(admin.toString());
        } catch (Exception e) {
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Override
    public Admin getById(long id) {
        try {
            return new Admin("admin", "admin");
            // return adminDAO.getById(id);
        } catch (Exception e) {
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Override
    public Admin getByMail(String mail) {
        try {
            return new Admin("admin@", "admin");
            //return adminDAO.getUserMail(mail);
        } catch (Exception e) {
            System.err.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Override
    public List<Admin> getAll() {
        try {
            List l = new ArrayList();
            Admin a = new Admin("admin", "admin");
            l.add(a);
            return l;
            //return adminDAO.getAll();
        } catch (Exception e) {
            System.err.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    @Override
    public void modify(Admin admin) {
        try {
            System.out.println("modificadi");
            // adminDAO.modify(admin);
        } catch (Exception e) {
            System.err.println("ERROR modify " + e.getStackTrace());
        }
    }

    @Transactional
    @Override
    public void delete(Admin admin) {
        try {
            System.out.println("borrado");
            // adminDAO.delete(admin);
        } catch (Exception e) {
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }
}
