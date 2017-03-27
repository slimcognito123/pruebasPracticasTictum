package com.tt.ticinterview.beans.Interview;




import com.tt.ticinterview.beans.basic.GenericBean;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.video.CandidateVideo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */
@Entity
@Table(name = "Answer")
public class Answer extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne()
     private Candidate idCandidate;
    @OneToOne()
    private Interview idInterview;
    @Column(name = "videoAnswer", nullable = true)
    @OneToMany
    private List<CandidateVideo> videoAnswer;
    @Column(name = "textAnswer", nullable = true)
    private String textAnswer; //Creat objeto text answer
    
    @OneToMany
    @Column(name = "attached", nullable = true)
    private List<Attached> attached;
    @Column(name = "valoration", nullable = true)
    private Integer valoration;
    @Column(name = "observation", nullable = true, length = 500)
    private String observation;
    @Column(name = "isSelected", nullable = true)
    private Boolean isSelected;

    public Answer() {
    }

    public Answer(Candidate idCandidate, Interview idInterview, List<CandidateVideo> videoAnswer, String textAnswer, List<Attached> attached, int valoration, String observation, boolean isSelected) {
        this.idCandidate = idCandidate;
        this.idInterview = idInterview;
        this.videoAnswer = videoAnswer;
        this.textAnswer = textAnswer;
        this.attached = attached;
        this.valoration = valoration;
        this.observation = observation;
        this.isSelected = isSelected;
    }
    

    public Answer(Candidate idCandidate, Interview idInterview, List<CandidateVideo> videoAnswer, String textAnswer, int valoration, String observation, boolean isSelected) {
        this.idCandidate = idCandidate;
        this.idInterview = idInterview;
        this.videoAnswer = videoAnswer;
        this.textAnswer = textAnswer;
        this.valoration = valoration;
        this.observation = observation;
        this.isSelected = isSelected;
    }

    public Answer(Candidate idCandidate, Interview idInterview) {
        this.idCandidate = idCandidate;
        this.idInterview = idInterview;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Candidate getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Candidate idCandidate) {
        this.idCandidate = idCandidate;
    }

    public Interview getIdInterview() {
        return idInterview;
    }

    public void setIdInterviewer(Interview idInterview) {
        this.idInterview = idInterview;
    }

    public List<CandidateVideo> getVideoAnswer() {
        return videoAnswer;
    }

    public void setVideoAnswer(List<CandidateVideo> videoAnswer) {
        this.videoAnswer = videoAnswer;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public int getValoration() {
        return valoration;
    }

    public void setValoration(int valoration) {
        this.valoration = valoration;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public void setIdInterview(Interview idInterview) {
        this.idInterview = idInterview;
    }

    @Override
    public String toString() {
        return "Answer{" + "idCandidate=" + idCandidate + ", idInterview=" + idInterview + ", videoAnswer=" + videoAnswer + ", textAnswer=" + textAnswer + ", valoration=" + valoration + ", observation=" + observation + ", isSelected=" + isSelected + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (this.id ^ (this.id >>> 32));
       
       
        hash = 43 * hash + Objects.hashCode(this.videoAnswer);
        hash = 43 * hash + Objects.hashCode(this.textAnswer);
        hash = 43 * hash + this.valoration;
        hash = 43 * hash + Objects.hashCode(this.observation);
        hash = 43 * hash + (this.isSelected ? 1 : 0);
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
        final Answer other = (Answer) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.idCandidate != other.idCandidate) {
            return false;
        }
        if (this.idInterview != other.idInterview) {
            return false;
        }
        return true;
    }

    @Override
    public String getInstanceName() {
        return "answer";
    }
}
