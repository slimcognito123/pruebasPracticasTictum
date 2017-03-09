/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.user;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author tictumTarde
 */
public class Interviewer implements BasicUser{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    public Interviewer() {

    }

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setUsername(String username) {

    }

    @Override
    public void setPassword(String password) {

    }
}
