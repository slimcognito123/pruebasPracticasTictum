/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.controller.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.beans.video.CandidateVideo;
import com.tt.ticinterview.model.manager.CandidateManager;
import com.tt.ticinterview.model.manager.InterviewManager;
import com.tt.ticinterview.model.manager.UserManager;
import com.tt.ticinterview.model.manager.VideoManager;

@Controller
@RequestMapping("/OwnsInvitations.do")
@SessionAttributes("user")
public class OwnInvitations {
	@Autowired
	InterviewManager interviewManager;
	@Autowired
	CandidateManager candidateManager;
	@RequestMapping(method = RequestMethod.GET)
	public String showPublicGet(@ModelAttribute("user") Candidate user,Model modelo) {
		
		modelo.addAttribute("list", candidateManager.getOwnInterviews(user));
		return "PanelCandidate.jsp";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveVideoPost( @ModelAttribute("user") Candidate user,Model modelo) {
		return showPublicGet(user,modelo);
	}
}
