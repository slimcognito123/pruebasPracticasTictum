package com.tt.ticinterview.controller.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.manager.AnswerManager;
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
@RequestMapping("/getAnswer.do")
public class GetAnswer {

    @Autowired
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getAnswerGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        Answer respuestaRecuperada = answerManager.getById(idAnswer);

        modelo.addObject("respuestaRecuperada", respuestaRecuperada);
        modelo.setViewName("/Manager/ShowAnswer");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView getAnswerPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        Answer respuestaRecuperada = answerManager.getById(idAnswer);

        modelo.addObject("respuestaRecuperada", respuestaRecuperada);
        modelo.setViewName("/Manager/ShowAnswer");

        return  modelo;

    }
}
