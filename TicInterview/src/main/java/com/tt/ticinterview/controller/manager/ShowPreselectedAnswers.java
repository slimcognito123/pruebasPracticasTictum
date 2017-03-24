package com.tt.ticinterview.controller.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.manager.AnswerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

@Controller
@RequestMapping("/showPreselectedAnswers.do")
public class ShowPreselectedAnswers {

    @Autowired
    @Qualifier("AnswerManager")
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView AnswersGet(){

        ModelAndView modelo =  new ModelAndView();

        List<Answer> preselectedAnswers = answerManager.getAll();

        modelo.addObject("respuestasPreseleccionadas", preselectedAnswers);
        modelo.setViewName("/Manager/ShowAllAnswer");

        return  modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView AnswersPost(){

        ModelAndView modelo =  new ModelAndView();

        List<Answer> preselectedAnswers = answerManager.getAll();

        modelo.addObject("respuestasPreseleccionadas", preselectedAnswers);
        modelo.setViewName("/Manager/ShowAllAnswer");

        return  modelo;
    }

}
