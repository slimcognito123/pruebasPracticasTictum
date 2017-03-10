package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Attached;
import com.tt.ticinterview.model.dao.AttachedDAO;
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
        try{
            attachedDAO.save(attached);
        }catch (Exception e){
            System.out.println("algo ha ido mal al guardar");
            System.err.println(e.getStackTrace());
        }
    }

    @Transactional
    public void delete (Attached attached){
        try{
            attachedDAO.delete(attached);
        }catch (Exception e){
            System.out.println("algo ha ido mal al recibir");
            System.err.println(e.getStackTrace());
        }
    }

    @Transactional
    public Attached getById(long id){
        return attachedDAO.getById(id);
    }

    @Transactional
    public List<Attached> getAll(){
        return attachedDAO.getAll();
    }
}
