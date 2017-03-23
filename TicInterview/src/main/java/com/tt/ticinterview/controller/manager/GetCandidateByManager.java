package com.tt.ticinterview.controller.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.model.manager.CandidateManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

@Controller
@RequestMapping("/GetCandidateByManager.do")
public class GetCandidateByManager {

    @Autowired
    private CandidateManager candidateManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getCandidateGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idCandidate = Long.parseLong(request.getParameter("idAnswer"));

        Candidate candidate = candidateManager.getById(idCandidate);

        modelo.addObject("candidatoRecuperado", candidate);
        modelo.setViewName("/Interviewer/PanelManager");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView getCandidatePost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idCandidate = Long.parseLong(request.getParameter("idAnswer"));

        Candidate candidate = candidateManager.getById(idCandidate);

        modelo.addObject("candidatoRecuperado", candidate);
        modelo.setViewName("/Interviewer/PanelManager");

        return  modelo;

    }

}
