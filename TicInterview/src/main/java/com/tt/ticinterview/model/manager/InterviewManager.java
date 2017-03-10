package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Interview;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

@Service
public class InterviewManager {

    public void save(Interview interview){

    }

    public void delete (Interview interview){

    }

    public Interview getById(long id){
        return null;
    }

    public List<Interview> getAll(){
        return null;
    }

    public List<Interview> searchByInterviewName(String name){
        return null;
    }

    public List<Interview> getPublicInterview(){
        return null;
    }

    public List<Interview> searchByCreator(long id){
        return null;
    }
}
