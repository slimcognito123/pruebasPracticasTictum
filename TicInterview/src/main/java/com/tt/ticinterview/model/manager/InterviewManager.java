package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.dao.InterviewDAO;
import java.util.ArrayList;
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

@Service("InterviewManager")
public class InterviewManager {

    @Autowired
    @Qualifier("InterviewDAO")
    private InterviewDAO interviewDAO;
    private ArrayList<Interview> interviews;

    @Transactional
    public void save(Interview interview){
        try{
            System.out.println("Guardado");
          //  interviewDAO.save(interview);
        }catch(Exception e){
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete (Interview interview){
        try{
            System.out.println("Borrado");
           // interviewDAO.delete(interview);
        }catch(Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }

  
    public Interview getById(long id) {
        try {
            return new Interview();
            //return interviewDAO.getById(id);
        } catch (Exception e) {
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }


    public List<Interview> getAll(){
        try{
            interviews = new ArrayList<>();
            Interview interview = new Interview(1,"pene",null,null,null, false, false);
            return interviews;
           // return interviewDAO.getAll();
        } catch (Exception e) {
            System.err.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }


    public List<Interview> searchByInterviewName(String name) {
        try {
                return new ArrayList<>();
            //return interviewDAO.searchByInterviewName(name);
        } catch (Exception e) {
            System.err.println("ERROR searchByInterviewName " + e.getStackTrace());
        }
        return null;
    }

  
    public List<Interview> getPublicInterview(){
        try{
             return new ArrayList<>();
          //  return interviewDAO.getPublicInterview();
        }catch (Exception e){
            System.err.println("ERROR getPublicInterview " + e.getStackTrace());
        }
        return null;
    }

   
    public List<Interview> searchByCreator(long id){
        try{
             return new ArrayList<>();
           // return interviewDAO.searchByCreator(id);
        }catch (Exception e){
            System.err.println("ERROR searchByCreator " + e.getStackTrace());
        }
        return null;
    }
}
