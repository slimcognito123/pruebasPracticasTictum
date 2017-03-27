package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.user.Admin;
import com.tt.ticinterview.beans.user.BasicUser;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.manager.AdminManager;
import com.tt.ticinterview.model.manager.CandidateManager;
import com.tt.ticinterview.model.manager.InterviewerManager;
import com.tt.ticinterview.model.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@RequestMapping("/Login.do")
public class Login {


    @Autowired
    @Qualifier("AdminManager")
    private AdminManager adminManager;

    @Autowired
    @Qualifier("InterviewerManager")
    private InterviewerManager interviewerManager;

    @Autowired
    @Qualifier("CandidateManager")
    private CandidateManager candidateManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView loginGet(HttpServletRequest request) {

        //Creamos una variable modelo/vista en la que guardaremos redireccionamiento y usario
        ModelAndView modelo = new ModelAndView();

        //Recogemos el correo y el pass del formulario
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");

        modelo.setViewName("/access/log");

        if (adminManager.getByMail(mail) != null) {

            Admin userAdmin = adminManager.getByMail(mail);

            if (userAdmin.getPassword().equals(password)){
                modelo.setViewName("/admin/PanelAdmin");
                modelo.addObject("user",userAdmin);
            }
        }

        if (interviewerManager.getByMail(mail) != null) {

            Interviewer userManager = interviewerManager.getByMail(mail);

            if (userManager.getPassword().equals(password)){
                if (userManager.isIsManager()) {
                    modelo.setViewName("/manager/PanelManager");
                    modelo.addObject("user",userManager);
                }else {
                    modelo.setViewName("/interview/PanelInterviewer");
                    modelo.addObject("user",userManager);
                }
            }
        }

        if (candidateManager.getByMail(mail) != null) {

            Candidate userCandidate = candidateManager.getByMail(mail);

            if (userCandidate.getPassword().equals(password)){
                modelo.setViewName("/candidate/PanelCandidate");
                modelo.addObject("user",userCandidate);
            }
        }



        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView loginPost(HttpServletRequest request) {


        //Creamos una variable modelo/vista en la que guardaremos redireccionamiento y usario
        ModelAndView modelo = new ModelAndView();

        //Recogemos el correo y el pass del formulario
        String mail = request.getParameter("mail");
        String password = request.getParameter("password");



        if (adminManager.getByMail(mail) != null) {

            Admin userAdmin = adminManager.getByMail(mail);

            if (userAdmin.getPassword().equals(password)){
                modelo.setViewName("/admin/PanelAdmin");
                modelo.addObject("user",userAdmin);
            }
        }

        if (interviewerManager.getByMail(mail) != null) {

            Interviewer userManager = interviewerManager.getByMail(mail);

            if (userManager.getPassword().equals(password)){
                if (userManager.isIsManager()) {
                    modelo.setViewName("/manager/PanelManager");
                    modelo.addObject("user",userManager);
                }else {
                    modelo.setViewName("/interview/PanelInterviewer");
                    modelo.addObject("user",userManager);
                }
            }
        }

        if (candidateManager.getByMail(mail) != null) {

            Candidate userCandidate = candidateManager.getByMail(mail);

            if (userCandidate.getPassword().equals(password)){
                modelo.setViewName("/candidate/PanelCandidate");
                modelo.addObject("user",userCandidate);
            }
        }

        return modelo;
    }

}

