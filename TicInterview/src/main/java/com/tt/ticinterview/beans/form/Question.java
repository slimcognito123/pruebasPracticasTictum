/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.form;

import com.tt.ticinterview.beans.basic.GenericBean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashMap;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */
@Entity
public class Question extends GenericBean {
    @Id
    private long id;
    private String Question;
    private Type type;
    private HashMap<Boolean, String> killingQuestion;

    public Question() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String getInstanceName() {
        return "question";
    }
}
