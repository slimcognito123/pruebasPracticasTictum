package com.tt.ticinterview.beans.user;

import com.tt.ticinterview.beans.basic.GenericBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB -PNM
 * @version 0.2
 */

@Entity
@Table (name = "Candidate" )
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
    @Column (name = "date" , nullable = true)
    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime date;
    @Column (name = "phoneNumber" , nullable = true)
    private int phoneNumber;
    @Column (name = "mail" , nullable = true)
    private String mail;
    @Column (name = "password" , nullable = false)
    private String password;
    /**
     * Constructor Vacio
     */
    public Candidate() {
    }
    /**
     * Constructor con todos los parámetros menos id
     * @param username
     * @param surname
     * @param dni
     * @param address
     * @param date
     * @param phoneNumber
     * @param mail
     * @param password 
     */

    public Candidate(String username, String surname, String dni, String address, LocalDateTime date, int phoneNumber, String mail, String password) {
        this.username = username;
        this.surname = surname;
        this.dni = dni;
        this.address = address;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.password = password;
    }
        public Candidate(String username, String surname, String dni, String address, String date, int phoneNumber, String mail, String password) {
        this.username = username;
        this.surname = surname;
        this.dni = dni;
        this.address = address;
        this.date = LocalDateTime.parse(date);
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.password = password;
    }
    /**
     * Getter de id
     * @return  id
     */

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

    @Override
    public String getInstanceName() {
        return "candidate";
    }

    @Override
    public String toString() {
        return "Candidate{" + "id=" + id + ", username=" + username + ", surname=" + surname + ", dni=" + dni + ", address=" + address + ", date=" + date + ", phoneNumber=" + phoneNumber + ", mail=" + mail + ", password=" + password + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 79 * hash + Objects.hashCode(this.username);
        hash = 79 * hash + Objects.hashCode(this.surname);
        hash = 79 * hash + Objects.hashCode(this.dni);
        hash = 79 * hash + Objects.hashCode(this.address);
        hash = 79 * hash + Objects.hashCode(this.date);
        hash = 79 * hash + this.phoneNumber;
        hash = 79 * hash + Objects.hashCode(this.mail);
        hash = 79 * hash + Objects.hashCode(this.password);
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
        final Candidate other = (Candidate) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        return true;
    }
    
    
}
