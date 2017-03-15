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
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB -PNM
 * @version 0.2
 */

@Entity
@Table (name = "Interviewer" )
public class Interviewer extends GenericBean implements BasicUser, Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;    
    @Column (name = "username" , nullable = false)
    private String username;
    @Column (name = "password" , nullable = false)
    private String password;
    @Column (name = "mail" , nullable = false)
    private String mail;
    @Column (name = "isManager" , nullable = true)
    private boolean isManager;

    public Interviewer() {
    }

    public Interviewer(long id, String username, String password, String mail, boolean isManager) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.isManager = isManager;
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

    public boolean isIsManager() {
        return isManager;
    }

    public void setIsManager(boolean isManager) {
        this.isManager = isManager;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + Objects.hashCode(this.username);
        hash = 67 * hash + Objects.hashCode(this.mail);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Interviewer other = (Interviewer) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Interviewer{" + "id=" + id + ", username=" + username + ", password=" + password + ", mail=" + mail + ", isManager=" + isManager + '}';
    }
    

    @Override
    public String getInstanceName() {
        return "interviewer";
    }
    
    
}
