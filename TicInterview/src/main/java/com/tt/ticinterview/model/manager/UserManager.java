package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.model.dao.BasicUserDAO;
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
public class UserManager<T> {

    @Autowired
    @Qualifier("BasicUserDAO")
    BasicUserDAO basicUserDAO;

    @Transactional
    public void register(T object){
        try{
            basicUserDAO.save(object);
        }catch(Exception e){
            System.out.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public T getById(long id){
        try{
            return basicUserDAO.getById(id);
        }catch(Exception e){
            System.out.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public T getByMail(String mail){
        try{
            return basicUserDAO.getUserMail(mail);
        }catch(Exception e){
            System.out.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<T> getAll(){
        try{
            return basicUserDAO.getAll();
        }catch(Exception e){
            System.out.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public void modify(T object){
        try{
            basicUserDAO.modify(object);
        }catch(Exception e){
            System.out.println("ERROR modify " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete(T object){
        try{
            basicUserDAO.delete(object);
        }catch(Exception e){
            System.out.println("ERROR delete " + e.getStackTrace());
        }
    }

}
