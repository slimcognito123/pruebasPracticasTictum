package com.tt.ticinterview.controller.admin;

import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.manager.InterviewerManager;
import com.tt.ticinterview.services.MailService;
import com.tt.ticinterview.services.MailServiceImpl;
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
@RequestMapping("/CreateUserByAdmin.do")
public class CreateUserByAdmin {
//    
//    @Autowired
//    @Qualifier("InterviewerManager")
//    private InterviewerManager interviewerManager;
// 
//            
//    @RequestMapping(method = RequestMethod.POST)
//    public String createUser(Interviewer interviewer, HttpSession session) {
//        if (session == null) return "index";
////        TODO DONE mandar mail al interiviewer
//        interviewerManager.register(interviewer);
//        MailService service = new MailServiceImpl();
//        String subject = "ha sido seleccionado como manager/entrevistador en nuestra aplicacion, enhorabuena";
//        String cuerpoMail = "Buenas\n para entrar en la aplicacion use las siguientes credenciales:\n" +
//                "usuario:" + interviewer.getMail() + "\n contrasena:" + interviewer.getPassword() + "" +
//                "\n esperamos que tenga una buena estancia por nuestra aplicacion\n" +
//                "atentamente, el equipo tecnico de TicInterview.";
//        service.send(interviewer.getMail(), subject, cuerpoMail);
//        return "adminGlobal";
//    }

}
