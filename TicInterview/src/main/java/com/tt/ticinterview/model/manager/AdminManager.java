package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.user.Admin;
import com.tt.ticinterview.model.dao.AdminDAO;
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

@Service
public class AdminManager {

    @Autowired
    @Qualifier("AdminDAO")
    AdminDAO adminDAO;

    @Transactional
    public void register(Admin admin){
        try{
            adminDAO.save(admin);
        }catch(Exception e){
            System.out.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public Admin getById(long id){
        try{
            return adminDAO.getById(id);
        }catch(Exception e){
            System.out.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public Admin getByMail(String mail){
        try{
            return adminDAO.getUserMail(mail);
        }catch(Exception e){
            System.out.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Admin> getAll(){
        try{
            return adminDAO.getAll();
        }catch(Exception e){
            System.out.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public void modify(Admin admin){
        try{
            adminDAO.modify(admin);
        }catch(Exception e){
            System.out.println("ERROR modify " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete(Admin admin){
        try{
            adminDAO.delete(admin);
        }catch(Exception e){
            System.out.println("ERROR delete " + e.getStackTrace());
        }
    }
}
