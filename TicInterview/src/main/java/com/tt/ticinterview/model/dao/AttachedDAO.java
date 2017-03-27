/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Attached;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TictumTarde
 */

@Repository("AttachedDAO")
public class AttachedDAO extends CrudDAOImplementation<Attached>{

    @Override
    public void save(Attached object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Attached getById(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Attached> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
