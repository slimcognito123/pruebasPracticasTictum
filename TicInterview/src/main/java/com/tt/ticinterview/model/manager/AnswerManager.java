package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Answer;
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
    public List<Answer> getAll(){
        try {
            return answerDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e);
        }
        return null;
    }
    //TODO hay que hacer el resto de funciones
}
