package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.user.BasicUser;
import com.tt.ticinterview.model.manager.AdminManager;
import com.tt.ticinterview.model.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@RequestMapping("/Login.do")
public class Login {

    @Autowired    
    private AdminManager userManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView loginGet(HttpServletRequest request) {

        //Creamos una variable modelo/vista en la que guardaremos redireccionamiento y usario
        ModelAndView modelo = new ModelAndView();

        BasicUser user;

        //Recogemos el correo y el pass del formulario
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");

        //Con la variable mail recuperamos el usuario
        if (userManager.getByMail(mail)!=null){
            user = (BasicUser) userManager.getByMail(mail);

            if (user.getPassword().equals(password)){
                switch (user.getInstanceName()){
                    case "admin":
                        modelo.setViewName("/Admin/PanelAdmin");
                        modelo.addObject("user",user);
                        break;
                    case "interviewer":
                        modelo.setViewName("/Interview/PanelInterviewer");
                        modelo.addObject("user",user);
                        break;
                    case "candidate":
                        modelo.setViewName("/Candidate/PanelCandidate");
                        modelo.addObject("user",user);
                        break;
                }
            }
        }

        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView loginPost(HttpServletRequest request) {

        //Creamos una variable modelo/vista en la que guardaremos redireccionamiento y usario
        ModelAndView modelo = new ModelAndView();

        BasicUser user;

        //Recogemos el correo y el pass del formulario
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");

        //Con la variable mail recuperamos el usuario
        if (userManager.getByMail(mail)!=null){
            user = (BasicUser) userManager.getByMail(mail);

            if (user.getPassword().equals(password)){
                switch (user.getInstanceName()){

                    case "admin":
                        modelo.setViewName("/Admin/PanelAdmin");
                        modelo.addObject("user",user);
                        break;
                    case "interviewer":
                        modelo.setViewName("/Interview/PanelInterviewer");
                        modelo.addObject("user",user);
                        break;
                    case "candidate":
                        modelo.setViewName("/Candidate/PanelCandidate");
                        modelo.addObject("user",user);
                        break;
                }
            }
        }

        return modelo;
    }

}

