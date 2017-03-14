package com.tt.ticinterview.beans.user;

import com.tt.ticinterview.beans.basic.GenericBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB -PNM
 * @version 0.2
 */

@Entity
//@Table (name = "Candidate" )
public class Candidate  extends GenericBean implements BasicUser, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column (name = "username" , nullable = false)
    private String username;
    @Column (name = "surname" , nullable = false)
    private String surname;
    @Column (name = "dni" , nullable = true , unique = true,  length = 9)
    private String dni;
    @Column (name = "address" , nullable = true , length = 500)
    private String address;
    @Column (name = "date" , nullable = false)
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime date;
    @Column (name = "username" , nullable = false)
    private int phoneNumber;
    @Column (name = "username" , nullable = false)
    private String mail;
    @Column (name = "username" , nullable = false)
    private String password;

    public Candidate() {
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
}
