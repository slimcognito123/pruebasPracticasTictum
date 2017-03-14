package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.user.BasicUser;
import com.tt.ticinterview.beans.user.Candidate;
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

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@RequestMapping("/register.do")
public class Register {

    @Autowired
    private UserManager userManager;

    @RequestMapping(method=RequestMethod.GET)
    public String registerGet(@ModelAttribute("registro") Candidate usuarioRecibido) {

        try {

            userManager.register(usuarioRecibido);

            return "redirect: login.do";

        }catch (Exception e){
            return "register";
        }

    }

    @RequestMapping(method=RequestMethod.POST)
    public String registerPost(@ModelAttribute("registro") Candidate usuarioRecibido) {

        try {

            userManager.register(usuarioRecibido);

            return "redirect: login.do";

        }catch (Exception e){
            return "register";
        }
    }

}
