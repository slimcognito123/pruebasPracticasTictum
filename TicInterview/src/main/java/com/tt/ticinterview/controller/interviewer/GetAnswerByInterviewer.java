package com.tt.ticinterview.controller.interviewer;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.manager.AnswerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by tictumTarde on 14/03/2017.
 */
@Controller
@RequestMapping("/GetAnswerByInterviewer.do")
public class GetAnswerByInterviewer {

    @Autowired
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getAnswerGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        Answer respuestaRecuperada = answerManager.getById(idAnswer);

        modelo.addObject("respuestaRecuperada", respuestaRecuperada);
        modelo.setViewName("/Interviewer/ShowAnwer");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView getAnswerPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        Answer respuestaRecuperada = answerManager.getById(idAnswer);

        modelo.addObject("respuestaRecuperada", respuestaRecuperada);
        modelo.setViewName("/Interviewer/ShowAnwer");

        return  modelo;

    }
}
