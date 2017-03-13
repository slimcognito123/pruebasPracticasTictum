/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.user;

import com.tt.ticinterview.beans.basic.GenericBean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

@Entity
//@Table (name = "Admin" ) 
public class Admin  extends GenericBean implements BasicUser, Serializable{
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private long id;
    @Column (name = "username" , nullable = false)
    private String username;
    @Column (name = "password" , nullable = false)
    private String password;

    
    public Admin() {
    }

    public Admin(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

  
    
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
      @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", username=" + username + ", password=" + password + '}';
    }
}
