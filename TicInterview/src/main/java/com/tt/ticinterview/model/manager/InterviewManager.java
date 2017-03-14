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
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete (Interview interview){
        try{
            interviewDAO.delete(interview);
        }catch(Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public Interview getById(long id) {
        try {
            return interviewDAO.getById(id);
        } catch (Exception e) {
            System.out.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Interview> getAll(){
        try{
            return interviewDAO.getAll();
        } catch (Exception e) {
            System.out.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Interview> searchByInterviewName(String name) {
        try {
            return interviewDAO.searchByInterviewName(name);
        } catch (Exception e) {
            System.out.println("ERROR searchByInterviewName " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Interview> getPublicInterview(){
        try{
            return interviewDAO.getPublicInterview();
        }catch (Exception e){
            System.out.println("ERROR getPublicInterview " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Interview> searchByCreator(long id){
        try{
            return interviewDAO.searchByCreator(id);
        }catch (Exception e){
            System.out.println("ERROR searchByCreator " + e.getStackTrace());
        }
        return null;
    }
}
