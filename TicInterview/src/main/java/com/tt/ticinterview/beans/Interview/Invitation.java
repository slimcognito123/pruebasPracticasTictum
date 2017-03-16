package com.tt.ticinterview.beans.Interview;

import com.tt.ticinterview.beans.basic.GenericBean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */
@Entity
@Table(name = "Invitation")
public class Invitation extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(name = "Interviewer")
    @JoinColumn(name = "idInterviewer")
    private long idInterview;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    @JoinTable(name = "Candidate")
    @JoinColumn(name = "idCandidate")
    private long idCandidate;

    public Invitation() {
    }

    public Invitation(long idInterview, long idCandidate) {
        this.idInterview = idInterview;
        this.idCandidate = idCandidate;
    }

    public Invitation(long idInterview) {
        this.idInterview = idInterview;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdInterview() {
        return idInterview;
    }

    public void setIdInterview(long idInterview) {
        this.idInterview = idInterview;
    }

    public long getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(long idCandidate) {
        this.idCandidate = idCandidate;
    }

    @Override
    public String toString() {
        return "Invitation{" + "id=" + id + ", idInterview=" + idInterview + ", idCandidate=" + idCandidate + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 67 * hash + (int) (this.idInterview ^ (this.idInterview >>> 32));
        hash = 67 * hash + (int) (this.idCandidate ^ (this.idCandidate >>> 32));
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
        final Invitation other = (Invitation) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idInterview != other.idInterview) {
            return false;
        }
        if (this.idCandidate != other.idCandidate) {
            return false;
        }
        return true;
    }
    
    @Override
    public String getInstanceName() {
        return "invitatation";
    }
}
