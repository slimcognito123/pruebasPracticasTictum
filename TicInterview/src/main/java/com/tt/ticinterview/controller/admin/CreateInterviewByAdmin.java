package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.manager.InterviewManager;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * Created by Tictum on 14/03/2017.
 */
@Controller
@RequestMapping("/CreateInterviewByAdmin.do")
public class CreateInterviewByAdmin {
    @Autowired
    @Qualifier("InterviewManager")
    private InterviewManager business;

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(Interview interview, HttpSession session) {
        if (session == null) return "index";
        business.save(interview);
        return "adminGlobal";
    }
}
