package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.model.manager.InterviewerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tictum on 14/03/2017.
 */
@Controller
@RequestMapping("/sendInvitation.do")
public class SendInvitation {
    @Autowired
    InterviewerManager interviewerManager;

    // TODO investigar Spring mail, debe enviar una invitacion por mail y preregistrar

}
