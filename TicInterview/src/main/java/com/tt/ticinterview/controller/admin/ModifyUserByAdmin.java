package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.manager.InterviewerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by Tictum on 14/03/2017.
 */
@Controller
@RequestMapping("/ModifyUserByAdmin.do")
public class ModifyUserByAdmin {
    @Autowired
    @Qualifier("InterviewerManager")
    private InterviewerManager business;

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(Interviewer interviewer, HttpSession session) {
        if (session == null) return "index";
        business.modify(interviewer);
        return "adminGlobal";
    }
}
