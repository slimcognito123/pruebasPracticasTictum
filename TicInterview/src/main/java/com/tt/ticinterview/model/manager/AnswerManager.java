package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.dao.AnswerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

@Service("AnswerManager")
public class AnswerManager {

    @Autowired
    @Qualifier("AnswerDAO")
    private AnswerDAO answerDAO;

    @Transactional
    public void save(Answer answer){
        try{
            answerDAO.save(answer);
        }
        catch (Exception e){
            System.err.println("Error save: " + e);
        }

    }

    @Transactional
    public void delete (Answer answer){
        try{
            answerDAO.delete(answer);
        }
        catch (Exception e){
            System.err.println("Error delete: " + e);
        }
    }

    @Transactional
    public Answer getById(long id){
        try{
            return answerDAO.getById(id);
        }
        catch (Exception e){
            System.err.println("Error getById: " + e);
        }
        return null;
    }

    @Transactional
    public List<Answer> getAll() {
        try {
            return answerDAO.getAll();
        } catch (Exception e) {
            System.err.println("ERROR getAll " + e);
        }
        return null;
    }
}
