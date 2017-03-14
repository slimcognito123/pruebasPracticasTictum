/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.controller.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tt.ticinterview.model.manager.InterviewManager;
import com.tt.ticinterview.model.manager.UserManager;

@Controller
@RequestMapping("/ShowPublicInterviews.do")
public class ShowPublicInterviews {
	@Autowired
	InterviewManager interviewManager;
	@RequestMapping(method = RequestMethod.GET)
	public String showPublicGet(Model modelo) {
		
		modelo.addAttribute("list", interviewManager.getPublicInterview());
		return "PanelCandidate.jsp";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveVideoPost( Model modelo) {
		return showPublicGet(modelo);
	}
}
