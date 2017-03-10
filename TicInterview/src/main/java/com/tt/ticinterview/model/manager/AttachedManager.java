package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.Interview.Attached;
import com.tt.ticinterview.model.dao.AttachedDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    AttachedDAO attachedDAO;

    public void save(Attached attached){
        try{
            attachedDAO.save(attached);
        }catch (Exception e){
            System.out.println("algo ha ido mal al guardar");
            System.err.println(e.getStackTrace());
        }
    }

    public void delete (Attached attached){
        try{
            attachedDAO.delete(attached);
        }catch (Exception e){
            System.out.println("algo ha ido mal al recibir");
            System.err.println(e.getStackTrace());
        }
    }

    public Attached getById(long id){
        return null;
    }

    public List<Attached> getAll(){
        return null;
    }
}
