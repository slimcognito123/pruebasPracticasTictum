/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.user;

import com.tt.ticinterview.beans.basic.GenericBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */

@Entity
//@Table (name = "Interviewer" )
public class Interviewer extends GenericBean implements BasicUser, Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private String mail;
    private boolean isManager;

    public Interviewer() {
    }

    @Override
    public long getId() {
        return id;
    }

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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }
}
