package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.user.Interviewer;
import old.tt.ticinterview.model.dao.AnswerDAO;
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
            System.out.println("guardado");
            //answerDAO.save(answer);
        }
        catch (Exception e){
            System.err.println("Error save: " + e);
        }

    }

    @Transactional
    public void delete (Answer answer){
        try{
            System.out.println("guardado");
            //answerDAO.delete(answer);
        }
        catch (Exception e){
            System.err.println("Error delete: " + e);
        }
    }

  
    public Answer getById(long id){
        try{
            Candidate d = new Candidate();
            
            return new Answer(d, null);
           // return answerDAO.getById(id);
        }
        catch (Exception e){
            System.err.println("Error getById: " + e);
        }
        return null;
    }


    public List<Answer> getAll(){
        try {
            return answerDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e);
        }
        return null;
    }
    @Transactional
    public void valorationAnswer(long idInterview, int valoration) {
        try {
            answerDAO.valorationAnswer(idInterview, valoration);
        }catch (Exception e){
            System.err.println("ERROR modify " + e);
        }
    }

}
