package com.tt.ticinterview.beans.Interview;

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
//@Table (name = "Invitation" )
public class Invitation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idInvitation;
    private long idInterview;
    private long idCandidate;

    public Invitation() {
    }

    public long getIdInvitation() {
        return idInvitation;
    }

    public void setIdInvitation(long idInvitation) {
        this.idInvitation = idInvitation;
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
}
