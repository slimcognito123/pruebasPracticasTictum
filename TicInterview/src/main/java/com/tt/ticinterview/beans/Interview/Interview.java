package com.tt.ticinterview.beans.Interview;

import com.tt.ticinterview.beans.basic.GenericBean;
import com.tt.ticinterview.beans.form.Form;
import com.tt.ticinterview.beans.video.Video;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */

@Entity
//@Table (name = "Interview" )
public class Interview extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idInterview;
    private long idInterviewer;
    private List<Video> video;
    private Form form;
    private Attached attached;
    private boolean isPrivate;

    public Interview() {
    }

    public long getIdInterview() {
        return idInterview;
    }

    public void setIdInterview(long idInterview) {
        this.idInterview = idInterview;
    }

    public long getIdInterviewer() {
        return idInterviewer;
    }

    public void setIdInterviewer(long idInterviewer) {
        this.idInterviewer = idInterviewer;
    }

    public List<Video> getVideo() {
        return video;
    }

    public void setVideo(List<Video> video) {
        this.video = video;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public Attached getAttached() {
        return attached;
    }

    public void setAttached(Attached attached) {
        this.attached = attached;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }
}
