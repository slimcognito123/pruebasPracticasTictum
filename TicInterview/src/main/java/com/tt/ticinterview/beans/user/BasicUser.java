/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.user;

import com.tt.ticinterview.beans.basic.GenericBean;

/**
 *
 * @author tictumTarde
 */
public interface BasicUser{

    public  long getId();
    
    public void setId(long id);
    
    public  String getUsername();

    public  String getPassword();
    
    public void setUsername(String username);
    
    public void setPassword(String password);


    @Override
    public  String toString();

    @Override
    public  int hashCode();


    @Override
    public boolean equals(Object obj);
    
    
}
