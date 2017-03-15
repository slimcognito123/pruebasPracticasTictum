package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.dao.AnswerDAO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Tictum on 14/03/2017.
 */
public class AnswerManager {
    private AnswerDAO answers;

    @Transactional
    public List<Answer> getAll(){
        try {
            return answers.getAll();
        }catch (Exception e){
            System.out.println("ERROR getAll " + e);
        }
        return null;
    }

    public Answer getById(long idAnswer) {
        return null;
    }
    //TODO hay que hacer el resto de funciones
}
