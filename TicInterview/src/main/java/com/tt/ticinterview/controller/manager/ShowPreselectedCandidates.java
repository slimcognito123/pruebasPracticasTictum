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

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */
@Controller
@RequestMapping("/showPreselectedCandidates.do")
public class ShowPreselectedCandidates {

    @Autowired
    @Qualifier("AnswerManager")
    private AnswerManager answerManager;
    @Autowired
    @Qualifier("CandidateManager")
    private CandidateManager candidateManager;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showPreselectedCandidatesGet() {

        ModelAndView modelo = new ModelAndView();
        List<Candidate> listaPreseleccionados = new ArrayList<>();

        List<Answer> listaAnswers = answerManager.getAll();

        for (Answer answer : listaAnswers) {
            if (answer.getValoration() > 5) {
                listaPreseleccionados.add(candidateManager.getById(answer.getIdCandidate().getId()));
            }

        }

        modelo.addObject("listaPreseleccionados", listaPreseleccionados);
        modelo.setViewName("/Manager/PanelManager");

        return modelo;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView showPreselectedCandidatesPost() {

        ModelAndView modelo = new ModelAndView();
        List<Candidate> listaPreseleccionados = new ArrayList<>();

        List<Answer> listaAnswers = answerManager.getAll();

        for (Answer answer : listaAnswers) {
            if (answer.getValoration() > 5) {
                listaPreseleccionados.add(candidateManager.getById(answer.getIdCandidate().getId()));
            }

        }

        modelo.addObject("listaPreseleccionados", listaPreseleccionados);
        modelo.setViewName("/Manager/PanelManager");

        return modelo;
    }
}
