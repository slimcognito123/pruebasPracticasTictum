/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.form;

import java.util.HashMap;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

public class Question {

    private long idQuestion;
    private String Question;
    private Type type;
    private HashMap<Boolean, String> killingQuestion;

    public Question() {
    }

    public long getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(long idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public HashMap<Boolean, String> getKillingQuestion() {
        return killingQuestion;
    }

    public void setKillingQuestion(HashMap<Boolean, String> killingQuestion) {
        this.killingQuestion = killingQuestion;
    }
}
