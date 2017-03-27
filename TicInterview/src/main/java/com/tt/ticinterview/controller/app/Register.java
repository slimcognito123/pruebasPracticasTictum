package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.user.BasicUser;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.model.manager.CandidateManager;
import com.tt.ticinterview.model.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Qualifier;

import java.time.LocalDateTime;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@RequestMapping("/Register.do")
public class Register {

    @Autowired
    @Qualifier("CandidateManager")
    private CandidateManager userManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView registerGet(HttpServletRequest request) {

        ModelAndView modelo = new ModelAndView();

        modelo.setViewName("/access/log");

        try {

            Candidate candidate = new Candidate(request.getParameter("username"),request.getParameter("surname"),
                    request.getParameter("dni"), request.getParameter("address"),LocalDateTime.parse(request.getParameter("date")),
                    Integer.parseInt(request.getParameter("phoneNumber")), request.getParameter("mail"),
                    request.getParameter("password"));

            userManager.register(candidate);

        }catch (Exception e){
            return modelo;
        }

        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView registerPost(HttpServletRequest request) {

        ModelAndView modelo = new ModelAndView();

        modelo.setViewName("/access/log");

        try {

            Candidate candidate = new Candidate(request.getParameter("username"),request.getParameter("surname"),
                    request.getParameter("dni"), request.getParameter("address"),LocalDateTime.parse(request.getParameter("date")),
                    Integer.parseInt(request.getParameter("phoneNumber")), request.getParameter("mail"),
                    request.getParameter("password"));

            userManager.register(candidate);

        }catch (Exception e){
            return modelo;
        }

        return modelo;
    }

}
