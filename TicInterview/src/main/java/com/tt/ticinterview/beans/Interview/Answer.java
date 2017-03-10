package com.tt.ticinterview.beans.Interview;

import com.tt.ticinterview.beans.basic.GenericBean;
import com.tt.ticinterview.beans.video.CandidateVideo;

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
//@Table (name = "Answer" )
public class Answer extends GenericBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long idCandidate;
    private long idInterviewer;
    private List<CandidateVideo> videoAnswer;
    private List<String> textAnswer;
    private int valoration;
    private String observation;
    private boolean isSelected;

    public Answer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(long idCandidate) {
        this.idCandidate = idCandidate;
    }

    public long getIdInterviewer() {
        return idInterviewer;
    }

    public void setIdInterviewer(long idInterviewer) {
        this.idInterviewer = idInterviewer;
    }

    public List<CandidateVideo> getVideoAnswer() {
        return videoAnswer;
    }

    public void setVideoAnswer(List<CandidateVideo> videoAnswer) {
        this.videoAnswer = videoAnswer;
    }

    public List<String> getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(List<String> textAnswer) {
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
}
