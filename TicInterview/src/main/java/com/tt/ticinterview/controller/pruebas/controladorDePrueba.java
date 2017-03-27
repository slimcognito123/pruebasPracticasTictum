package com.tt.ticinterview.controller.pruebas;

import com.tt.ticinterview.beans.user.Admin;
import com.tt.ticinterview.beans.user.Interviewer;
import com.tt.ticinterview.model.manager.AdminManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;


/**
 * Created by Tictum on 24/03/2017.
 */
@Controller
@RequestMapping("/pruebas.do")
public class controladorDePrueba {
    @Autowired
    AdminManager interviewerManager;

    @RequestMapping(method = RequestMethod.GET)
    public String prueba() {
        Admin interviuguer= new Admin(1234,"patata","patata");
        interviewerManager.register(interviuguer);
//        ArrayList<Admin> interviewers= (ArrayList<Admin>) interviewerManager.getAll();
//        for (Admin interviewer : interviewers) {
//            System.out.println(interviewer.getUsername());
//        }
        return "index";
    }
}
