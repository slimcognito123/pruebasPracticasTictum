package com.tt.ticinterview.beans.Interview;

import com.tt.ticinterview.beans.video.CandidateVideo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by J on 09/03/2017.
 */
public class Answer implements Serializable {

    private long idAnswer;
    private long idCandidate;
    private long idInterviewer;
    private List<CandidateVideo> videoAnswer;
    private List<String> textAnswer;
    private int valoration;
    private String observation;
    private boolean isSelected;

    public Answer() {
    }

    public long getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(long idAnswer) {
        this.idAnswer = idAnswer;
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
