package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.beans.user.BasicUser;
import com.tt.ticinterview.model.manager.InterviewManager;
import com.tt.ticinterview.model.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by tictumTarde on 16/03/2017.
 */

@Controller
@RequestMapping("/")
public class WelcomeController {

    @Autowired
    private UserManager userManager;
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView welcomeControllerGet(HttpServletRequest request, HttpSession session) {

        ModelAndView modelo = new ModelAndView();

        BasicUser user = (BasicUser) session.getAttribute("user");

        List<Interview> entrevistasPublicas = interviewManager.getAll();

        modelo.addObject(entrevistasPublicas);

        if (user==null) {
            modelo.setViewName("index");
            return modelo;
        }

        switch (user.getInstanceName()) {
            case "admin":
                modelo.setViewName("Admin/PanelAdmin");
                break;
            case "interviewer":
                modelo.setViewName("Interview/PanelInterviewer");
                break;
            case "candidate":
                modelo.setViewName("Candidate/PanelCandidate");
                break;
        }

        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView welcomeControllerPost(HttpServletRequest request, HttpSession session) {

        ModelAndView modelo = new ModelAndView();

        BasicUser user = (BasicUser) session.getAttribute("user");

        List<Interview> entrevistasPublicas = interviewManager.getAll();

        modelo.addObject(entrevistasPublicas);

        if (user==null) {
            modelo.setViewName("index");
            return modelo;
        }

        switch (user.getInstanceName()) {
            case "admin":
                modelo.setViewName("Admin/PanelAdmin");
                break;
            case "interviewer":
                modelo.setViewName("Interview/PanelInterviewer");
                break;
            case "candidate":
                modelo.setViewName("Candidate/PanelCandidate");
                break;
        }

        return modelo;
    }
}
