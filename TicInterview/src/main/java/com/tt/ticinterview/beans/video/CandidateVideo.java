package com.tt.ticinterview.beans.video;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.tt.ticinterview.beans.basic.GenericBean;
import com.tt.ticinterview.beans.user.Candidate;
/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */
@Entity
//@Table (name = "candidate_video" )
public class CandidateVideo extends GenericBean implements Video, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "path", nullable = false, unique = true)
    private String path;
    @Column(name = "name", nullable = false, unique = true)
    private String name;
    @Column(name = "tMax", nullable = true)
    private int tMax;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Candidate idCandidate;

    public CandidateVideo() {
    }

    public CandidateVideo(String path, String name, int tMax, Candidate idCandidate) {
        this.path = path;
        this.name = name;
        this.tMax = tMax;
        this.idCandidate = idCandidate;
    }

    public CandidateVideo(String path, String name, Candidate idCandidate) {
        this.path = path;
        this.name = name;
        this.idCandidate = idCandidate;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    public int gettMax() {
        return tMax;
    }

    public void settMax(int tMax) {
        this.tMax = tMax;
    }

    public Candidate getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Candidate idCandidate) {
        this.idCandidate = idCandidate;
    }

    @Override
    public String toString() {
        return "CandidateVideo{" + "id=" + id + ", path=" + path + ", name=" + name + ", tMax=" + tMax + ", idCandidate=" + idCandidate + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.path);
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.idCandidate);
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
        final CandidateVideo other = (CandidateVideo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idCandidate != other.idCandidate) {
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
        return "candidatevideo";
    }
}
