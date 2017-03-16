package com.tt.ticinterview.controller.manager;

import com.tt.ticinterview.model.manager.InterviewerManager;
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
@RequestMapping("/UpdateValoration.do")
public class UpdateValoration {

    @Autowired
    private InterviewerManager interviewerManager;

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView sendInvitationPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));
        long  idInterviewer = Long.parseLong(request.getParameter("idInterviewer"));

        interviewerManager.valorationAnswer(idInterview, idInterviewer);

        modelo.setViewName("/Manager/...");

        return  modelo;

    }
}
