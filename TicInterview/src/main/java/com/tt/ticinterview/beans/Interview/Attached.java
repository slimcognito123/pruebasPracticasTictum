package com.tt.ticinterview.beans.Interview;

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
 * @author tictumTarde -JRB
 * @version 0.1
 */

@Entity
@Table (name = "Attached" )
public class Attached extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "description", nullable = true)
    private String description;
    @Column(name = "path", nullable = false)
    private String path;

    public Attached() {
    }

    public Attached(String description, String path) {
        this.description = description;
        this.path = path;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Attached{" + "id=" + id + ", description=" + description + ", path=" + path + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + Objects.hashCode(this.path);
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
        final Attached other = (Attached) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.path, other.path)) {
            return false;
        }
        return true;
    }
    

    @Override
    public String getInstanceName() {
       return "attached";
    }
}
