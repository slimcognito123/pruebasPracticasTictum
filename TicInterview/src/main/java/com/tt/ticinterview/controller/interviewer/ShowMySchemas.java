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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by tictumTarde on 14/03/2017.
 */

@Controller
@RequestMapping("/ShowMySchemas.do")
public class ShowMySchemas {

    @Autowired
    private InterviewManager interviewManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView showMySchemasGet(HttpServletRequest request, HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        List<Interview> entrevista = interviewManager.getAll();

        session = request.getSession();
        BasicUser user = (BasicUser) session.getAttribute("user");

        List<Interview> misEntrevistas  = entrevista.stream().filter(item -> item.getId()==user.getId()).collect(Collectors.toCollection(ArrayList::new));

        List<Interview> misMaquetas = misEntrevistas.stream().filter(item -> item.isSchema()==true).collect(Collectors.toCollection(ArrayList::new));

        modelo.addObject("misMaquetas", misMaquetas);
        modelo.setViewName("/Interviewer/ShowMySchemas");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView showMySchemasPost(HttpServletRequest request, HttpSession session){

        ModelAndView modelo =  new ModelAndView();

        List<Interview> entrevista = interviewManager.getAll();

        session = request.getSession();
        BasicUser user = (BasicUser) session.getAttribute("user");

        List<Interview> misEntrevistas  = entrevista.stream().filter(item -> item.getId()==user.getId()).collect(Collectors.toCollection(ArrayList::new));

        List<Interview> misMaquetas = misEntrevistas.stream().filter(item -> item.isSchema()==true).collect(Collectors.toCollection(ArrayList::new));

        modelo.addObject("misMaquetas", misMaquetas);
        modelo.setViewName("/Interviewer/ShowMySchemas");

        return  modelo;

    }

}
