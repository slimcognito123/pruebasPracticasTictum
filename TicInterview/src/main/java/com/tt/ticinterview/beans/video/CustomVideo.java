/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.video;

import com.tt.ticinterview.beans.basic.GenericBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @since 09/03/2017
 * @author tictumTarde -PNM
 * @version 0.2
 */
@Entity
@Table(name = "CustomVideo")
public class CustomVideo extends GenericBean implements Video, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "path", nullable = false, unique = true)
    private String path;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @OneToMany()
    @JoinTable(name = "Interviewer")
    @JoinColumn(name = "idInterviewer")
    public long idInterviewer;

    public CustomVideo() {
    }

    public CustomVideo(String path, String name, long idInterviewer) {
        this.path = path;
        this.name = name;
        this.idInterviewer = idInterviewer;
    }

    public CustomVideo(String name) {
        this.name = name;
    }

    public long getIdInterviewer() {
        return idInterviewer;
    }

    public void setIdInterviewer(long idInterviewer) {
        this.idInterviewer = idInterviewer;
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
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomVideo{" + "id=" + id + ", path=" + path + ", name=" + name + ", idInterviewer=" + idInterviewer + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 13 * hash + Objects.hashCode(this.path);
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + (int) (this.idInterviewer ^ (this.idInterviewer >>> 32));
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
        final CustomVideo other = (CustomVideo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String getInstanceName() {
        return "customvideo";
    }
}
