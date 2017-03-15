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
 * @author tictumTarde - PNM - JRB
 * @version 0.1
 * @
 */

@Service
public class AttachedManager {

    @Autowired
    @Qualifier("AttachedDAO")
    private AttachedDAO attachedDAO;

    @Transactional
    public void save(Attached attached){
        try{
            attachedDAO.save(attached);
        }catch (Exception e){
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete (Attached attached){
        try{
            attachedDAO.delete(attached);
        }catch (Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public Attached getById(long id){
        try{
            return attachedDAO.getById(id);
        }catch (Exception e){
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<Attached> getAll(){
        try{
            return attachedDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }
}
