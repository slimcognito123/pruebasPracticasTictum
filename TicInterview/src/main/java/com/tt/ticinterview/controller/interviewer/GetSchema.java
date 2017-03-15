package com.tt.ticinterview.controller.interviewer;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.manager.InterviewManager;
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
@RequestMapping("/getSchema.do")
public class GetSchema {

    @Autowired
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getSchemasGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));

        Interview maquetaRecuperada = interviewManager.getById(idInterview);

        modelo.addObject("maquetaRecuperada", maquetaRecuperada);
        modelo.setViewName("/Interviewer/ShowAnwer");

        return  modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView getSchemasPost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idInterview = Long.parseLong(request.getParameter("idInterview"));

        Interview maquetaRecuperada = interviewManager.getById(idInterview);

        modelo.addObject("maquetaRecuperada", maquetaRecuperada);
        modelo.setViewName("/Interviewer/ShowAnwer");

        return  modelo;
    }

}
