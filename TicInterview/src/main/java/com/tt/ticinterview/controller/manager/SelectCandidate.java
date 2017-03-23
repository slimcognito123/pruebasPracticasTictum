package com.tt.ticinterview.controller.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.model.manager.AnswerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

@Controller
@RequestMapping("/selectCandidate.do")
public class SelectCandidate {

    @Autowired
    @Qualifier("AnswerManager")
    private AnswerManager answerManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView selectCandidateGet(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

//        long  idSelectCandidate = Long.parseLong(request.getParameter("idSelectCandidate"));
//
//        List<Answer> listaRespuestas = answerManager.getAll();
//        for (Answer answer : listaRespuestas) {
//            if (answer.getIdCandidate() == idSelectCandidate) {
//                answer.setIsSelected(true);
//                answerManager.modify(answer);
//            }
//        }
//
//        modelo.setViewName("/Manager/PanelManager");

        return  modelo;

    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView selectCandidatePost(HttpServletRequest request){

        ModelAndView modelo =  new ModelAndView();

        long  idSelectCandidate = Long.parseLong(request.getParameter("idSelectCandidate"));

//        List<Answer> listaRespuestas = answerManager.getAll();
//        for (Answer answer : listaRespuestas) {
//            if (answer.getIdCandidate() == idSelectCandidate) {
//                answer.setIsSelected(true);
//                answerManager.modify(answer);
//            }
//        }

        modelo.setViewName("/Manager/PanelManager");

        return  modelo;

    }

}
