package com.tt.ticinterview.controller.manager;

import com.tt.ticinterview.beans.Interview.Answer;
import com.tt.ticinterview.beans.user.Candidate;
import com.tt.ticinterview.model.manager.AnswerManager;
import com.tt.ticinterview.model.manager.CandidateManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

@Controller
@RequestMapping("/getPreselected.do")
public class GetPreselected {

    @Autowired
    private AnswerManager answerManager;
    @Autowired
    private CandidateManager candidateManager;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView showPreselectedCandidatesGet(){

        ModelAndView modelo =  new ModelAndView();
        List<Candidate> listaPreseleccionados = new ArrayList<>();

        List<Answer> listaAnswers = answerManager.getAll();

        for (Answer answer:listaAnswers) {
            if(answer.isSelected()){
                listaPreseleccionados.add(candidateManager.getById(answer.getIdCandidate()));
            }

        }

        modelo.addObject("listaPreseleccionados", listaPreseleccionados);
        modelo.setViewName("/Manager/PanelManager");

        return modelo;
    }

    @RequestMapping(method= RequestMethod.POST)
    public ModelAndView showPreselectedCandidatesPost(){

        ModelAndView modelo =  new ModelAndView();
        List<Candidate> listaPreseleccionados = new ArrayList<>();

        List<Answer> listaAnswers = answerManager.getAll();

        for (Answer answer:listaAnswers) {
            if(answer.getValoration() > 5){
                listaPreseleccionados.add(candidateManager.getById(answer.getIdCandidate()));
            }

        }

        modelo.addObject("listaPreseleccionados", listaPreseleccionados);
        modelo.setViewName("/Manager/PanelManager");

        return modelo;
    }

}
