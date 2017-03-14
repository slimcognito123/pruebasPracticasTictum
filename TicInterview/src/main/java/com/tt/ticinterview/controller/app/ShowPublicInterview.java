package com.tt.ticinterview.controller.app;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by tictumTarde on 13/03/2017.
 */
public class ShowPublicInterview {


    public ModelAndView showPublicInterviews(HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        if (session.getAttribute("user")==null){
            modelo.setViewName("index");
        }else{
            modelo.setViewName("panelCandidate");
        }

        return modelo;
    }
}
