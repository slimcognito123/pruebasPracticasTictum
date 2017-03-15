package com.tt.ticinterview.controller.interviewer;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.manager.InterviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by tictumTarde on 14/03/2017.
 */
public class MyAnswers {

    @Autowired
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView myAnswersGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));
        long  idAnswer = Long.parseLong(request.getParameter("idAnswer"));

        List<Answer> respuestaEntrevistaSeleccionada = interviewManager.getById(idInterview).getA

        Interview maquetaRecuperada = interviewManager.getById(idInterview);

        modelo.addObject("maquetaRecuperada", maquetaRecuperada);
        modelo.setViewName("/Interviewer/ShowAnwer");

        return  modelo;
    }
}
