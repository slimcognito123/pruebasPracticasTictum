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
import com.tt.ticinterview.model.manager.InterviewManager;
import com.tt.ticinterview.model.manager.UserManager;
import com.tt.ticinterview.model.manager.VideoManager;

@Controller
@RequestMapping("/Aniadir.do")
@SessionAttributes("user")
public class SendInterviewAnswer {
	@Autowired
	VideoManager videoManager;
	@Autowired
	UserManager userManager;
	@Autowired
	InterviewManager interviewManager;
	@RequestMapping(method = RequestMethod.GET)
	public String saveVideo(@RequestParam(value = "name") String name,@ModelAttribute("user") Candidate user, Model modelo) {
		
		CandidateVideo video = new CandidateVideo();	
		video.setId(0);
		video.setPath(name);
		video.setName(name);
		videoManager.save(video);
		System.out.println("Destinatario: "+video.getName());
		return "GetInterview.do";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String saveVideoPost(@RequestParam(value = "name") String name,@ModelAttribute("user") Candidate user, Model modelo) {
		return saveVideo(name,user, modelo);
	}
}
