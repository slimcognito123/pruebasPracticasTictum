package com.tt.ticinterview.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@SessionAttributes("user")
@RequestMapping("/logout.do")
public class Logout {

    @RequestMapping(method= RequestMethod.GET)
    public String logoutGet(HttpSession sesion) {

        sesion.invalidate();

        return "redirect: index.do";
    }


    @RequestMapping(method= RequestMethod.POST)
    public String logoutPost(HttpSession sesion) {

        sesion.invalidate();

        return "redirect: index.do";
    }

}
