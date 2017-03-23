package com.tt.ticinterview.controller.interviewer;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.manager.InterviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by tictumTarde on 14/03/2017.
 */

@Controller
@RequestMapping("/CreateInterviewByInterviewer.do")
public class CreateInterviewByInterviewer {

    @Autowired
    private InterviewManager interviewManager;

    public ModelAndView createInterview(Interview interview){

        //Creamos una variable modelo/vista
        ModelAndView modelo = new ModelAndView();

        interviewManager.save(interview);

        modelo.setViewName("/Interviewer/PanelInterviewer");

        return modelo;
    }
}
