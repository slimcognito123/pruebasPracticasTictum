package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.form.Form;
import com.tt.ticinterview.model.dao.FormDAO;
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

@Service("FormManager")
public class FormManager {

    @Autowired
    @Qualifier("FormDAO")
    private FormDAO formDAO;

    @Transactional
    public void save(Form form){
        try{
            formDAO.save(form);
        }catch (Exception e){
            System.err.println("ERROR save " + e);
        }

    }

    @Transactional
    public void delete (Form form){
        try{
            formDAO.delete(form);
        }catch(Exception e){
            System.err.println("ERROR delete " + e);
        }

    }

    @Transactional
    public Form getById(long id){
        try{
            return formDAO.getById(id);
        }catch (Exception e){
            System.err.println("ERROR getById " + e);
        }
        return null;
    }

    @Transactional
    public List<Form> getAll(){
        try {
            return formDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e);
        }
        return null;
    }

}
