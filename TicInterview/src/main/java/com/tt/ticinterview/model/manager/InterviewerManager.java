package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.dao.InterviewerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */

@Service
public class InterviewerManager {

    @Autowired
    @Qualifier("InterviewerDAO")
    InterviewerDAO interviewerDAO;

    @Transactional
    public void save(Interviewer interviewer){
        try{
            interviewerDAO.save(interviewer);
        }
        catch (Exception e){
            System.out.println("Error save: " + e);
        }

    }

    @Transactional
    public void delete (Interviewer interviewer){
        try{
            interviewerDAO.delete(interviewer);
        }
        catch (Exception e){
            System.out.println("Error delete: " + e);
        }
    }

    @Transactional
    public Interviewer getById(long id){
        try{
            return interviewerDAO.getById(id);
        }
        catch (Exception e){
            System.out.println("Error getById: " + e);
        }
        return null;
    }

    @Transactional
    public List<Interviewer> getAll(){
        try{
            return interviewerDAO.getAll();
        }
        catch (Exception e){
            System.out.println("Error getAll: " + e);
        }
        return null;
    }

    @Transactional
    public List<Interviewer> getManager(){
        try{
            return interviewerDAO.getManagers();
        }
        catch (Exception e){
            System.out.println("Error getManager: " + e);
        }
        return null;
    }

    @Transactional
    public List<Interviewer> getInterviewers(){
        try{
            return interviewerDAO.getInterviewers();
        }
        catch (Exception e){
            System.out.println("Error getInterviewers: " + e);
        }
        return null;
    }
}
