package com.tt.ticinterview.controller.interviewer;

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
@RequestMapping("/valorationAnswer.do")
public class ValorationAnswer {


    @Autowired
    private InterviewerManager interviewerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView sendInvitationGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));
        long  idInterviewer = Long.parseLong(request.getParameter("idInterviewer"));

        interviewerManager.valorationAnswer(idInterview, idInterviewer);

        modelo.setViewName("/Interviewer/PanelInterviewer");

        return  modelo;

    }


}
