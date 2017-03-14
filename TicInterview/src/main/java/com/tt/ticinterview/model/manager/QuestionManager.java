package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.form.Question;
import com.tt.ticinterview.model.dao.QuestionDAO;
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

@Service
public class QuestionManager {

    @Autowired
    @Qualifier("QuestionDAO")
    QuestionDAO questionDAO;

    @Transactional
    public void save(Question question) {
        try {
            questionDAO.save(question);
        } catch (Exception e) {
            System.out.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete(Question question) {
        try {
            questionDAO.delete(question);
        } catch (Exception e) {
            System.out.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public Question getById(long id) {
        try {
            return questionDAO.getById(id);
        } catch (Exception e) {
            System.out.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Question> getAll() {
        try {
            return questionDAO.getAll();
        } catch (Exception e) {
            System.out.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }
}
