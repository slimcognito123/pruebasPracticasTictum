package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.form.Form;
import old.tt.ticinterview.model.dao.FormDAO;
import java.util.ArrayList;
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
            System.out.println("form guardado");
            //formDAO.save(form);
        }catch (Exception e){
            System.err.println("ERROR save " + e);
        }

    }

    @Transactional
    public void delete (Form form){
        try{
            System.out.println("form guardado");
            //formDAO.delete(form);
        }catch(Exception e){
            System.err.println("ERROR delete " + e);
        }

    }

 
    public Form getById(long id){
        try{
            return new Form();
          //  return formDAO.getById(id);
        }catch (Exception e){
            System.err.println("ERROR getById " + e);
        }
        return null;
    }

 
    public List<Form> getAll(){
        try {
            return new ArrayList<>();
         //   return formDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e);
        }
        return null;
    }

}
