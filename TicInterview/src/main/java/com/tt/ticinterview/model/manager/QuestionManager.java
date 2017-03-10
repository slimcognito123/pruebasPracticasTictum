package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.form.Question;
import com.tt.ticinterview.model.dao.QuestionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

@Service
public class QuestionManager {

    @Autowired
    @Qualifier("QuestionDAO")
    QuestionDAO questionDAO;

    @Transactional
    public void save(Question question){

    }

    @Transactional
    public void delete (Question question){

    }

    @Transactional
    public Question getById(long id){
        return null;
    }

    @Transactional
    public List<Question> getAll(){
        return null;
    }
}
