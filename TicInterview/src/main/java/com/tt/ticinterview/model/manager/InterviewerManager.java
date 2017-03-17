package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.dao.CandidateDAO;
import com.tt.ticinterview.model.dao.InterviewerDAO;
import com.tt.ticinterview.services.MailServiceImpl;
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

@Service("InterviewerManager")
public class InterviewerManager implements UserManager<Interviewer>{

    @Autowired
    @Qualifier("InterviewerDAO")
    private InterviewerDAO interviewerDAO;

    @Autowired
    @Qualifier("CandidateDAO")
    private CandidateDAO candidateDAO;

    @Autowired
    private MailServiceImpl mailService;

    @Transactional
    public void register(Interviewer interviewer){
        try{
            interviewerDAO.save(interviewer);
        }
        catch (Exception e){
            System.err.println("Error save: " + e);
        }

    }

    @Transactional
    public void delete (Interviewer interviewer){
        try{
            interviewerDAO.delete(interviewer);
        }
        catch (Exception e){
            System.err.println("Error delete: " + e);
        }
    }

    @Transactional
    public Interviewer getById(long id){
        try{
            return interviewerDAO.getById(id);
        }
        catch (Exception e){
            System.err.println("Error getById: " + e);
        }
        return null;
    }

    @Override
    public Interviewer getByMail(String mail){
        try{
            return interviewerDAO.getUserMail(mail);
        }catch(Exception e){
            System.err.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Interviewer> getAll(){
        try{
            return interviewerDAO.getAll();
        }
        catch (Exception e){
            System.err.println("Error getAll: " + e);
        }
        return null;
    }

    @Override
    public void modify(Interviewer interviewer) {
        try{
            interviewerDAO.modify(interviewer);
        }catch(Exception e){
            System.err.println("ERROR modify " + e.getStackTrace());
        }
    }

    @Transactional
    public List<Interviewer> getManager(){
        try{
            return interviewerDAO.getManagers();
        }
        catch (Exception e){
            System.err.println("Error getManager: " + e);
        }
        return null;
    }

    @Transactional
    public List<Interviewer> getInterviewers(){
        try{
            return interviewerDAO.getInterviewers();
        }
        catch (Exception e){
            System.err.println("Error getInterviewers: " + e);
        }
        return null;
    }

    public void sendInvitation(long idCandidate, long idInterview) {

        try {
            Candidate candidate = candidateDAO.getById(idCandidate);

            mailService.send(candidate.getMail(), "Inviatacion Entrevista","Sie haben eine Termin mit uns");
        }
        catch(Exception e){
            final String msg = "Excepción en el envío de emails con recursos incrustados.";
            System.out.println("\033[33m"+msg);
            System.out.print("\033[32m"+e.getStackTrace());
            e.printStackTrace();
        }
    }
}
