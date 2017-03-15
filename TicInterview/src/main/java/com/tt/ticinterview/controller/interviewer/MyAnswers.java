package com.tt.ticinterview.controller.interviewer;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.manager.AnswerManager;
import com.tt.ticinterview.model.manager.InterviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tictumTarde on 14/03/2017.
 */
@Controller
@RequestMapping("/myAnswers.do")
public class MyAnswers {

    @Autowired
    private InterviewManager interviewManager;
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView myAnswersGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));

        List<Answer> respuestasEntrevistaSeleccionada = answerManager.getAll().stream().filter(answer -> answer.getIdInterview()==idInterview).collect(Collectors.toList());

        modelo.addObject("respuestasEntrevistaSeleccionada", respuestasEntrevistaSeleccionada);
        modelo.setViewName("/Interviewer/ShowMuyAnwers");

        return  modelo;
    }

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView myAnswersPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));
//        List<Answer> respuestaEntrevistaSeleccionada = interviewManager.getById(idInterview).getA

        List<Answer> respuestasEntrevistaSeleccionada = answerManager.getAll().stream().filter(answer -> answer.getIdInterview()==idInterview).collect(Collectors.toList());

        modelo.addObject("respuestasEntrevistaSeleccionada", respuestasEntrevistaSeleccionada);
        modelo.setViewName("/Interviewer/ShowMuyAnwers");

        return  modelo;
    }
}
