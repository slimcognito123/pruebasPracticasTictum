package com.tt.ticinterview.controller.manager;

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
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

@Controller
@RequestMapping("/updateValoration.do")
public class UpdateValoration {

    @Autowired
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView sendInvitationPost(HttpServletRequest request, Answer answer){

        ModelAndView modelo =  new ModelAndView();

        int updateValoration = Integer.parseInt(request.getParameter("updateValoration"));

        answer.setValoration(updateValoration);

        answerManager.modify(answer);

        modelo.setViewName("/Manager/PanelManager");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView sendInvitationGet(HttpServletRequest request, Answer answer){

        ModelAndView modelo =  new ModelAndView();

        int updateValoration = Integer.parseInt(request.getParameter("updateValoration"));

        answer.setValoration(updateValoration);

        answerManager.modify(answer);

        modelo.setViewName("/Manager/PanelManager");

        return  modelo;

    }
}
