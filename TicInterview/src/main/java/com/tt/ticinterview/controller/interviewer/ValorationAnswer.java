package com.tt.ticinterview.controller.interviewer;

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
@RequestMapping("/valorationAnswer.do")
public class ValorationAnswer {

    @Autowired
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView valorationAnswerGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        int valoration = Integer.parseInt(request.getParameter("valoration"));
        long idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        answerManager.valorationAnswer(idAnswer, valoration);

        modelo.setViewName("/Interviewer/PanelInterviewer");

        return  modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView valorationAnswerPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        int valoration = Integer.parseInt(request.getParameter("valoration"));
        long idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        answerManager.valorationAnswer(idAnswer, valoration);

        modelo.setViewName("/Interviewer/PanelInterviewer");

        return  modelo;
    }


}
