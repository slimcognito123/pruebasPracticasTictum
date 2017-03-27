package com.tt.ticinterview.beans.Interview;



import com.tt.ticinterview.beans.basic.GenericBean;
import com.tt.ticinterview.beans.form.Form;
import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.beans.video.CustomVideo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB -PNM
 * @version 0.2
 */
@Entity
@Table(name = "Interview")
public class Interview extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Name",nullable = false)
    private String name;
    @OneToOne()  
    private Interviewer idInterviewer;
     @OneToMany
    private List<CustomVideo> video;
    @OneToOne
    private Form form;
    @Column(name = "isPrivate",nullable = true)
    private boolean isPrivate;
    @Column(name = "isSchema",nullable = true)
    public boolean isSchema;

    public Interview() {
    }

    public Interview(long id, String name, Interviewer idInterviewer, List<CustomVideo> video, Form form, boolean isPrivate, boolean isSchema) {
        this.id = id;
        this.name = name;
        this.idInterviewer = idInterviewer;
        this.video = video;
        this.form = form;
        this.isPrivate = isPrivate;
        this.isSchema = isSchema;
    }

    public Interview(String name, Interviewer idInterviewer, List<CustomVideo> video, Form form, boolean isPrivate, boolean isSchema) {
        this.name = name;
        this.idInterviewer = idInterviewer;
        this.video = video;
        this.form = form;
        this.isPrivate = isPrivate;
        this.isSchema = isSchema;
    }

    public Interview(String name, Interviewer idInterviewer) {
        this.name = name;
        this.idInterviewer = idInterviewer;
    }

    
    
    
    
    public long getIdInterview() {
        return id;
    }

    public boolean isIsSchema() {
        return isSchema;
    }

    public void setIsSchema(boolean isSchema) {
        this.isSchema = isSchema;
    }

    public void setIdInterview(long idInterview) {
        this.id = id;
    }

    public Interviewer getIdInterviewer() {
        return idInterviewer;
    }

    public void setIdInterviewer(Interviewer idInterviewer) {
        this.idInterviewer = idInterviewer;
    }

    public List<CustomVideo> getVideo() {
        return video;
    }

    public void setVideo(List<CustomVideo> video) {
        this.video = video;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Interview{" + "idInterview=" + id+ ", idInterviewer=" + idInterviewer + ", video=" + video + ", form=" + form + ", isPrivate=" + isPrivate + ", isSchema=" + isSchema + '}';
    }

    public Interview(long id, Interviewer idInterviewer, List<CustomVideo> video, Form form, boolean isPrivate, boolean isSchema) {
        this.id = id;
        this.idInterviewer = idInterviewer;
        this.video = video;
        this.form = form;
        this.isPrivate = isPrivate;
        this.isSchema = isSchema;
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
        if (this.id != other.id) {
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
