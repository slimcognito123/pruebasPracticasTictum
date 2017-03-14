package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.model.manager.InterviewManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Created by Tictum on 14/03/2017.
 */
@Controller
@RequestMapping("/CreateUser.do")
public class createUser {
    @Autowired
    private InterviewManager business;

    @RequestMapping(method = RequestMethod.POST)
    public String createUser(HttpSession session) {
        if (session == null) return "index";
        ArrayList<Interview> listaInterviews = (ArrayList<Interview>) business.getAll();
        if (listaInterviews == null) listaInterviews = new ArrayList<>();
        return "showAllInterviews";
    }
}
