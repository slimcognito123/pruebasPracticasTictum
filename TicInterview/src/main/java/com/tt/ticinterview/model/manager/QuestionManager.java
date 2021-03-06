package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.form.Question;
import com.tt.ticinterview.model.dao.QuestionDAO;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 * @since 09/03/2017
 */

@Service("QuestionManager")
public class QuestionManager {

    @Autowired
    @Qualifier("QuestionDAO")
    private QuestionDAO questionDAO;

    @Transactional
    public void save(Question question) {
        try {
            System.out.println("Guardado");
         //   questionDAO.save(question);
        } catch (Exception e) {
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete(Question question) {
        try {
            System.out.println("Borrado");
          //  questionDAO.delete(question);
        } catch (Exception e) {
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }

    
    public Question getById(long id) {
        try {
            return new Question();
         //   return questionDAO.getById(id);
        } catch (Exception e) {
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    
    public List<Question> getAll() {
        try {
        return new ArrayList<>();
          //  return questionDAO.getAll();
        } catch (Exception e) {
            System.err.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }
}
