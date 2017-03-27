package com.tt.ticinterview.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@SessionAttributes("user")
@RequestMapping("/Logout.do")
public class Logout {

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView logoutGet(HttpSession sesion) {

        ModelAndView modelo = new ModelAndView();

        sesion.invalidate();

        modelo.setViewName("index");

        return modelo;
    }


    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView logoutPost(HttpSession sesion) {

        ModelAndView modelo = new ModelAndView();

        sesion.invalidate();

        modelo.setViewName("index");

        return modelo;
    }

}
