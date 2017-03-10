package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.model.dao.BasicUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

@Service("UserManager")
public class UserManager<T>{

    @Autowired
    @Qualifier("BasicUserDAO")
    BasicUserDAO basicUserDAO;

    @Transactional
    public void register(T object){

    }

    @Transactional
    public T getById(long id){
        return null;
    }

    @Transactional
    public T getByMail(String mail){
        return null;
    }

    @Transactional
    public List<T> getAll(){
        return null;
    }

    @Transactional
    public void modify(T object){

    }

    @Transactional
    public void delete(T object){

    }
}
