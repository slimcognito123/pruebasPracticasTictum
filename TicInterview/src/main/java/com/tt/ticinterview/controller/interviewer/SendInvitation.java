package com.tt.ticinterview.controller.interviewer;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.manager.AnswerManager;
import com.tt.ticinterview.model.manager.InterviewerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by tictumTarde on 14/03/2017.
 */
@Controller
@RequestMapping("/sendInvitation.do")
public class SendInvitation {

    @Autowired
    private InterviewerManager interviewerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView sendInvitationGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idCandidate = Long.parseLong(request.getParameter("idCandidate"));
        long  idInterviewer = Long.parseLong(request.getParameter("idInterviewer"));

        interviewerManager.sendInvitation(idCandidate, idInterviewer);

        modelo.setViewName("/Interviewer/PanelInterviewer");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView sendInvitationPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idCandidate = Long.parseLong(request.getParameter("idCandidate"));
        long  idInterviewer = Long.parseLong(request.getParameter("idInterviewer"));

        interviewerManager.sendInvitation(idCandidate, idInterviewer);

        modelo.setViewName("/Interviewer/PanelInterviewer");

        return  modelo;

    }

}