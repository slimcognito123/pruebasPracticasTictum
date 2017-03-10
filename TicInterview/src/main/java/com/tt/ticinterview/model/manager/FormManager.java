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

@Service
public class FormManager {

    @Autowired
    @Qualifier("FormDAO")
    FormDAO formDAO;

    @Transactional
    public void save(Form form){

    }

    @Transactional
    public void delete (Form form){

    }

    @Transactional
    public Form getById(long id){
        return null;
    }

    @Transactional
    public List<Form> getAll(){
        return null;
    }

}
