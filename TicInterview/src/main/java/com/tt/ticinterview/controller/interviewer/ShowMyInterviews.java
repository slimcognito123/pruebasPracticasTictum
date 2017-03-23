package com.tt.ticinterview.controller.interviewer;

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
import java.util.Arrays;
import java.util.List;

/**
 * Created by tictumTarde on 14/03/2017.
 */
@Controller
@RequestMapping("/ShowMyInterviews.do")
public class ShowMyInterviews {

    @Autowired
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView showMyInterviewsGet(HttpServletRequest request, HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        List<Interview> misEntrevista = interviewManager.getAll();

        session = request.getSession();
        BasicUser user = (BasicUser) session.getAttribute("user");

        modelo.setViewName("/Interviewer/ShowMyInterviews");

        modelo.addObject("misEntrevistas", Arrays.asList(misEntrevista.stream().filter(item -> item.getId()==user.getId()).toArray()));

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView showMyInterviewsPost(HttpServletRequest request, HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        List<Interview> Entrevista = interviewManager.getAll();

        session = request.getSession();
        BasicUser user = (BasicUser) session.getAttribute("user");

        modelo.setViewName("/Interviewer/ShowMyInterviews");

        modelo.addObject("misEntrevistas", Arrays.asList(Entrevista.stream().filter(item -> item.getId()==user.getId()).toArray()));

        return  modelo;

    }
}
