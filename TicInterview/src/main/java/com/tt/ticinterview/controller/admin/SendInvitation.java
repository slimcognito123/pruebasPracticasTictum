package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.manager.InterviewerManager;
import com.tt.ticinterview.services.MailService;
import com.tt.ticinterview.services.MailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.Session;

/**
 * Created by Tictum on 14/03/2017.
 */
@Controller
@RequestMapping("/sendInvitation.do")
public class SendInvitation {
    @Autowired
    InterviewerManager interviewerManager;

    // TODO DONE investigar Spring mail, debe enviar una invitacion por mail y preregistrar
    
    @RequestMapping(method = RequestMethod.POST)
    public String enviarMailYGuardarEnBD(Interviewer interviewer, Session session){
        if(session== null) return "index";
        interviewerManager.register(interviewer);
        MailService service = new MailServiceImpl();
        String subject = "ha sido seleccionado como manager/entrevistador en nuestra aplicacion, enhorabuena";
        String cuerpoMail = "Buenas\n para entrar en la aplicacion use las siguientes credenciales:\n" +
                "usuario:"+interviewer.getMail()+"\n contrasena:"+interviewer.getPassword()+"" +
                "\n esperamos que tenga una buena estancia por nuestra aplicacion\n" +
                "atentamente, el equipo tecnico de TicInterview.";
        service.send(interviewer.getMail(), subject, cuerpoMail);
        return "adminGlobal";
    }
}
