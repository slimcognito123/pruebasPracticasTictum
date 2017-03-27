package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.user.Interviewer;
import old.tt.ticinterview.model.dao.CandidateDAO;
import old.tt.ticinterview.model.dao.InterviewerDAO;
import com.tt.ticinterview.services.MailServiceImpl;
import java.util.ArrayList;
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
public class InterviewerManager implements UserManager<Interviewer> {

    @Autowired
    @Qualifier("InterviewerDAO")
    private InterviewerDAO interviewerDAO;

    @Autowired
    @Qualifier("CandidateDAO")
    private CandidateDAO candidateDAO;

    @Autowired
    private MailServiceImpl mailService;

    @Transactional
    @Override
    public void register(Interviewer interviewer) {
        try {
            System.out.println("Guardado");
            //interviewerDAO.save(interviewer);
        } catch (Exception e) {
            System.err.println("Error save: " + e);
        }

    }

    @Transactional
    @Override
    public void delete(Interviewer interviewer) {
        try {
            System.out.println("borrado");
           // interviewerDAO.delete(interviewer);
        } catch (Exception e) {
            System.err.println("Error delete: " + e);
        }
    }

    @Override
    public Interviewer getById(long id) {
        try {
            return new Interviewer(555, "Pablo", "sdfdfg", "sadfsdf", true);
           // return interviewerDAO.getById(id);
        } catch (Exception e) {
            System.err.println("Error getById: " + e);
        }
        return null;
    }

    @Override
    public Interviewer getByMail(String mail) {
        try {
             return new Interviewer(234, "Pablo", "sdfdfg", "sadfsdf", true);
         //   return interviewerDAO.getUserMail(mail);
        } catch (Exception e) {
            System.err.println("ERROR getByMail " + e.getStackTrace());
        }
        return null;
    }

    @Override
    public List<Interviewer> getAll() {
        try {
             return new ArrayList<>();
           // return interviewerDAO.getAll();
        } catch (Exception e) {
            System.err.println("Error getAll: " + e);
        }
        return null;
    }

    @Transactional
    @Override
    public void modify(Interviewer interviewer) {
        try {
            System.out.println("modificado");
           // interviewerDAO.modify(interviewer);
        } catch (Exception e) {
            System.err.println("ERROR modify " + e.getStackTrace());
        }
    }

    public List<Interviewer> getManager() {
        try {
             return new ArrayList<>();
            //return interviewerDAO.getManagers();
        } catch (Exception e) {
            System.err.println("Error getManager: " + e);
        }
        return null;
    }

    public List<Interviewer> getInterviewers() {
        try {
             return new ArrayList<>();
           // return interviewerDAO.getInterviewers();
        } catch (Exception e) {
            System.err.println("Error getInterviewers: " + e);
        }
        return null;
    }

    @Transactional
    public void sendInvitation(long idCandidate, long idInterview) {

        try {
            Candidate candidate = candidateDAO.getById(idCandidate);

            mailService.send(candidate.getMail(), "Inviatacion Entrevista", "Sie haben eine Termin mit uns");
        } catch (Exception e) {
            final String msg = "Excepción en el envío de emails con recursos incrustados.";
            System.err.println("\033[33m" + msg);
            System.err.print("\033[32m" + e.getStackTrace());
            e.printStackTrace();
        }
    }

}
