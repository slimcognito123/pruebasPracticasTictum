/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author tictumTarde
 */
@Controller
@RequestMapping("/ShowAllInterviews.do")
public class ShowAllInterviews {
    @Autowired
    private InterviewManager business;

    @RequestMapping(method = RequestMethod.POST)
    public String showAllInterviews(HttpSession session) {

        if (session == null) return "AdminGlobal";
        ArrayList<Interview> listaInterviews = (ArrayList<Interview>) business.getAll();
        if (listaInterviews == null) listaInterviews = new ArrayList<>();
        return "ShowAllInterviews";
    }
}
