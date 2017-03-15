package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.model.dao.CandidateDAO;
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

@Service("CandidateManager")
public class CandidateManager implements UserManager<Candidate> {

    @Autowired
    @Qualifier("CandidateDAO")
    private CandidateDAO candidateDAO;

    @Transactional
    public void register(Candidate candidate){
        try{
            candidateDAO.save(candidate);
        }catch(Exception e){
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public Candidate getById(long id){
        try{
            return candidateDAO.getById(id);
        }catch(Exception e){
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public Candidate getByMail(String mail){
        try{
            return candidateDAO.getUserMail(mail);
        }catch(Exception e){
            System.err.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Candidate> getAll(){
        try{
            return candidateDAO.getAll();
        }catch(Exception e){
            System.err.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public void modify(Candidate candidate){
        try{
            candidateDAO.modify(candidate);
        }catch(Exception e){
            System.err.println("ERROR modify " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete(Candidate candidate){
        try{
            candidateDAO.delete(candidate);
        }catch(Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public List<Interview> getOwnInterviews(Candidate candidate){
        try{
            return candidateDAO.getOwnInterviews(candidate);
        }catch(Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
        return null;
    }
}
