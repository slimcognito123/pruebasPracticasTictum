package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.manager.InterviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@RequestMapping("/ShowPublicInterview.do")
public class ShowPublicInterview {


    @Autowired
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView showPublicInterviewsGet(HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        List<Interview> entrevistasPublicas = interviewManager.getAll();

        modelo.addObject(entrevistasPublicas);

        if (session.getAttribute("user")==null){
            modelo.setViewName("index");
        }else{
            modelo.setViewName("panelCandidate");
        }

        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView showPublicInterviewsPost(HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        List<Interview> entrevistasPublicas = interviewManager.getAll();

        modelo.addObject(entrevistasPublicas);

        if (session.getAttribute("user")==null){
            modelo.setViewName("index");
        }else{
            modelo.setViewName("panelCandidate");
        }

        return modelo;
    }
}
