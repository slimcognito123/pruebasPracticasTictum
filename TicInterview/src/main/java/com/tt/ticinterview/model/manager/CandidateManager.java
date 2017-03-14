package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.dao.CandidateDAO;
import com.tt.ticinterview.model.dao.InterviewerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CandidateManager {

    @Autowired
    @Qualifier("InterviewerDAO")
    CandidateDAO candidateDAO;

    public List<Interview> getOwnInterview(Candidate user){
    	 try{
             return candidateDAO.getOwnInterview(user);
         }
         catch (Exception e){
             System.out.println("Error getOwnInterview: " + e);
         }
         return null;
    }
}
