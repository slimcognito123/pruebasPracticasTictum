package com.tt.ticinterview.beans.Interview;

import java.io.Serializable;

/**
 * Created by J on 09/03/2017.
 */

public class Invitation implements Serializable {

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
