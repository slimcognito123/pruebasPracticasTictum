/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.user.Interviewer;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TictumTarde
 */
@Repository("InterviewerDAO")
public class InterviewerDAO extends BasicUserDAOInterface<Interviewer>{

    @Override
    public Interviewer getUserMail(String mail) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modify(Interviewer object) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Interviewer getById(Long id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Interviewer object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
