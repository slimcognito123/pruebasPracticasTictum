package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Attached;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

@Service
public class AttachedManager {

    @Autowired
    @Qualifier("AttachedDAO")
    AttachedDAO attachedDAO;

    @Transactional
    public void save(Attached attached){

    }

    @Transactional
    public void delete (Attached attached){

    }

    @Transactional
    public Attached getById(long id){
        return null;
    }

    @Transactional
    public List<Attached> getAll(){
        return null;
    }
}
