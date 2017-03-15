package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.manager.AnswerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by Tictum on 14/03/2017.
 */
@Controller
@RequestMapping("/ShowAllAnswer.do")
public class ShowAllAnswers {
    @Autowired
    private AnswerManager business;

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(Interviewer interviewer, HttpSession session) {
        if (session == null) return "index";
        business.getAll();
        return "adminGlobal";
    }
}
