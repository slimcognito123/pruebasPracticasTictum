/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.basic.GenericBean;
import org.springframework.stereotype.Repository;

/**
 *  @since 09/03/2017
 * @author tictumTarde
 * @version 0.1
 * 
 */
@Repository(value = "BasicUserDAO")
public interface BasicUserDAO<T extends GenericBean> extends CrudDAO<T>{

    T GetUserMail(String mail) throws Exception;
    void modify(T object) throws Exception;
}
