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
@Table(name = "Interview")
public class Interview extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idInterview;
    @OneToMany()
    @JoinTable(name = "Interviewer")
    @JoinColumn(name = "idInterviewer")
    private long idInterviewer;
    private List<Video> video;
    private Form form;
    private Attached attached;
    private boolean isPrivate;
    private boolean isSchema;

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

    public boolean isIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public boolean isSchema() {
        return isSchema;
    }

    public void setSchema(boolean isSchema) {
        this.isSchema = isSchema;
    }

    @Override
    public String toString() {
        return "Interview{" + "idInterview=" + idInterview + ", idInterviewer=" + idInterviewer + ", video=" + video + ", form=" + form + ", attached=" + attached + ", isPrivate=" + isPrivate + ", isSchema=" + isSchema + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + (int) (this.idInterviewer ^ (this.idInterviewer >>> 32));
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
        final Interview other = (Interview) obj;
        if (this.idInterview != other.idInterview) {
            return false;
        }
        if (this.idInterviewer != other.idInterviewer) {
            return false;
        }
        return true;
    }

    @Override
    public String getInstanceName() {
        return "interview";
    }
}
