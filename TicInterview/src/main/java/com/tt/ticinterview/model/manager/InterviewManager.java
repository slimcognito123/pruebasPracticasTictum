package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.dao.InterviewDAO;
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
public class InterviewManager {

    @Autowired
    @Qualifier("InterviewDAO")
    InterviewDAO interviewDAO;

    @Transactional
    public void save(Interview interview){
        try{
            interviewDAO.save(interview);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }

    @Transactional
    public void delete (Interview interview){
        try{
            interviewDAO.delete(interview);
        }catch(Exception e){
            System.err.println(e.getStackTrace());
        }
    }

    @Transactional
    public Interview getById(long id){
        return interviewDAO.getById(id);
    }

    @Transactional
    public List<Interview> getAll(){
        return interviewDAO.getAll();
    }

    @Transactional
    public List<Interview> searchByInterviewName(String name){
        return null;
    }

    @Transactional
    public List<Interview> getPublicInterview(){
        return null;
    }

    @Transactional
    public List<Interview> searchByCreator(long id){
        return null;
    }
}
