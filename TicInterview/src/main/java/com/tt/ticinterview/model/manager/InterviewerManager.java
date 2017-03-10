package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.dao.BasicUserDAO;
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
public class InterviewerManager {

    @Autowired
    @Qualifier("basicUserDAO")
    BasicUserDAO interviewerDAO;

    @Transactional
    public void save(Interviewer interviewer){

    }

    @Transactional
    public void delete (Interviewer interviewer){

    }

    @Transactional
    public Interviewer getById(long id){
        return null;
    }

    @Transactional
    public List<Interviewer> getAll(){
        return null;
    }

    @Transactional
    public List<Interviewer> getManager(){
        return null;
    }

    @Transactional
    public List<Interviewer> getInterviewers(){
        return null;
    }
}
