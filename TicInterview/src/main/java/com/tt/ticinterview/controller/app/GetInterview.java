package com.tt.ticinterview.controller.app;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.beans.user.BasicUser;
import com.tt.ticinterview.model.manager.InterviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by tictumTarde on 13/03/2017.
 */

@Controller
@RequestMapping("/GetInterview.do")
public class GetInterview {

    @Autowired
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView getInterviewGet(HttpServletRequest request, HttpSession session) {

        //Creamos una variable modelo/vista
        ModelAndView modelo = new ModelAndView();

        Interview interview;
        session = request.getSession();
        BasicUser user = (BasicUser) session.getAttribute("user");

        //Recogemos el id de la entrevista
        Integer idInterview = Integer.parseInt(request.getParameter("idInterview"));


        //Con la variable mail recuperamos el usuario
        if (interviewManager.getById(idInterview) == null) {
            interview = interviewManager.getById(idInterview);

               switch (user.getInstanceName()) {
                   case "admin":
                       modelo.setViewName("/Admin/PanelManager");
                       modelo.addObject("interview", interview);
                       break;
                   case "interviewer":
                       modelo.setViewName("/Interviewer/PanelInterviewer");
                       modelo.addObject("interview", interview);
                       break;
                   case "candidate":
                       modelo.setViewName("/Candidate/PanelCandidate");
                       modelo.addObject("interview", interview);
                       break;
               }
        }

        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView getInterviewPost(HttpServletRequest request, HttpSession session) {

        //Creamos una variable modelo/vista
        ModelAndView modelo = new ModelAndView();

        Interview interview;
        session = request.getSession();
        BasicUser user = (BasicUser) session.getAttribute("user");

        //Recogemos el id de la entrevista
        Integer idInterview = Integer.parseInt(request.getParameter("idInterview"));


        //Con la variable mail recuperamos el usuario
        if (interviewManager.getById(idInterview) == null) {
            interview = interviewManager.getById(idInterview);

            switch (user.getInstanceName()) {
                case "admin":
                    modelo.setViewName("/Admin/PanelManager");
                    modelo.addObject("interview", interview);
                    break;
                case "interviewer":
                    modelo.setViewName("/Interviewer/PanelInterviewer");
                    modelo.addObject("interview", interview);
                    break;
                case "candidate":
                    modelo.setViewName("/Candidate/PanelCandidate");
                    modelo.addObject("interview", interview);
                    break;
            }
        }

        return modelo;
    }

}
